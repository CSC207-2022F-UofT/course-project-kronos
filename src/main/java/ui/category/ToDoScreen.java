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

// have to use mark_task_completion

/**
 * -- User Interface Layer --
 * The To Do List view model to be loaded onto the screen when the user clicks "To Do" from the menu bar
 */

// screen should have the menu button on top left to lead back to menu page
public class ToDoScreen extends JFrame implements ActionListener {

    private JFrame toDoFrame;
    private CategoryCollection categories;
    private JPanel header;
    private JScrollPane scrollable;
    private JPanel body;
    private static JLabel title;
    private JButton newCategory;
    private JButton menu;
    private JButton edit;
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
        toDoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toDoFrame.setSize(1000, 800);
        toDoFrame.setLayout(new BorderLayout());
        toDoFrame.setVisible(true);

        header = new JPanel();
        header.setLayout(new GridBagLayout());

        body = new JPanel();
        body.setLayout(new GridBagLayout());

        scrollable = new JScrollPane();
        toDoFrame.add(scrollable, BorderLayout.CENTER);
        scrollable.add(body);

        toDoFrame.add(header, BorderLayout.NORTH);

        GridBagConstraints c = new GridBagConstraints();

        /**
         * Creating and setting the placement of the title
         */
        title = new JLabel("To Do List");
        c.gridwidth = 3;
        c.ipady = 20;
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        header.add(title, c);

        /**
         * Creating and setting the placement of the "create" button and menu button
         */

        newCategory = new JButton("New Category");
        c.gridwidth = 1;
        c.ipady = 1;
        c.gridx = 2;
        c.gridy = 0;
        header.add(newCategory, c);

        menu = new JButton("Menu");
        c.ipady = 1;
        c.gridx = 0;
        c.gridy = 0;
        header.add(menu, c);

        /**
         * Adding table headlining row for tasks
         */
        JLabel taskName = new JLabel("Task Name");
        c.ipady = 2;
        c.gridx = 0;
        c.gridy = 0;
        header.add(taskName, c);

        JLabel deadline = new JLabel("Deadline");
        c.ipady = 2;
        c.gridx = 1;
        c.gridy = 0;
        header.add(deadline, c);

        JLabel completion = new JLabel("Completion");
        c.ipady = 2;
        c.gridx = 2;
        c.gridy = 0;
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

        int y = 3;
        for (Integer id: categories.categories.keySet()) {
            Category cat = categories.getItem(id);
            Color colour = ColourPalette.getColour(cat.getColour()); // to display
            // new constraints for gridlayout
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = y;
            c.fill = GridBagConstraints.HORIZONTAL;
            edit = new JButton(cat.getId() + ": " + cat.getName());
            edit.setAlignmentX(Component.LEFT_ALIGNMENT);
            this.body.add(edit, c);
            y++;

            // loop through all the tasks in this category
            for (Task task: cat.getTasks().convertToArray()){
                c.gridwidth = 1;
                c.gridx = 0;
                c.gridy = y;
                this.body.add(new JLabel(task.getName()), c);
                y++;
                c.gridx = 1;
                c.gridy = y;
                this.body.add(new JLabel(task.getDeadline().toString()), c);
                y++;
                c.gridx = 2;
                c.gridy = y;
                this.body.add(new JCheckBox(new CheckTask()), c);
                y++;
            }
            // add the newTask button
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridy = y;

            this.body.add(new JButton("New Task for " + cat.getName()), c);
            y++;
        }
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == newCategory){
            new CreateCategoryScreen(createController);
        }
        if (evt.getSource() == menu){
            // new Menu(); leads to menu page, still needs to be implemented
        }
        // what if newTask button is clicked

        // what if someone clicks the edit button
        if (evt.getSource() == edit){
            // how to get the specific category that button belongs to? how to associate these two objects?
            int id = Integer.parseInt(edit.getText().split(":")[0]);
            Category cat = categories.getItem(id);
            EditCategoryInputBoundary editCategory = new EditCategory(editCategoryPresenter, editDsGateway, categories, id);
            EditCategoryController editController = new EditCategoryController(editCategory);
            new CategoryScreen(editController, deleteController, id, cat.getName(), cat.getColour());
        }

    }

}
