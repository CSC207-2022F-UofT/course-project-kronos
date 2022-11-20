package userui;

import javax.swing.*;

import userui.CreateAccountPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountPage extends JFrame implements ActionListener {
    static JFrame mainFrame;

    static Button createaccountbutton;
    static Button cancelbutton;

    static Label enteremail;
    static Label enterpin;
    static Label repeatpin;
    static Label firstname;
    static Label lastname;

    static TextField emailfield;
    static TextField passwordfield;
    static TextField reppasswordfield;
    static TextField firstnamefield;
    static TextField lastnamefield;

    static Panel panel;

    public static void createAccountPage(){
        // create a new mainframe( type JFrame )
        mainFrame = new JFrame();
        mainFrame.setSize(450, 300);
        mainFrame.setTitle("Create Account");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a new Jpanel
        panel = new Panel();
        panel.createPanel();
        mainFrame.add(panel.getPanel());

        // create a new label
        firstname = new Label();
        firstname.createLabel("First Name:", 10,0,
                150,70, panel.getPanel());

        lastname = new Label();
        lastname.createLabel("Last Name:", 10, 30,
                150, 70, panel.getPanel());

        enteremail = new Label();
        enteremail.createLabel("Email Address:", 10,60,
                170,70, panel.getPanel());

        enterpin = new Label();
        enterpin.createLabel("Password:", 10, 90,
                150, 70, panel.getPanel());

        repeatpin = new Label();
        repeatpin.createLabel("Repeat Password:", 10, 120, 150, 70, panel.getPanel());

        // create button create account
        createaccountbutton = new Button();
        createaccountbutton.createButton(panel.jPanel, "Create Account",150, 200, 120, 25);

        // create button create account
        cancelbutton = new Button();
        cancelbutton.createButton(panel.jPanel, "Cancel",150, 400, 120, 25);


        // create text fields for filling up the information
        firstnamefield = new TextField();
        firstnamefield.createTextField(160, 25, 250, 25, panel.getPanel());

        lastnamefield = new TextField();
        lastnamefield.createTextField(160, 55, 250, 25, panel.getPanel());

        emailfield = new TextField();
        emailfield.createTextField(160, 85, 250, 25, panel.getPanel());

        passwordfield = new TextField();
        passwordfield.createTextField(160, 115, 250, 25, panel.getPanel());

        reppasswordfield = new TextField();
        reppasswordfield.createTextField(160, 145, 250, 25, panel.getPanel());

        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        // actions performed by the create account button and the cancel button

        String firstname = firstnamefield.textField.getText();
        String lastname = lastnamefield.textField.getText();
        String email = emailfield.textField.getText();
        String password = String.valueOf(passwordfield.passwordField);

        if (e.getSource()==createaccountbutton){



        }else if(e.getSource() == cancelbutton){
            // if it wants to go back to the log in page

            mainFrame.dispose();
            LoginMainPage login = new LoginMainPage();


        }
    }
}
