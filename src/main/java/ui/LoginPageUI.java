package ui;
import controllers.users.CreateUserController;
import controllers.users.LoginUserController;
import entities.CommonUser;
import use_cases.user.create_user.CreateUserDsGateway;
import use_cases.user.login_user.LoginUserDsGateway;
import use_cases.user.login_user.LoginUserInputData;
import use_cases.user.login_user.LoginUserOutputData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * UI for the Login Page. By the actions of the buttons, the page will either be directed to the CreateAccountUI or the
 * Menu Page of the User.
 * @author happynasit
 */
public class LoginPageUI extends JFrame implements ActionListener{
    static final JFrame mainframe = new JFrame();
    final LoginUserController loginUserController;
    final LoginUserDsGateway gateway;

    CreateUserController createUserController;

    static JTextField emailAddressField = new JTextField();
    static JPasswordField passwordField = new JPasswordField();

    /**
     * Constructor for the LoginPageUI class
     * sets the labels, buttons and the text field to enter the user information.
     * @param loginUserController - the controller that we will be using for the program
     * @param gateway - login of user gateway
     */
    public LoginPageUI(LoginUserController loginUserController, LoginUserDsGateway gateway,
                       CreateUserController createUserController){
        this.gateway = gateway;
        this.createUserController = createUserController;
        this.loginUserController = loginUserController;
        mainframe.setTitle("Kronos");
        mainframe.setSize(550, 250);
        mainframe.setVisible(true);
    }

    public void main(){


        // creating the labels
        String email = "Email Address: ";
        JLabel emailLabel = new JLabel(email);
        emailLabel.setBounds(10,0, 150,70);

        String password = "Password: ";
        JLabel pinLabel = new JLabel(password);
        pinLabel.setBounds(10, 30, 150, 70);

        // creating new button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(140, 100, 300, 35);
        loginButton.addActionListener(this);

        JButton createAccountButton = new JButton("Create Account!");
        createAccountButton.setBounds(140, 130, 300, 35);

        CreateAccountUI createAccountUI = new CreateAccountUI(this.createUserController, this.gateway, this.loginUserController);
        createAccountButton.addActionListener(e -> createAccountUI.main());


        // creating the text fields
        // for data entry
        emailAddressField.setBounds(160, 20, 300, 35);
        passwordField.setBounds(160, 50, 300, 35);

        // labels for the fields
        emailLabel.setLabelFor(emailAddressField);
        pinLabel.setLabelFor(passwordField);

        // Panel and adding the labels, buttons and the text fields to the panel
        JPanel Panel = new JPanel();
        Panel.setLayout(null);

        Panel.add(emailAddressField);
        Panel.add(passwordField);

        Panel.add(emailLabel);
        Panel.add(pinLabel);

        Panel.add(loginButton);
        Panel.add(createAccountButton);

        mainframe.add(Panel);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // it shows the visibility
        mainframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click " + e.getActionCommand());
        LoginUserOutputData loginUserOutputData = this.loginUserController.login(
                new LoginUserInputData(emailAddressField.getText(), String.valueOf(passwordField.getPassword())));
        // case when the user is successfully logged into the account
        if(loginUserOutputData.getIsLoginSuccessful()){
            JOptionPane.showMessageDialog(mainframe, "Successfully logged in!");
            mainframe.dispose();
            CommonUser user = gateway.getUserByEmail(emailAddressField.getText());

            HomeScreenUI homeScreenUI = new HomeScreenUI(user);
            homeScreenUI.main();
            homeScreenUI.setVisible(true);
        }else{
            // if it is not able to log in then it will show this error message to the user
            JOptionPane.showMessageDialog(mainframe, loginUserOutputData.getMessage());
        }
    }
}
