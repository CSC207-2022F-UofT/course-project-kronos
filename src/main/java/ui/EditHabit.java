package ui;
import controller.EditHabitController;
import entities.HabitFactory;
import entities.Habit;
import javax.swing.*;
import java.awt.*;

import static ui.TestFile.hFactory;

public class EditHabit {

    public static void editHabit () {
        //initialize button, panel, label, and text field
        JFrame frame = new JFrame("HABIT EDIT PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel major = new JPanel();
        major.setLayout(new GridLayout(6, 0));

        JPanel p = new JPanel();
        p.setSize(new Dimension(250, 50));
        JLabel l = new JLabel( "EDIT A HABIT", JLabel.CENTER);

        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 50));
        JLabel l1 = new JLabel( "Choose Habit", JLabel.CENTER);
        l1.setPreferredSize(new Dimension(100, 30));
        l1.setLayout(new BorderLayout());

        int j = hFactory.h_items.size();

        String[] options = new String[j];


        int k = 0;

        for(String i :hFactory.h_items.keySet()){
            options[k] = i;
            k = k + 1;
        }

        JList<String> remList = new JList<>(options);

        JPanel p2 = new JPanel();
        p2.setSize(new Dimension(250, 50));
        JLabel l2 = new JLabel( "New Habit Name", JLabel.CENTER);
        l2.setPreferredSize(new Dimension(100, 30));
        l2.setLayout(new BorderLayout());
        //create text field to get username from the user
        JTextField textField2 = new JTextField(15);    //set length of the text

        JPanel p3 = new JPanel();
        p3.setSize(new Dimension(250, 50));
        JLabel l3 = new JLabel( "New Habit Type", JLabel.CENTER);
        l3.setPreferredSize(new Dimension(150, 30));
        l3.setLayout(new BorderLayout());
        //create text field to get username from the user

        JTextField textField3 = new JTextField(15);    //set length of the text

        JPanel p4 = new JPanel();
        p4.setSize(new Dimension(250, 50));
        JLabel l4 = new JLabel( "Reminder", JLabel.CENTER);
        l4.setPreferredSize(new Dimension(150, 30));
        l4.setLayout(new BorderLayout());
        String[] rem = {"ON", "OFF"};

        JList<String> reml = new JList<>(rem);


        JPanel p5 = new JPanel();
        p5.setSize(new Dimension(250, 50));

        String s = remList.getSelectedValue();
        String a = textField2.getText();
        String t = textField3.getText();
        String b = reml.getSelectedValue();



        //create submit button
        JButton b1 = new JButton("EDIT"); //set label to button
        b1.addActionListener(e -> EditHabitController.HabitEdit(hFactory, s, a, t, b));

        frame.add(major);
        major.add(p);
        p.add(l);
        major.add(p1);
        major.add(p2);
        major.add(p3);
        major.add(p4);
        major.add(p5);
        p5.add(b1);

        p1.add(l1);
        p1.add(remList);
        p2.add(l2);
        p2.add(textField2);
        p3.add(l3);
        p3.add(textField3);
        p4.add(l4);
        p4.add(reml);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(EditHabit::editHabit);
    }
}



