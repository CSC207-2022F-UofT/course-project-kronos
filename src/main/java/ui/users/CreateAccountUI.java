package ui;

import controllers.users.CreateUserController;
import controllers.users.LoginUserController;
import entities.CommonUser;
import use_cases.user.create_user.CreateUserInputData;
import use_cases.user.create_user.CreateUserOutputData;
import use_cases.user.login_user.LoginUserDsGateway;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * UI for the Create Account Page. By the actions of the buttons, the page will either be directed to the
 * Login user
 * @author happynasit
 */
public class CreateAccountUI extends JFrame implements ActionListener {
    /**
     * Constructor for the CreateAccountUI class
     * sets the labels, buttons and the text field to enter the user information.
     */

    static JTextField firstNameField = new JTextField();
    static JTextField lastNameField = new JTextField();
    static JTextField emailAddressField = new JTextField();
    static JTextField passwordField = new JTextField();
    static JTextField repeatPasswordField = new JTextField();
    static JFrame mainframe = new JFrame();

    final LoginUserController loginUserController;
    final LoginUserDsGateway loginUserGateway;

    CreateUserController createUserController;

    /**
     * Constructor method for creating the UI
     * @param controller - of the create account use case
     * @param loginUserGateway - it is the gateway of the login user case
     * @param loginUserController - it is the controller of the login user use case
     */
    public CreateAccountUI(CreateUserController controller,
                           LoginUserDsGateway loginUserGateway, LoginUserController loginUserController){
        this.loginUserGateway = loginUserGateway;
        this.loginUserController = loginUserController;
        this.createUserController = controller;
        mainframe.setTitle("Sign Up");
        mainframe.setSize(600, 320);
        mainframe.setVisible(true);
    }
    public void main(){


        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);

        // labels for the page
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(10,0, 150,70);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(10,30, 150,70);

        JLabel emailLabel = new JLabel("Email Address:");
        emailLabel.setBounds(10,60, 150,70);

        JLabel pinLabel = new JLabel("Password:");
        pinLabel.setBounds(10, 90, 150, 70);

        JLabel repeatPinLabel = new JLabel("Repeat Password:");
        repeatPinLabel.setBounds(10, 120, 150, 70);

        // fields for the page

        firstNameField.setBounds(160, 20, 300, 35);
        lastNameField.setBounds(160, 50, 300, 35);
        emailAddressField.setBounds(160, 80, 300, 35);
        passwordField.setBounds(160, 110, 300, 35);
        repeatPasswordField.setBounds(160, 140, 300, 35);

        // buttons for the page
        JButton backButton = new JButton("Back to Login Page");
        backButton.setBounds(140, 200, 300, 35);
        LoginPageUI loginPageUI = new LoginPageUI(this.loginUserController, this.loginUserGateway, this.createUserController);
        backButton.addActionListener(e -> loginPageUI.main());


        JButton createAccountButton = new JButton("Create Account!");
        createAccountButton.setBounds(140, 230, 300, 35);
        createAccountButton.addActionListener(this);


        // Panel and adding the labels, buttons and the text fields to the panel
        JPanel Panel = new JPanel();
        Panel.setLayout(null);

        Panel.add(firstNameLabel);
        Panel.add(lastNameLabel);
        Panel.add(emailLabel);
        Panel.add(pinLabel);
        Panel.add(repeatPinLabel);

        Panel.add(firstNameField);
        Panel.add(lastNameField);
        Panel.add(emailAddressField);
        Panel.add(passwordField);
        Panel.add(repeatPasswordField);


        Panel.add(backButton);
        Panel.add(createAccountButton);
        // it shows the visibility

        mainframe.add(Panel);
        mainframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Click " + evt.getActionCommand());
        CreateUserOutputData outputData = createUserController.create(
                new CreateUserInputData(emailAddressField.getText(), passwordField.getText(),
                        firstNameField.getName(), lastNameField.getName(), repeatPasswordField.getText()));

        if(outputData.getIsSuccessful()){
            JOptionPane.showMessageDialog(mainframe, "Account Created!");
            mainframe.dispose();
            CommonUser user = loginUserGateway.getUserByEmail(emailAddressField.getText());
            HomeScreenUI homeScreenUI = new HomeScreenUI(user);
            homeScreenUI.main();
        }else{
            JOptionPane.showMessageDialog(mainframe, outputData.getMessage());
        }
    }
}
