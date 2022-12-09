package ui.users;

import entities.CommonUser;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import static ui.habits.HabitProfileScreen.HabitProfile;

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
        habitsButton.addActionListener(e -> HabitProfile());

        JButton toDoButton = new JButton("TO DO LIST");
        toDoButton.setBounds(140, 150, 300, 35);


        JButton timerButton = new JButton("TIMER");
        timerButton.setBounds(140, 200, 300, 35);

        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.add(signUpLabel);
        Panel.add(habitsButton);
        Panel.add(toDoButton);
        Panel.add(timerButton);
        mainframe.add(Panel);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
    }
}
