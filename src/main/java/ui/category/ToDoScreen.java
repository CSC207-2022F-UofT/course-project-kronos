package ui.category;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * -- User Interface Layer --
 * The To Do List view model to be loaded onto the screen when the user clicks "To Do" from the menu bar
 */

// screen should have the menu button on top left to lead back to menu page
public class ToDoScreen extends JFrame implements ActionListener {

    private JFrame toDoFrame;
    private JButton newTask;
    private JButton newCategory;

    public ToDoScreen() {
        toDoFrame = new JFrame ("To Do List");
        toDoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toDoFrame.setSize(1000, 800);
        toDoFrame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
