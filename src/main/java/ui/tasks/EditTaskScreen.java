package ui.tasks;

import controllers.tasks.EditTaskController;
import entities.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * -- Frameworks & Drivers Layer --
 */
public class EditTaskScreen extends JFrame implements ActionListener {
    /**
     * The Controller
     */
    EditTaskController controller;
    /**
     * The chosen task. Accessed from database.
     */
    public Task task;
    /**
     * The input name of the task
     */
    JTextField nameField =  new JTextField(30);

    static final JFrame frame = new JFrame("Editing");

    public EditTaskScreen (Task task){
        this.task = task;

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nameField.setFont(new Font("Ariel", Font.PLAIN, 15));

        nameField.setHorizontalAlignment(JTextField.CENTER);
        Font defaultFont = nameField.getFont();
        nameField.setFont(new Font(defaultFont.getFontName(), defaultFont.getStyle(),defaultFont.getSize() + 5));

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(350,200));
        mainPanel.setLayout(new GridLayout(4, 1));

        JLabel oldName = new JLabel("Current Name: " + task.getName(), JLabel.CENTER);
        oldName.setFont(new Font("Ariel", Font.PLAIN, 18));

        JLabel inputName = new JLabel("Enter New Name", JLabel.CENTER);
        inputName.setFont(new Font("Ariel", Font.PLAIN, 16));

        // Button 1: Save changes
        JButton save = new JButton("Save");
        save.addActionListener(this);
        save.setPreferredSize(new Dimension(100, 40));
        save.setFont(new Font("Ariel", Font.BOLD, 13));

        // Button 2: Cancel edition
        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        cancel.setPreferredSize(new Dimension(100, 40));
        cancel.setFont(new Font("Ariel", Font.BOLD, 13));

        JPanel buttons = new JPanel();
        buttons.add(save);
        buttons.add(cancel);

        frame.add(mainPanel);
        mainPanel.add(oldName);
        mainPanel.add(inputName);
        mainPanel.add(nameField);
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
        if(evt.getActionCommand().equals("Cancel")){
            frame.dispose();
        } else if (evt.getActionCommand().equals("Save")) {
//            createTaskController.create(nameField.getText());
            JOptionPane.showMessageDialog(this,"Changes saved." );
            frame.dispose();
        }
    }

    public static void createScreen(){
        new EditTaskScreen(new Task("Review CSC207"));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(EditTaskScreen::createScreen);
    }

}
