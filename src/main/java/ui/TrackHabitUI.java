package ui;
import controllers.TrackHabitController;
import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import static example_user.UserExample.sendUser;

public class TrackHabitUI {

    /**
     * Creates label and '+'(increase frequency) and 'frequency' (show frequency) buttons for each habit in the User's
     * collection.
     * @param pane - Panel to which buttons are to be added.
     */
    public static void addHabitsToPane(JPanel pane) {

        for(String i :sendUser().getHabitCollection().habitCollection
                .keySet()){

            // Label: Habit name
            JLabel l = new JLabel( i + "  " , JLabel.CENTER);
            l.setPreferredSize(new Dimension(100, 30));
            l.setBorder(new LineBorder(Color.GRAY, 1));
            l.setLayout(new BorderLayout());

            // Button 1: increase frequency
            JButton button1 = new JButton("+");
            button1.setAlignmentX(Component.RIGHT_ALIGNMENT);
            button1.addActionListener(e -> TrackHabitController.TrackHabitC(sendUser(), i));
            button1.setPreferredSize(new Dimension(50, 30));

            // Button 2: Show frequency
            JButton button2 = new JButton("Frequency");
            button2.setAlignmentX(Component.LEFT_ALIGNMENT);
            button2.addActionListener(e ->
                    button2.setText(sendUser().getHabitCollection().habitCollection.get(i).getFrequencyString()));
            button2.setPreferredSize(new Dimension(100, 30));

            l.add( button1, BorderLayout.AFTER_LINE_ENDS);
            l.add( button2, BorderLayout.BEFORE_LINE_BEGINS);

            pane.add(l);

        }
    }

    /**
     * Produces a UI to show a list of all existing Habits in the User's collection.
     */
    public static void showHabitList() {

        // The frame of the screen titled "HABIT TRACKER"
        JFrame frame = new JFrame("HABIT TRACKER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The main panel of the screen which contains all other panels.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 0));

        // Panel 1
        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 5));
        // Label 1
        JLabel l1 = new JLabel("HABITS", JLabel.CENTER);

        // Panel 2
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(10, 3));
        p2.setSize(200, 20);
        addHabitsToPane(p2);

        frame.add(mainPanel);

        mainPanel.add(p1);
        mainPanel.add(p2);

        p1.add(l1);

        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(TrackHabitUI::showHabitList);
    }
}

