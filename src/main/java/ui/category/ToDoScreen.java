package ui.category;

import controllers.category.CreateCategoryController;
import controllers.category.DeleteCategoryController;
import controllers.category.EditCategoryController;
import controllers.tasks.CreateTaskController;
import controllers.tasks.MarkCompletionController;
import entities.Category;
import entities.CategoryCollection;
import entities.Task;
import entities.TaskFactory;
import ui.ColourPalette;
import ui.tasks.CreateTaskScreen;
import ui.tasks.EditTaskScreen;
import ui.tasks.TaskScreen;
import ui.user.MenuPage;
import use_cases.categories.edit_category.EditCategory;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryInputBoundary;
import use_cases.categories.edit_category.EditCategoryOutputBoundary;
import use_cases.tasks.create_task.CreateTask;
import use_cases.tasks.create_task.CreateTaskDsGateway;
import use_cases.tasks.create_task.CreateTaskInputBoundary;
import use_cases.tasks.create_task.CreateTaskOutputBoundary;
import use_cases.tasks.mark_task_completion.MarkCompletionDsGateway;
import use_cases.tasks.mark_task_completion.MarkCompletionInputBound;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputBound;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

// have to use mark_task_completion

/**
 * -- User Interface Layer --
 * The To Do List view model to be loaded onto the screen when the user clicks "To Do" from the menu bar
 */

// screen should have the menu button on top left to lead back to menu page
public class ToDoScreen extends JFrame implements ActionListener {
    private JFrame toDoFrame;
    private JPanel header;
    private JPanel body;
    private static JLabel title;
    private CategoryCollection categories;
    private CreateCategoryController createController;
    private EditCategoryOutputBoundary editCategoryPresenter;
    private EditCategoryDsGateway editDsGateway;
    private DeleteCategoryController deleteController;
    private CreateTaskDsGateway taskDsGateway;
    private CreateTaskOutputBoundary outputBoundary;
    private HashMap<TaskFactory, Integer> completedTasks;
    private HashMap<JCheckBox, ArrayList<Integer>> allCheckBoxes = new HashMap<JCheckBox, ArrayList<Integer>>(); // id of cat @ index 0, id of task @ index 1

    public ToDoScreen(CategoryCollection categories, CreateCategoryController createController,
                      EditCategoryOutputBoundary editCategoryPresenter, EditCategoryDsGateway editDsGateway,
                      DeleteCategoryController deleteController, CreateTaskOutputBoundary outputBoundary,
                      CreateTaskDsGateway taskDsGateway, MarkCompletionDsGateway markTaskGateway,
                      MarkCompletionOutputBound markOutputBound) {
        // long parameter code smell, unable to resolve

        this.createController = createController;
        this.editCategoryPresenter = editCategoryPresenter;
        this.editDsGateway = editDsGateway;
        this.deleteController = deleteController;
        this.categories = categories;
        this.outputBoundary = outputBoundary;
        this.taskDsGateway = taskDsGateway;

        toDoFrame = new JFrame("To Do List");
        toDoFrame.setLocation(550, 100);
        toDoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toDoFrame.setSize(600, 800);
        toDoFrame.setLayout(new BorderLayout());
        toDoFrame.setVisible(true);

        header = new JPanel();
        header.setLayout(new GridBagLayout());
        header.setVisible(true);

        body = new JPanel();
        body.setLayout(new GridBagLayout());
        body.setVisible(true);

        // adding panels to frame
        toDoFrame.add(body, BorderLayout.CENTER);
        toDoFrame.add(header, BorderLayout.NORTH);

        GridBagConstraints c = new GridBagConstraints();

        /**
         * Creating and setting the placement of the title
         */
        title = new JLabel("To Do List");
        title.setFont(new Font("Serif", Font.BOLD, 35));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        c.ipady = 20;
        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        header.add(title, c);

        /**
         * Creating and setting the placement of the "create" button and menu button
         */
        JButton newCategory = new JButton("New Category");
        newCategory.setFont(new Font("Serif", Font.PLAIN, 15));
        newCategory.setBackground(Color.white);
        newCategory.setHorizontalAlignment(SwingConstants.CENTER);
        c.weightx = 0.3;
        c.ipady = 0;
        c.gridx = 2;
        c.gridy = 1;
        header.add(newCategory, c);
        newCategory.addActionListener(e -> CreateCategoryScreen.loadScreen(createController));

        JButton menu = new JButton("Menu");
        menu.setFont(new Font("Serif", Font.PLAIN, 15));
        menu.setBackground(Color.white);
        menu.setHorizontalAlignment(SwingConstants.CENTER);
        c.weightx = 0.3;
        c.gridx = 0;
        c.gridy = 1;
        header.add(menu, c);
        menu.addActionListener(e -> MenuPage.createmenu()); // ? This doesn't work

        /**
         * Adding table headlining row for tasks
         */
        JLabel taskName = new JLabel("Task Name");
        taskName.setFont(new Font("Serif", Font.BOLD, 20));
        taskName.setHorizontalAlignment(SwingConstants.LEFT);
        c.insets = new Insets(20, 0, 0, 0);
        c.ipady = 2;
        c.weightx = 0.3;
        c.gridx = 2;
        c.gridy = 2;
        header.add(taskName, c);

        JLabel completion = new JLabel("Completion");
        completion.setFont(new Font("Serif", Font.BOLD, 20));
        completion.setHorizontalAlignment(SwingConstants.RIGHT);
        c.ipady = 2;
        c.weightx = 0.3;
        c.gridx = 0;
        c.gridy = 2;
        header.add(completion, c);
        updateList();

        /**
         * If window closes, need to check which tasks are checked off
         */
        toDoFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                completedTasks = new HashMap<TaskFactory, Integer>();
                // store all the tasks that are marked as completed when the window closes
                for (JCheckBox check: allCheckBoxes.keySet()) {
                    if (check.isSelected()) {
                        ArrayList<Integer> temp = allCheckBoxes.get(check);
                        Category tempCat = categories.getItem(temp.get(0));
                        completedTasks.put(tempCat.getTasks(), temp.get(1));
                    }
                }
                new CheckTask(markTaskGateway, markOutputBound, completedTasks);
            }
        });
    }

    /**
     * Updates the to do list to reflect the database's information
     */
    public void updateList() {
        int y = 1;
        for (Integer id: categories.categories.keySet()) {
            Category cat = categories.getItem(id);
            // new constraints for gridlayout
            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(30, 5, 5, 5);
            c.gridwidth = 3;
            c.gridx = 0;
            c.gridy = y;
            c.fill = GridBagConstraints.HORIZONTAL;

            JButton edit = new JButton(cat.getId() + ": " + cat.getName());
            edit.setFont(new Font("Serif", Font.BOLD, 20));
            edit.setBackground(ColourPalette.getColour(cat.getColour()));
            edit.setForeground(Color.white);
            edit.setAlignmentX(Component.LEFT_ALIGNMENT);
            this.body.add(edit, c);
            EditCategoryInputBoundary editCategory = new EditCategory(editCategoryPresenter, editDsGateway, categories, id);
            EditCategoryController editController = new EditCategoryController(editCategory);
            int tempId = Integer.parseInt(edit.getText().split(":")[0]);
            Category tempCat = categories.getItem(tempId);
            edit.addActionListener(e -> CategoryScreen.loadScreen(editController, deleteController, tempId, tempCat.getName(), tempCat.getColour()));

            // resetting for the tasks for loop
            y++;
            c.gridwidth = 1;
            c.insets = new Insets(5, 0, 0, 0);

            // loop through all the tasks in this category
            for (Task task: cat.getTasks().convertToArray()){
                c.gridwidth = 1;
                c.weightx = 0.3;
                c.gridx = 2;
                c.gridy = y;
                JButton taskName = new JButton(task.getName());
                taskName.setFont(new Font("Serif", Font.PLAIN, 16));
                taskName.setBackground(Color.white);
                taskName.setHorizontalAlignment(SwingConstants.LEFT);
                this.body.add(taskName, c);
                taskName.addActionListener(e -> TaskScreen.createScreen());

                c.gridx = 0;
                c.weightx = 0.3;
                c.gridy = y;
                JCheckBox checkbox = new JCheckBox();
                checkbox.setHorizontalAlignment(SwingConstants.RIGHT);
                this.body.add(checkbox, c);
                y++;

                ArrayList<Integer> ids = new ArrayList<>();
                ids.add(cat.getId());
                ids.add(task.getId());
                allCheckBoxes.put(checkbox, ids);
            }

            // add the newTask button
            c.fill = GridBagConstraints.HORIZONTAL;
            c.insets = new Insets(10, 10, 10, 10);
            c.gridx = 1;
            c.gridy = y;
            JButton newTask = new JButton(cat.getId() + ": New Task");
            newTask.setBackground(Color.white);
            this.body.add(newTask, c);

            int taskCatId = Integer.parseInt(newTask.getText().split(":")[0]);
            Category taskCat = categories.getItem(taskCatId);
            CreateTaskInputBoundary taskGateway = new CreateTask(outputBoundary, taskDsGateway, taskCat.getTasks());
            CreateTaskController taskController = new CreateTaskController(taskGateway);
            newTask.addActionListener(e -> CreateTaskScreen.createScreen());

            y++;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
