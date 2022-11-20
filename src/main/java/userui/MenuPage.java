package userui;

import javax.swing.*;

public class MenuPage {
    static JFrame mainFrame;
    static Button habits;
    static Button todolists;
    static Button Timer;
    static Button changepassword;
    static Button deleteaccount;
    static Button logout;

    static Label welcomestr;

    static Panel panel;


    public static void createmenu() {
        // create a new mainframe( type JFrame )
        mainFrame = new JFrame();
        mainFrame.setSize(450, 300);
        mainFrame.setTitle("Welcome Page");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a new Jpanel
        panel = new Panel();
        panel.createPanel();
        mainFrame.add(panel.getPanel());


        // create new label for welcome title
        welcomestr = new Label();
        welcomestr.createLabel("WELCOME!!", 10,0,
                150,70, panel.getPanel());


        // create new buttons for each function

    }

}