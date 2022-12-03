package ui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * UI for the Login Page. By the actions of the buttons, the page will either be directed to the CreateAccountUI or the
 * Menu Page of the User.
 * @author happynasit
 */
public class LoginPageUI extends JFrame {
    /**
     * Constructor for the LoginPageUI class
     * sets the labels, buttons and the text field to enter the user information.
     */
    public LoginPageUI(){
        this.setTitle("Kronos");
        this.setSize(550, 250);
        this.setVisible(true);
    }

    public static void main(){
        LoginPageUI mainFrame = new LoginPageUI();


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

        JButton createAccountButton = new JButton("Create Account!");
        createAccountButton.setBounds(140, 130, 300, 35);

        createAccountButton.addActionListener(e -> CreateAccountUI.main());

        // creating the text fields
        // for data entry
        JTextField emailAddressField = new JTextField();
        emailAddressField.setBounds(160, 20, 300, 35);

        JPasswordField passwordField = new JPasswordField();
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

        mainFrame.add(Panel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // it shows the visibility
        mainFrame.setVisible(true);
    }

}
