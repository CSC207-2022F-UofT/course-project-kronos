import ui.LoginPageUI;

import javax.swing.*;

/**
 * Main program
 */
public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                LoginPageUI.main();
            }
        });
    }
}
