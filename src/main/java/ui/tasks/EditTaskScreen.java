/*
package ui.tasks;

import controllers.tasks.EditTaskController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditTaskScreen extends JPanel implements ActionListener {
    */
/**
     * The Controller
     *//*

    EditTaskController editTaskController;
    */
/**
     * The input name of the task
     *//*

    JTextField name =  new JTextField(50);
    */
/**
     * The category of the task
     *//*

    JTextField category = new JTextField(30);
    */
/**
     * The deadline of the task
     *//*

    // How can I put deadline here?

    */
/**
     * A window with a title and a JButton.
     * @param controller - the controller.
     *//*

    public EditTaskScreen (EditTaskController controller){

        this.editTaskController = controller;

        JLabel title = new JLabel("Editing Task");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        LabelTextPanel taskNameInfo = new LabelTextPanel(
                new JLabel("Task name"), name);
        LabelTextPanel categoryInfo = new LabelTextPanel(new JLabel("Category"), category);
        // LabelTextPanel deadlineInfo = new LabelTextPanel(new JLabel("Deadline"), deadline);

        JButton save = new JButton("Save");
        JButton cancel = new JButton("Cancel");

        JPanel buttons = new JPanel();
        buttons.add(save);
        buttons.add(cancel);

        save.addActionListener(this);
        cancel.addActionListener(this);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(title);
        this.add(taskNameInfo);
        this.add(categoryInfo);
        // this.add(deadlineInfo);
        this.add(buttons);


    }

    */
/**
     * React to a button click that result in e.
     * @param e the event to be processed
     *//*

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click" + e.getActionCommand());

        try{
            editTaskController.edit(
                    // id
                    name.getText(),
                    category.getText(),
                    //deadline.getText();
            );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }
}*/
