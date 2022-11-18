package ui;
import javax.swing.*;
import java.awt.*;

public class HabitsProfilePage {

    // Need user object

    public static void HabitProfile () {
        //initialize button, panel, label, and text field
        JFrame frame = new JFrame("HABIT PROFILE PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel major = new JPanel();
        major.setLayout(new GridLayout(4, 0));

        JPanel p = new JPanel();
        p.setSize(new Dimension(250, 50));
        JLabel l = new JLabel( "HABIT PROFILE", JLabel.CENTER);

        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 50));
        JLabel l1 = new JLabel( "CREATE A HABIT", JLabel.CENTER);
        l1.setPreferredSize(new Dimension(100, 30));
        l1.setLayout(new BorderLayout());

        JButton b1 = new JButton("Create"); //set label to button
        b1.addActionListener(e -> HabitCreation.addHabit() );


        JPanel p2 = new JPanel();
        p2.setSize(new Dimension(250, 50));
        JLabel l2 = new JLabel( "EDIT A HABIT", JLabel.CENTER);
        l2.setPreferredSize(new Dimension(150, 30));
        l2.setLayout(new BorderLayout());
        //create text field to get username from the user
        JButton b2 = new JButton("Edit"); //set label to button
        b2.addActionListener(e -> ui.EditHabit.editHabit());


        JPanel p3 = new JPanel();
        p3.setSize(new Dimension(250, 50));
        JLabel l3 = new JLabel( "VIEW THE HABITS", JLabel.CENTER);
        l3.setPreferredSize(new Dimension(150, 30));
        l3.setLayout(new BorderLayout());

        //create submit button
        JButton b3 = new JButton("View"); //set label to button
        b3.addActionListener(e -> ui.HabitPage.createAndShowHabitListGUI());

        frame.add(major);
        major.add(p);
        p.add(l);
        major.add(p1);
        p1.add(l1);
        p1.add(b1);
        major.add(p2);
        p2.add(l2);
        p2.add(b2);
        major.add(p3);
        p3.add(l3);
        p3.add(b3);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(HabitsProfilePage::HabitProfile);
    }
}

