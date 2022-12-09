package ui.habits;

import controllers.habits.TrackHabitController;
import database.DatabaseUser;


import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;


public class TrackHabitScreen extends JFrame implements ActionListener {

    TrackHabitController tHabit;

     /** Creates label and '+'(increase frequency) and 'frequency' (show frequency) buttons for each habit in the User's
     * collection.
     * @param pane - Panel to which buttons are to be added.
     */
    public void addHabitsToPane(JPanel pane) {
        DatabaseUser databaseUser = new DatabaseUser("data.ser");

        for(String i : databaseUser.getHabits().keySet()){

            // Label: Habit name
            JLabel l = new JLabel( i + "  " , JLabel.CENTER);
            l.setPreferredSize(new Dimension(100, 30));
            l.setBorder(new LineBorder(Color.GRAY, 1));
            l.setLayout(new BorderLayout());

            // Button 1: increase frequency
            JButton button1 = new JButton("+");
            button1.setAlignmentX(Component.RIGHT_ALIGNMENT);
            button1.addActionListener(e -> tHabit.track(i));
            button1.setPreferredSize(new Dimension(50, 30));

            // Button 2: Show frequency
            JButton button2 = new JButton("Frequency");
            button2.setAlignmentX(Component.LEFT_ALIGNMENT);
            button2.addActionListener(e ->
                    button2.setText(databaseUser.getHabits().get(i).getFrequencyString()));
            button2.setPreferredSize(new Dimension(100, 30));


            l.add( button1, BorderLayout.AFTER_LINE_ENDS);
            l.add( button2, BorderLayout.BEFORE_LINE_BEGINS);

            pane.add(l);

        }
    }

    /**
     * Produces a UI to show a list of all existing Habits in the User's collection.
     */
    public TrackHabitScreen() {

        // The frame of the screen titled "HABIT TRACKER"
        JFrame frame = new JFrame("HABIT TRACKER");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

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

    /**
     * React to a button click that result in e.
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {System.out.println("Click" + e.getActionCommand());

        try{
            JOptionPane.showMessageDialog(this, " tracked.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }


    }

    public static void trackScreen(){

        new TrackHabitScreen();

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TrackHabitScreen::trackScreen);
    }
}

