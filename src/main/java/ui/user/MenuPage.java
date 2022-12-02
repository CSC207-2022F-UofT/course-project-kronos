package ui.user;

import javax.swing.*;

public class MenuPage {
    static JFrame mainFrame;
    static Button habits;
    static Button todoLists;
    static Button Timer;
    static Button changePassword;
    static Button deleteAccount;
    static Button logOut;

    static Label welcomeStr;

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
        welcomeStr = new Label();
        welcomeStr.createLabel("WELCOME!!", 10,0,
                150,70, panel.getPanel());


        // create new buttons for each function

    }

}