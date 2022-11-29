package ui.user;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entities.UserFactory;

public class LoginMainPage extends JFrame {
    static JFrame mainFrame;
    UserFactory users;

    static Button loginbutton;
    static Button createaccountbutton;

    static Label enteremail;
    static Label enterpin;

    static TextField emailfield;
    static TextField passwordfield;

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
        enteremail = new Label();
        enteremail.createLabel("Enter Email Address:", 10,0,
                150,70, panel.getPanel());

        enterpin = new Label();
        enterpin.createLabel("Enter Password:", 10, 30,
                150, 70, panel.getPanel());

        // create text fields
        emailfield = new TextField();
        emailfield.createTextField(160, 20, 200, 25, panel.getPanel());

        passwordfield = new TextField();
        passwordfield.createPasswordField(160, 50, 200, 25, panel.getPanel());


        // creating a new button
        loginbutton = new Button();
        loginbutton.createButton(panel.jPanel, "Login",140, 100, 80, 25);


        createaccountbutton = new Button();
        createaccountbutton.createButton(panel.jPanel, "Create Account",120, 130, 120, 25);




    }

}
