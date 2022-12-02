package ui.user;

import javax.swing.*;
import java.awt.*;
import java.text.Format;

public class LoginPage extends JFrame {

    private JTextField textField;

    // strings
    public String emailAddress;
    public String password_;

    // buttons
    public JButton loginButton;
    public JButton createAccountButton;

    // labels to identify the fields
    private JLabel emailLabel;
    private JLabel pinLabel;


    //Strings for the labels
    private static String email = "Email Address: ";
    private static String password = "Password: ";

    //Formats to format and parse Strings
    private Format emailFormat;
    private Format passwordFormat;

    //Fields for data entry
    private JFormattedTextField emailAddressField;
    private JFormattedTextField passwordField;

    public LoginPage(){
        super("Kronos");

        setSize(600, 500);
        setLayout(new BorderLayout());

        textField = new JTextField(20);

        // creating the labels
        emailLabel = new JLabel(email);
        pinLabel = new JLabel(password);


        // creating new button
        loginButton = new JButton("Login");
        createAccountButton = new JButton("Create Account!");


        // creating the text fields
        emailAddressField = new JFormattedTextField(emailFormat);
        emailAddressField.setValue(emailAddress);
        emailAddressField.setColumns(10);

        passwordField = new JFormattedTextField(passwordFormat);
        passwordField.setValue(password_);
        passwordField.setColumns(10);

        // labels for the fields
        emailLabel.setLabelFor(emailAddressField);
        pinLabel.setLabelFor(passwordField);

        // layouts and adding the fields to the layouts

        JPanel labelPane = new JPanel(new GridLayout(0,1));
        JPanel fieldPane = new JPanel(new GridLayout(0,1));

        fieldPane.add(emailAddressField);
        fieldPane.add(passwordField);

        labelPane.add(emailLabel);
        labelPane.add(pinLabel);

        add(fieldPane, BorderLayout.CENTER);
        add(labelPane, BorderLayout.LINE_START);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // it shows the visibility
        setVisible(true);

    }
}
