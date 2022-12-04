package ui.category;

import entities.Category;
import entities.CategoryCollection;
import entities.Task;
import ui.ColourPalette;

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
    private JScrollPane body;
    private static JLabel title;
    private JButton newCategory;
    private JButton menu;

    public ToDoScreen(CategoryCollection categories) {
        this.categories = categories;
        toDoFrame = new JFrame("To Do List");
        toDoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toDoFrame.setSize(1000, 800);
        toDoFrame.setLayout(new BorderLayout());

        header = new JPanel();
        header.setLayout(new GridBagLayout());

        body = new JScrollPane();
        body.setLayout(new GridBagLayout());

        toDoFrame.add(header, BorderLayout.NORTH);
        toDoFrame.add(body, BorderLayout.CENTER);

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

        newCategory = new JButton("New Category");

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
            Color colour = ColourPalette.getColour(cat.getColour());
            // new constraints for gridlayout
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = y;
            c.fill = GridBagConstraints.HORIZONTAL;
            this.body.add(new JLabel(cat.getName()), c);
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


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
