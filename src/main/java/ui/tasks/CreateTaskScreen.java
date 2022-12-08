package ui.tasks;

import controllers.tasks.CreateTaskController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * -- UI --
 *
 */
public class CreateTaskScreen extends JFrame implements ActionListener {
    /**
     * The Controller
     */
    CreateTaskController createTaskController;
    /**
     * The input name of the task
     */
    JTextField name =  new JTextField(15);

    /**
     * A window with a title and a JButton.
     */
    public CreateTaskScreen (){
        JFrame frame = new JFrame("Creating Task");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 0));


        JPanel panel  = new JPanel();
        panel.setSize(new Dimension(250, 50));

        JLabel name = new JLabel("Task Name", JLabel.CENTER);
        name.setPreferredSize(new Dimension(100, 30));
        name.setLayout(new BorderLayout());


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
        mainPanel.add(buttons);
        name.add(this.name);

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
        try{
            createTaskController.create(name.getText());
            JOptionPane.showMessageDialog(this, name.getText() + "/%s created." );

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    public static void createScreen(){

        new CreateTaskScreen();

    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(CreateTaskScreen::createScreen);
    }
}
