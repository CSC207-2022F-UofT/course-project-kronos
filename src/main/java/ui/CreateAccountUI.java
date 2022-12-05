//package ui;
//
//import controllers.users.CreateUserController;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
///**
// * UI for the Create Account Page. By the actions of the buttons, the page will either be directed to the
// * Login user
// * @author happynasit
// */
//public class CreateAccountUI extends JFrame implements ActionListener {
//    /**
//     * Constructor for the CreateAccountUI class
//     * sets the labels, buttons and the text field to enter the user information.
//     */
//
//    static JTextField firstNameField = new JTextField();
//
//    static JTextField lastNameField = new JTextField();
//
//    static JTextField emailAddressField = new JTextField();
//
//    static JTextField passwordField = new JTextField();
//
//    static JTextField repeatPasswordField = new JTextField();
//
//    CreateUserController createUserController;
//    public CreateAccountUI(CreateUserController controller){
//        this.createUserController = controller;
//        this.setTitle("Sign Up");
//        this.setSize(600, 320);
//        this.setVisible(true);
//
//    }
//
//    public static void main(){
//
//
//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainFrame.setVisible(true);
//
//        // labels for the page
//        JLabel firstNameLabel = new JLabel("First Name:");
//        firstNameLabel.setBounds(10,0, 150,70);
//
//        JLabel lastNameLabel = new JLabel("Last Name:");
//        lastNameLabel.setBounds(10,30, 150,70);
//
//        JLabel emailLabel = new JLabel("Email Address:");
//        emailLabel.setBounds(10,60, 150,70);
//
//        JLabel pinLabel = new JLabel("Password:");
//        pinLabel.setBounds(10, 90, 150, 70);
//
//        JLabel repeatPinLabel = new JLabel("Repeat Password:");
//        repeatPinLabel.setBounds(10, 120, 150, 70);
//
//        // fields for the page
//
//        firstNameField.setBounds(160, 20, 300, 35);
//
//
//        lastNameField.setBounds(160, 50, 300, 35);
//
//        emailAddressField.setBounds(160, 80, 300, 35);
//
//
//        passwordField.setBounds(160, 110, 300, 35);
//
//
//        repeatPasswordField.setBounds(160, 140, 300, 35);
//
//        // buttons for the page
//        JButton backButton = new JButton("Back to Login Page");
//        backButton.setBounds(140, 200, 300, 35);
//
//
//
//        JButton createAccountButton = new JButton("Create Account!");
//        createAccountButton.setBounds(140, 230, 300, 35);
//
//
//        // Panel and adding the labels, buttons and the text fields to the panel
//        JPanel Panel = new JPanel();
//        Panel.setLayout(null);
//
//        Panel.add(firstNameLabel);
//        Panel.add(lastNameLabel);
//        Panel.add(emailLabel);
//        Panel.add(pinLabel);
//        Panel.add(repeatPinLabel);
//
//        Panel.add(firstNameField);
//        Panel.add(lastNameField);
//        Panel.add(emailAddressField);
//        Panel.add(passwordField);
//        Panel.add(repeatPasswordField);
//
//
//        Panel.add(backButton);
//        Panel.add(createAccountButton);
//
//        mainFrame.add(Panel);
//        // it shows the visibility
//        mainFrame.setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent evt) {
//        System.out.println("Click " + evt.getActionCommand());
//
//        try {
//            createUserController.create(firstNameField.getText(),
//                    lastNameField.getText(),emailAddressField.getText(), passwordField.getText(),
//                    repeatPasswordField.getText());
//            JOptionPane.showMessageDialog(this, "%s created."+ emailAddressField.getText());
//
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
//    }
//}
