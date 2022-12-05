package ui;
import javax.swing.*;
import java.awt.*;

public class HabitMainUI {


    /**
     * Produces a UI to choose between Habit creation, editing and tracking and then links to the respective page.
     */
    public static void HabitProfile () {

        // The frame of the screen titled "HABIT PROFILE PAGE"
        JFrame frame = new JFrame("HABIT PROFILE PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The main panel of the screen which contains all other panels.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 0));

        // Panel 1
        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 50));
        // Label 1
        JLabel l1 = new JLabel( "HABIT PROFILE", JLabel.CENTER);

        // Panel 2
        JPanel p2 = new JPanel();
        p2.setSize(new Dimension(250, 50));
        // Label 2
        JLabel l2 = new JLabel( "CREATE A HABIT", JLabel.CENTER);
        l2.setPreferredSize(new Dimension(100, 30));
        l2.setLayout(new BorderLayout());

        // Panel 3
        JPanel p3 = new JPanel();
        p3.setSize(new Dimension(250, 50));

        // Label 3
        JLabel l3 = new JLabel( "EDIT A HABIT", JLabel.CENTER);
        l3.setPreferredSize(new Dimension(150, 30));
        l3.setLayout(new BorderLayout());

        // Panel 4
        JPanel p4 = new JPanel();
        p4.setSize(new Dimension(250, 50));
        // Label 4
        JLabel l4 = new JLabel( "VIEW THE HABITS", JLabel.CENTER);
        l4.setPreferredSize(new Dimension(150, 30));
        l4.setLayout(new BorderLayout());

        // Button 1: CREATE
        JButton b1 = new JButton("Create");
        b1.addActionListener(e -> CreateHabitUI.addNewHabit());

        // Button 2 : EDIT
        JButton b2 = new JButton("Edit");
        b2.addActionListener(e -> EditHabitUI.editExistingHabit());

        //Button 3: VIEW
        JButton b3 = new JButton("View"); //set label to button
        b3.addActionListener(e -> TrackHabitUI.showHabitList());

        frame.add(mainPanel);

        mainPanel.add(p1);
        mainPanel.add(p2);
        mainPanel.add(p3);
        mainPanel.add(p4);

        p1.add(l1);

        p2.add(l2);
        p2.add(b1);

        p3.add(l3);
        p3.add(b2);

        p4.add(l4);
        p4.add(b3);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(HabitMainUI::HabitProfile);
    }
}

