package ui;
import controller.TrackHabitController;
import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import static ui.TestFile.hFactory;

public class HabitPage {
    public static void addHabitsToPane(JPanel pane) {

        for(String i :hFactory.h_items.keySet()){

            JLabel l = new JLabel( i + "  " , JLabel.CENTER);
            l.setPreferredSize(new Dimension(100, 30));
            l.setBorder(new LineBorder(Color.GRAY, 1));
            l.setLayout(new BorderLayout());
            JButton button1 = new JButton("+");
            button1.setAlignmentX(Component.RIGHT_ALIGNMENT);
            button1.addActionListener(e -> TrackHabitController.TrackHabitC(i));
            button1.setPreferredSize(new Dimension(50, 30));
            l.add( button1, BorderLayout.AFTER_LINE_ENDS);
            JButton button2 = new JButton("Frequency");
            button2.setAlignmentX(Component.LEFT_ALIGNMENT);
            button2.addActionListener(e -> button2.setText(hFactory.h_items.get(i).getFrequencyString()));
            button2.setPreferredSize(new Dimension(100, 30));
            l.add( button2, BorderLayout.BEFORE_LINE_BEGINS);


            pane.add(l);

        }
    }

    public static void createAndShowHabitListGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Habits Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel major = new JPanel();
        major.setLayout(new GridLayout(2, 0));
        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 5));
        JLabel title = new JLabel("HABITS", JLabel.CENTER);
        frame.add(major);
        major.add(p1);
        p1.add(title);
        JPanel panel = new JPanel();
        //Set up the content pane.
        addHabitsToPane(panel);
        panel.setLayout(new GridLayout(10, 3));
        panel.setSize(200, 20);
        major.add(panel);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(HabitPage::createAndShowHabitListGUI);
    }
    }

