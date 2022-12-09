package ui.tasks;

import controllers.tasks.CreateTaskController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * -- UI --
 * The screen for creating a task
 */
public class CreateTaskScreen extends JFrame implements ActionListener {
    /**
     * The Controller
     */
    CreateTaskController createTaskController;

    /**
     * The input name of the task
     */
    JTextField nameField =  new JTextField(30);

    static final JFrame frame = new JFrame("Creating Task");

    /**
     * A window for creating a task.
     */
    public CreateTaskScreen(){
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        nameField.setHorizontalAlignment(JTextField.CENTER);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2));

        JLabel name = new JLabel("Enter Task Name", JLabel.CENTER);

        // Button 1: Create task
        JButton create = new JButton("Create");
        create.addActionListener(this);

        // Button 2: Cancel Creation
        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(this);

        JPanel buttons = new JPanel();
        buttons.add(create);
        buttons.add(cancel);

        frame.add(mainPanel);
        mainPanel.add(name);
        mainPanel.add(this.nameField);
        mainPanel.add(buttons);

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * React to a button click that result in e.
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click" + e.getActionCommand());
        if(e.getActionCommand().equals("Cancel")){
            frame.dispose();
        } else if (e.getActionCommand().equals("Create")) {
//            createTaskController.create(nameField.getText());
            JOptionPane.showMessageDialog(this,
                    "Task \"" + nameField.getText() + "\" is created." );
        }
    }

    public static void createScreen(){

        new CreateTaskScreen();

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CreateTaskScreen::createScreen);
    }
}