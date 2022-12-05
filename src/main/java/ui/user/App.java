package ui.user;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        // this method makes it run in an approved manner and won't crash
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                CreateAccountPage signup = new CreateAccountPage();
                signup.createAccountPage();
            }
        });
    }
}
