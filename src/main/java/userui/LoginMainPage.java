package userui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import entities.User;
import entities.UserFactory;

public class LoginMainPage extends JFrame implements ActionListener {
    JFrame mainFrame;
    UserFactory users;

    Button loginbutton;
    Button createaccountbutton;

    Label enteremail;
    Label enterpin;

    TextField emailfield;
    TextField passwordfield;

    Panel panel;


    public void createLoginMainPage(){

        // create a new mainframe( type JFrame )
        mainFrame = new JFrame();
        mainFrame.setSize(400, 200);
        mainFrame.setTitle("Kronos");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        loginbutton.button.addActionListener(this);

        createaccountbutton = new Button();
        createaccountbutton.createButton(panel.jPanel, "Create Account",120, 130, 120, 25);
        createaccountbutton.button.addActionListener(this);

        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==createaccountbutton){

        }else if(e.getSource() == loginbutton){
            String email = emailfield.textField.getText();
            String password = String.valueOf(passwordfield.passwordField);


            // case when it is able to log in
            for(String user: users.getkeys()){
                User value_ = users.Users.get(user);

                if (email.equals(user) && value_.getPassword().equals(password)){
                    System.out.println("login successful!");
                    // have to shift from this to the login page
                } else{
                    emailfield.textField.setText("");
                    passwordfield.textField.setText("");


                    System.out.println("login not successful!");
                }
            }

        }

    }


}
