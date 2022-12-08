package ui.tasks;

import controllers.tasks.CreateTaskController;
import ui.category.CategoryScreen;

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
    JTextField name =  new JTextField(30);
    /**
     * The category of the task
     */
    JTextField category = new JTextField(30);
    /**
     * The deadline of the task
     */
    // How can I put deadline here?
    JFrame taskFrame;


    /**
     * A window with a title and a JButton.
     * @param controller - the controller.
     */
    public CreateTaskScreen (CreateTaskController controller, int catId){
        taskFrame = new JFrame();
        this.createTaskController = controller;
        taskFrame.setSize(400, 200);
        taskFrame.setLocation(700, 200);

        JLabel title = new JLabel("Editing Task");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        JPanel taskNameInfo = new JPanel();
        taskNameInfo.add(new JLabel("Task name"));
        taskNameInfo.add(name);
        // LabelTextPanel deadlineInfo = new LabelTextPanel(new JLabel("Deadline"), deadline);

        JButton create = new JButton("Create");
        JButton cancel = new JButton("Cancel");

        JPanel buttons = new JPanel();
        buttons.add(create);
        buttons.add(cancel);

        create.addActionListener(this);
        cancel.addActionListener(this);

        GridLayout layout = new GridLayout(3, 1);
        taskFrame.setLayout(layout);

        taskFrame.add(title);
        taskFrame.add(taskNameInfo);
        // this.add(deadlineInfo);
        taskFrame.add(buttons);

    }

    public static void loadScreen(CreateTaskController controller, int catId) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateTaskScreen taskScreen = new CreateTaskScreen(controller, catId);
                taskScreen.taskFrame.setVisible(true);
                taskScreen.taskFrame.setVisible(true);
            }
        });
    }

    /**
     * React to a button click that result in e.
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click" + e.getActionCommand());

        /*try{
            createTaskController.create(
                    name.getText(),
                    //deadline.getText();
            );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }*/

    }
}