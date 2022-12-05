package ui.habits;
import controllers.habits.edit.EditHabitController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditHabitScreen extends JFrame implements ActionListener {

    /**
     * Produces a UI to edit existing Habits in the User's collection.
     */

    JTextField oldName = new JTextField(15);

    JTextField newName = new JTextField(15);

    JTextField newType = new JTextField(15);

    EditHabitController eHabit;

    public EditHabitScreen() {

        // The frame of the screen titled "HABIT EDIT PAGE"
        JFrame frame = new JFrame("HABIT EDIT PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The main panel of the screen which contains all other panels.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 0));

        // Panel 1
        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 50));
        // Label 1
        JLabel l1 = new JLabel( "EDIT A HABIT", JLabel.CENTER);

        // Panel 2
        JPanel p2 = new JPanel();
        p2.setSize(new Dimension(250, 50));
        //Label 2
        JLabel l2 = new JLabel( "Old Habit Name", JLabel.CENTER);
        l2.setPreferredSize(new Dimension(100, 30));
        l2.setLayout(new BorderLayout());
        //JTextField textField3 = new JTextField(15);

        // Panel 3
        JPanel p3 = new JPanel();
        p3.setSize(new Dimension(250, 50));
        // Label 3
        JLabel l3 = new JLabel( "New Habit Name", JLabel.CENTER);
        l3.setPreferredSize(new Dimension(100, 30));
        l3.setLayout(new BorderLayout());
        //Text field 1 : Gets new Habit name from the User
        //JTextField textField1 = new JTextField(15);

        // Panel 4
        JPanel p4 = new JPanel();
        p4.setSize(new Dimension(250, 50));
        // Label 4
        JLabel l4 = new JLabel( "New Habit Type", JLabel.CENTER);
        l4.setPreferredSize(new Dimension(100, 30));
        l4.setLayout(new BorderLayout());
        //Text field 2 : Gets new Habit type from the User
        //JTextField textField2 = new JTextField(15);    //set length of the text

        // Panel 5
        JPanel p5 = new JPanel();
        p5.setSize(new Dimension(250, 50));
        // Label 5

        //Button 1: EDIT
        JButton b1 = new JButton("EDIT"); //set label to button
        b1.addActionListener(this);

        frame.add(mainPanel);

        mainPanel.add(p1);
        mainPanel.add(p2);
        mainPanel.add(p3);
        mainPanel.add(p4);
        mainPanel.add(p5);

        p1.add(l1);

        p2.add(l2);
        p2.add(this.oldName);

        p3.add(l3);
        p3.add(this.newName);

        p4.add(l4);
        p4.add(this.newType);

        p5.add(b1);

        frame.pack();
        frame.setVisible(true);
    }
    /**
     * React to a button click that result in e.
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click" + e.getActionCommand());

        try{
            eHabit.edit(oldName.getText(), newName.getText(), newType.getText());
            JOptionPane.showMessageDialog(this, oldName.getText() + "%s edited.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    }







