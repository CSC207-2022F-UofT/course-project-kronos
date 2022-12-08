package ui.category;

import controllers.category.CreateCategoryController;
import controllers.category.DeleteCategoryController;
import controllers.category.EditCategoryController;
import controllers.tasks.CreateTaskController;
import entities.Category;
import entities.CategoryCollection;
import entities.Task;
import ui.ColourPalette;
import ui.tasks.CreateTaskScreen;
import ui.user.MenuPage;
import use_cases.categories.edit_category.EditCategory;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryInputBoundary;
import use_cases.categories.edit_category.EditCategoryOutputBoundary;
import use_cases.tasks.create_task.CreateTask;
import use_cases.tasks.create_task.CreateTaskDsGateway;
import use_cases.tasks.create_task.CreateTaskInputBoundary;
import use_cases.tasks.create_task.CreateTaskOutputBoundary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

// have to use mark_task_completion

/**
 * -- User Interface Layer --
 * The To Do List view model to be loaded onto the screen when the user clicks "To Do" from the menu bar
 */

// screen should have the menu button on top left to lead back to menu page
public class ToDoScreen extends JFrame implements ActionListener {
    private JFrame toDoFrame;
    private JPanel header;
    private JScrollPane scrollable;
    private JPanel body;
    private static JLabel title;
    private JButton newCategory;
    private JButton menu;
    private JButton edit;
    private JButton newTask;
    private CategoryCollection categories;
    private CreateCategoryController createController;
    private EditCategoryOutputBoundary editCategoryPresenter;
    private EditCategoryDsGateway editDsGateway;
    private DeleteCategoryController deleteController;
    private CreateTaskDsGateway taskDsGateway;
    private CreateTaskOutputBoundary outputBoundary;


    public ToDoScreen(CategoryCollection categories, CreateCategoryController createController,
                      EditCategoryOutputBoundary editCategoryPresenter, EditCategoryDsGateway editDsGateway,
                      DeleteCategoryController deleteController, CreateTaskOutputBoundary outputBoundary,
                      CreateTaskDsGateway taskDsGateway) {
        this.createController = createController;
        this.editCategoryPresenter = editCategoryPresenter;
        this.editDsGateway = editDsGateway;
        this.deleteController = deleteController;
        this.categories = categories;
        this.outputBoundary = outputBoundary;
        this.taskDsGateway = taskDsGateway;

        toDoFrame = new JFrame("To Do List");
        toDoFrame.setLocation(650, 80);
        toDoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toDoFrame.setSize(800, 800);
        toDoFrame.setLayout(new BorderLayout());
        toDoFrame.setVisible(true);

        header = new JPanel();
        header.setLayout(new GridBagLayout());
        header.setVisible(true);

        body = new JPanel();
        body.setLayout(new GridBagLayout());
        body.setVisible(true);

        // adding panels to frame
        scrollable = new JScrollPane();
        // toDoFrame.add(scrollable, BorderLayout.CENTER);
        toDoFrame.add(body, BorderLayout.CENTER);
        //scrollable.add(body);
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
        newCategory = new JButton("New Category");
        newCategory.setFont(new Font("Serif", Font.PLAIN, 15));
        newCategory.setBackground(Color.white);
        newCategory.setHorizontalAlignment(SwingConstants.CENTER);
        c.weightx = 0.3;
        c.ipady = 0;
        c.gridx = 2;
        c.gridy = 1;
        header.add(newCategory, c);
        newCategory.addActionListener(e -> CreateCategoryScreen.loadScreen(createController));

        menu = new JButton("Menu");
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
        taskName.setHorizontalAlignment(SwingConstants.RIGHT);
        c.insets = new Insets(20, 0, 0, 0);
        c.ipady = 2;
        c.weightx = 0.3;
        c.gridx = 0;
        c.gridy = 2;
        header.add(taskName, c);

        JLabel completion = new JLabel("Completion");
        completion.setFont(new Font("Serif", Font.BOLD, 20));
        completion.setHorizontalAlignment(SwingConstants.LEFT);
        c.ipady = 2;
        c.weightx = 0.3;
        c.gridx = 2;
        c.gridy = 2;
        header.add(completion, c);
        updateList();
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

            edit = new JButton(cat.getId() + ": " + cat.getName());
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
                c.gridx = 0;
                c.gridy = y;
                JLabel taskName = new JLabel(task.getName());
                taskName.setFont(new Font("Serif", Font.PLAIN, 16));
                taskName.setHorizontalAlignment(SwingConstants.RIGHT);
                this.body.add(taskName, c);

                c.gridx = 2;
                c.weightx = 0.3;
                c.gridy = y;
                CheckTask checkTask = new CheckTask();
                JCheckBox checkbox = new JCheckBox(checkTask);
                checkbox.setHorizontalAlignment(SwingConstants.LEFT);
                this.body.add(checkbox, c);
                y++;
            }
            // add the newTask button
            c.fill = GridBagConstraints.HORIZONTAL;
            c.insets = new Insets(10, 10, 10, 10);
            c.gridx = 1;
            c.gridy = y;
            newTask = new JButton(cat.getId() + ": New Task");
            newTask.setBackground(Color.white);
            this.body.add(newTask, c);

            int taskCatId = Integer.parseInt(newTask.getText().split(":")[0]);
            Category taskCat = categories.getItem(taskCatId);
            CreateTaskInputBoundary taskGateway = new CreateTask(outputBoundary, taskDsGateway, taskCat.getTasks());
            CreateTaskController taskController = new CreateTaskController(taskGateway);
            newTask.addActionListener(e -> CreateTaskScreen.loadScreen(taskController, taskCatId));

            y++;
        }
    }

    // probs delete this later
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newTask){ // will this track the right button since we create it multiple times?
            // pass the category to the new Task screen

        }
        if (e.getSource() == edit){
            int id = Integer.parseInt(edit.getText().split(":")[0]);
            Category cat = categories.getItem(id);
            EditCategoryInputBoundary editCategory = new EditCategory(editCategoryPresenter, editDsGateway, categories, id);
            EditCategoryController editController = new EditCategoryController(editCategory);
            new CategoryScreen(editController, deleteController, id, cat.getName(), cat.getColour()); // how does this lead to next window
        }

    }

}
