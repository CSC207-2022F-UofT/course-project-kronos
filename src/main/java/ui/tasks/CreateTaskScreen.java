//package ui.tasks;
//
//import controllers.tasks.CreateTaskController;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
///**
// * -- UI --
// *
// */
//public class CreateTaskScreen extends JFrame implements ActionListener {
//    /**
//     * The Controller
//     */
//    CreateTaskController createTaskController;
//    /**
//     * The input name of the task
//     */
//    JTextField name =  new JTextField(50);
//    /**
//     * The category of the task
//     */
//    JTextField category = new JTextField(30);
//    /**
//     * The deadline of the task
////     */
////    // How can I put deadline here?
////
////
////    /**
////     * A window with a title and a JButton.
////     * @param controller - the controller.
////     */
////    public CreateTaskScreen (CreateTaskController controller){
////
////        this.createTaskController = controller;
////
////        JLabel title = new JLabel("Editing Task");
////        title.setAlignmentX(Component.CENTER_ALIGNMENT);
////        LabelTextPanel taskNameInfo = new LabelTextPanel(
////                new JLabel("Task name"), name);
////        // LabelTextPanel deadlineInfo = new LabelTextPanel(new JLabel("Deadline"), deadline);
////
////        JButton create = new JButton("Create");
////        JButton cancel = new JButton("Cancel");
////
////        JPanel buttons = new JPanel();
////        buttons.add(create);
////        buttons.add(cancel);
////
////        create.addActionListener(this);
////        cancel.addActionListener(this);
////
////        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
////
////        this.add(title);
////        this.add(taskNameInfo);
////        // this.add(deadlineInfo);
////        this.add(buttons);
////
////    }
////
////    /**
////     * React to a button click that result in e.
////     * @param e the event to be processed
////     */
////    @Override
////    public void actionPerformed(ActionEvent e) {
////        System.out.println("Click" + e.getActionCommand());
////
////        try{
////            createTaskController.create(
////                    name.getText(),
////                    //deadline.getText();
////            );
////        } catch (Exception ex) {
////            JOptionPane.showMessageDialog(this, ex.getMessage());
////        }
////
////    }
////}
