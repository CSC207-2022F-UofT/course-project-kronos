package ui.category;

import controllers.category.CreateCategoryController;
import controllers.category.DeleteCategoryController;
import controllers.category.EditCategoryController;
import entities.Category;
import entities.CategoryCollection;
import entities.Task;
import ui.ColourPalette;
import use_cases.categories.edit_category.EditCategory;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryInputBoundary;
import use_cases.categories.edit_category.EditCategoryOutputBoundary;

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

    public ToDoScreen(CategoryCollection categories, CreateCategoryController createController,
                      EditCategoryOutputBoundary editCategoryPresenter, EditCategoryDsGateway editDsGateway,
                      DeleteCategoryController deleteController) {
        this.createController = createController;
        this.editCategoryPresenter = editCategoryPresenter;
        this.editDsGateway = editDsGateway;
        this.deleteController = deleteController;
        this.categories = categories;

        toDoFrame = new JFrame("To Do List");
        toDoFrame.setLocation(350, 80);
        toDoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toDoFrame.setSize(1000, 800);
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
        newCategory.setFont(new Font("Serif", Font.PLAIN, 20));
        newCategory.setBackground(Color.white);
        newCategory.setHorizontalAlignment(SwingConstants.CENTER);
        c.weightx = 0.3;
        c.gridx = 2;
        c.gridy = 1;
        header.add(newCategory, c);

        menu = new JButton("Menu");
        menu.setFont(new Font("Serif", Font.PLAIN, 20));
        menu.setBackground(Color.white);
        menu.setHorizontalAlignment(SwingConstants.CENTER);
        c.weightx = 0.3;
        c.gridx = 0;
        c.gridy = 1;
        header.add(menu, c);

        /**
         * Adding table headlining row for tasks
         */
        JLabel taskName = new JLabel("Task Name");
        taskName.setFont(new Font("Serif", Font.BOLD, 20));
        taskName.setHorizontalAlignment(SwingConstants.CENTER);
        c.insets = new Insets(20, 0, 0, 0);
        c.ipady = 2;
        c.weightx = 0.3;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 2;
        header.add(taskName, c);

        JLabel deadline = new JLabel("  Deadline");
        deadline.setFont(new Font("Serif", Font.BOLD, 20));
        deadline.setHorizontalAlignment(SwingConstants.CENTER);
        c.ipady = 2;
        c.weightx = 0.3;
        c.gridx = 1;
        c.gridy = 2;
        header.add(deadline, c);

        JLabel completion = new JLabel("Completion");
        completion.setFont(new Font("Serif", Font.BOLD, 20));
        completion.setHorizontalAlignment(SwingConstants.CENTER);
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
        // loop through all the categories
        // for each category, loop through the task collection
        // update the body panel so that the name of the category (column 0) and add a button to the right most column for newTask button

        int y = 4;
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
                taskName.setHorizontalAlignment(SwingConstants.CENTER);
                this.body.add(taskName, c);

                c.gridx = 1;
                c.weightx = 0.3;
                c.gridy = y;
                SimpleDateFormat formatter=new SimpleDateFormat("DD-MMM-yyyy");
                String date = formatter.format(task.getDeadline().getTime());
                JLabel deadline = new JLabel(date);
                deadline.setFont(new Font("Serif", Font.PLAIN, 16));
                deadline.setHorizontalAlignment(SwingConstants.CENTER);
                this.body.add(deadline, c);

                c.gridx = 2;
                c.weightx = 0.3;
                c.gridy = y;
                JCheckBox checkbox = new JCheckBox(new CheckTask());
                checkbox.setHorizontalAlignment(SwingConstants.CENTER);
                this.body.add(checkbox, c);
                y++;
            }
            // add the newTask button
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 1;
            c.gridy = y;
            newTask = new JButton(cat.getId() + ": New Task");
            newTask.setSize(8, 8);
            newTask.setBackground(Color.white);
            this.body.add(newTask, c);
            y++;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newCategory){
            System.out.println("yes");
            CreateCategoryScreen newCategory = new CreateCategoryScreen(createController);
        }
        if (e.getSource() == menu){
            // new Menu(); leads to menu page, still needs to be implemented
        }
        if (e.getSource() == newTask){ // will this track the right button since we create it multiple times?
            int id = Integer.parseInt(newTask.getText().split(":")[0]);
            Category cat = categories.getItem(id);
            // how to update the task collection in this Category? --> need to update the database
            // new CreateTask(cat.getTasks());
        }

        // what if someone clicks the edit button
        if (e.getSource() == edit){
            // how to get the specific category that button belongs to? how to associate these two objects?
            int id = Integer.parseInt(edit.getText().split(":")[0]);
            Category cat = categories.getItem(id);
            EditCategoryInputBoundary editCategory = new EditCategory(editCategoryPresenter, editDsGateway, categories, id);
            EditCategoryController editController = new EditCategoryController(editCategory);
            CategoryScreen categoryDetails = new CategoryScreen(editController, deleteController, id, cat.getName(), cat.getColour()); // how does this lead to next window
        }

    }

}
