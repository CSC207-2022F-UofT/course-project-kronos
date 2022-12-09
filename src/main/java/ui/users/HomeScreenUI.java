package ui.users;

import entities.CommonUser;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The Screen that pops up once the user is successfully logged in
 * @author happynasit
 */
public class HomeScreenUI extends JFrame {

    final CommonUser user;
    final JFrame mainframe = new JFrame();
    public HomeScreenUI(CommonUser user) {
        this.user = user;
        mainframe.setTitle("Kronos");
        mainframe.setSize(600, 450);
        mainframe.setVisible(true);
    }

    public void main() {
        JLabel signUpLabel = new JLabel("WELCOME!");
        signUpLabel.setBounds(260, 50, 300, 35);
        JButton habitsButton = new JButton("HABITS");
        habitsButton.setBounds(140, 100, 300, 35);
        JButton tasksButton = new JButton("TASKS");
        tasksButton.setBounds(140, 150, 300, 35);
        JButton categoryButton = new JButton("CATEGORIES");
        categoryButton.setBounds(140, 200, 300, 35);
        JButton timerButton = new JButton("TIMER");
        timerButton.setBounds(140, 250, 300, 35);
        JButton logOutButton = new JButton("Log Out");
        logOutButton.setBounds(140, 300, 300, 35);
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.add(signUpLabel);
        Panel.add(habitsButton);
        Panel.add(tasksButton);
        Panel.add(categoryButton);
        Panel.add(timerButton);
        Panel.add(logOutButton);
        mainframe.add(Panel);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
    }
}