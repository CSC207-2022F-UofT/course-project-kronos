package ui.tasks;

import entities.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * -- Frameworks & Drivers Layer --
 */
public class TaskScreen extends JPanel implements ActionListener {
    /**
     * The chosen task. This task is accessed from the database.
     */
    Task task;

    static final JFrame frame = new JFrame("Task");

    /**
     * A window with a title and two JButton.
     */
    public TaskScreen (Task task){
        this.task = task;

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(350,150));
        mainPanel.setLayout(new GridLayout(2, 2));

        JLabel name = new JLabel(task.getName(), JLabel.CENTER);
        name.setFont(new Font("Ariel", Font.PLAIN, 18));

        // Button 1: Edit
        JButton edit = new JButton("Edit");
        edit.addActionListener(this);
        edit.setPreferredSize(new Dimension(100, 40));
        edit.setFont(new Font("Ariel", Font.BOLD, 13));

        // Button 2: Delete
        JButton delete = new JButton("Delete");
        delete.addActionListener(this);
        delete.setPreferredSize(new Dimension(100, 40));
        delete.setFont(new Font("Ariel", Font.BOLD, 13));

        JPanel buttons = new JPanel();
        buttons.add(edit);
        buttons.add(delete);

        frame.add(mainPanel);
        mainPanel.add(name);
        mainPanel.add(buttons);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * React to a button click that result in e.
     * @param evt the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Click" + evt.getActionCommand());
        if(evt.getActionCommand().equals("Edit")){
            frame.dispose();
            SwingUtilities.invokeLater(EditTaskScreen::createScreen);
        } else if (evt.getActionCommand().equals("Delete")) {
//            createTaskController.create(nameField.getText());
            JOptionPane.showMessageDialog(this,"Task \"" + task.getName() + "\" is deleted." );
            frame.dispose();
        }
    }

    public static void createScreen(){
        new TaskScreen(new Task("Review CSC207"));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TaskScreen::createScreen);
    }



}