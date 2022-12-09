package ui.habits;
import javax.swing.*;
import java.awt.*;

public class HabitProfileScreen extends JFrame{


    /**
     * Produces a UI to choose between Habit creation, editing and tracking and then links to the respective page.
     */


    public HabitProfileScreen () {

        // The frame of the screen titled "HABIT PROFILE PAGE"

        JFrame frame = new JFrame("HABIT PROFILE PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The main panel of the screen which contains all other panels.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 0));

        JPanel panelTitle = new JPanel();
        panelTitle.setSize(new Dimension(250, 50));
        JLabel labelTitle = new JLabel( "HABIT PROFILE", JLabel.CENTER);

        JPanel panelCreate = new JPanel();
        panelCreate.setSize(new Dimension(250, 50));
        JLabel labelCreate = new JLabel( "CREATE A HABIT", JLabel.CENTER);
        labelCreate.setPreferredSize(new Dimension(100, 30));
        labelCreate.setLayout(new BorderLayout());

        JPanel panelEdit = new JPanel();
        panelEdit.setSize(new Dimension(250, 50));

        JLabel labelEdit = new JLabel( "EDIT A HABIT", JLabel.CENTER);
        labelEdit.setPreferredSize(new Dimension(100, 30));
        labelEdit.setLayout(new BorderLayout());

        JPanel panelView = new JPanel();
        panelView.setSize(new Dimension(250, 50));
        JLabel labelView = new JLabel( "VIEW HABITS", JLabel.CENTER);
        labelView.setPreferredSize(new Dimension(100, 30));
        labelView.setLayout(new BorderLayout());

        // Button 1: CREATE
        JButton buttonCreate = new JButton("Create");
        buttonCreate.addActionListener(e -> new CreateHabitScreen());

        // Button 2 : EDIT
        JButton buttonEdit = new JButton("Edit");
        buttonEdit.addActionListener(e -> new EditHabitScreen());

        //Button 3: VIEW
        JButton buttonView = new JButton("View"); //set label to button
         buttonView.addActionListener(e -> new TrackHabitScreen());

        frame.add(mainPanel);

        mainPanel.add(panelTitle);
        mainPanel.add(panelCreate);
        mainPanel.add(panelEdit);
        mainPanel.add(panelView);

        panelTitle.add(labelTitle);

        panelCreate.add(labelCreate);
        panelCreate.add(buttonCreate);

        panelEdit.add(labelEdit);
        panelEdit.add(buttonEdit);

        panelView.add(labelView);
        panelView.add(buttonView);

        frame.pack();
        frame.setVisible(true);

    }

    public static void profileScreen(){

        new HabitProfileScreen();

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(HabitProfileScreen::profileScreen);
    }
}

