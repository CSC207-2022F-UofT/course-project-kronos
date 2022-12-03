package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controllers.habits.create.CreateHabitController;

public class CreateHabitUI extends JFrame implements ActionListener {

    /**
     * Produces a UI to add new Habits to the User's collection.
     */
    JTextField title = new JTextField(15);

    JTextField type = new JTextField(15);

    CreateHabitController userHabit;
    public void addNewHabit(CreateHabitController u) {

        this.userHabit = u;

        // The frame of the screen titled "HABIT CREATION PAGE"
        JFrame frame = new JFrame("HABIT CREATION PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The main panel of the screen which contains all other panels.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 0));

        // Panel 1
        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 50));
        //Label 1
        JLabel l1 = new JLabel( "CREATE A NEW HABIT", JLabel.CENTER);

        // Panel 2
        JPanel p2 = new JPanel();
        p2.setSize(new Dimension(250, 50));
        // Label 2
        JLabel l2 = new JLabel( "Habit Title", JLabel.CENTER);
        l2.setPreferredSize(new Dimension(100, 30));
        l2.setLayout(new BorderLayout());
        //Text field 1 : Gets Habit name from user


        // Panel 3
        JPanel p3 = new JPanel();
        p3.setSize(new Dimension(250, 50));
        // Label 3
        JLabel l3 = new JLabel( "Habit Type", JLabel.CENTER);
        l3.setPreferredSize(new Dimension(100, 30));
        l3.setLayout(new BorderLayout());
        //Text field 2 : Gets Habit type from user


        // Panel 5
        JPanel p5 = new JPanel();
        p5.setSize(new Dimension(250, 50));


        //Button 1 : Submit button
        JButton b1 = new JButton("SUBMIT");
        b1.addActionListener(this);

        frame.add(mainPanel);

        mainPanel.add(p1);
        mainPanel.add(p2);
        mainPanel.add(p3);
        mainPanel.add(p5);

        p1.add(l1);

        p2.add(l2);
        p2.add(this);

        p3.add(l3);
        p3.add(this);

        p5.add(b1);

        frame.pack();
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent evt) {

        try {
            userHabit.create(title.getText(), type.getText());
            JOptionPane.showMessageDialog(this, title.getText() + "%s created.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }
}

