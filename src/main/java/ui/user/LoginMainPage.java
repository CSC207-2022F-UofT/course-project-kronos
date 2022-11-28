package ui.user;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entities.UserFactory;

public class LoginMainPage extends JFrame implements ActionListener {
    static JFrame mainFrame;
    UserFactory users;

    static Button loginButton;
    static Button createAccountButton;

    static Label enterEmail;
    static Label enterPin;

    static TextField emailField;
    static TextField passwordField;

    static Panel panel;


    public static void createLoginMainPage(){

        // create a new mainframe( type JFrame )
        mainFrame = new JFrame();
        mainFrame.setSize(400, 200);
        mainFrame.setTitle("Kronos");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setVisible(true);

        // create a new Jpanel
        panel = new Panel();

        panel.createPanel();
        mainFrame.add(panel.getPanel());



        // create a new label
        enterEmail = new Label();
        enterEmail.createLabel("Enter Email Address:", 10,0,
                150,70, panel.getPanel());

        enterPin = new Label();
        enterPin.createLabel("Enter Password:", 10, 30,
                150, 70, panel.getPanel());

        // create text fields
        emailField = new TextField();
        emailField.createTextField(160, 20, 200, 25, panel.getPanel());

        passwordField = new TextField();
        passwordField.createPasswordField(160, 50, 200, 25, panel.getPanel());


        // creating a new button
        loginButton = new Button();
        loginButton.createButton(panel.jPanel, "Login",140, 100, 80, 25);


        createAccountButton = new Button();
        createAccountButton.createButton(panel.jPanel, "Create Account",120, 130, 120, 25);




    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==createAccountButton){

        }else if(e.getSource() == loginButton){
            String email = emailField.textField.getText();
            String password = String.valueOf(passwordField.passwordField);

            mainFrame.dispose();
            MenuPage welcome = new MenuPage();

            // case when it is able to log in

            }
        }



    public static void main(String[] args) {
        LoginMainPage login = new LoginMainPage();
        createLoginMainPage();

    }


}
