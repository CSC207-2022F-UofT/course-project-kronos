package ui;
import javax.swing.*;
import java.awt.*;
import controller.CreateHabitController;


public class HabitCreation {

    public static void addHabit () {
        //initialize button, panel, label, and text field
        JFrame frame = new JFrame("HABIT CREATION PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel major = new JPanel();
        major.setLayout(new GridLayout(5, 0));
        JPanel p = new JPanel();
        p.setSize(new Dimension(250, 50));
        JLabel l = new JLabel( "CREATE A NEW HABIT", JLabel.CENTER);
        JPanel p1 = new JPanel();
        p1.setSize(new Dimension(250, 50));
        JLabel l1 = new JLabel( "Habit Title", JLabel.CENTER);
        l1.setPreferredSize(new Dimension(100, 30));
        l1.setLayout(new BorderLayout());
        //create text field to get username from the user
        JTextField textField1 = new JTextField(15);    //set length of the text
        JPanel p2 = new JPanel();
        p2.setSize(new Dimension(250, 50));
        JLabel l2 = new JLabel( "Habit Type", JLabel.CENTER);
        l2.setPreferredSize(new Dimension(100, 30));
        l2.setLayout(new BorderLayout());
        //create text field to get username from the user
        JTextField textField2 = new JTextField(15);    //set length of the text

        JPanel p3 = new JPanel();
        p3.setSize(new Dimension(250, 50));
        JLabel l3 = new JLabel( "Reminder ON/OFF", JLabel.CENTER);
        l3.setPreferredSize(new Dimension(150, 30));
        l3.setLayout(new BorderLayout());
        //create text field to get username from the user

        String[] options = {"ON", "OFF"};

        JList<String> remList = new JList<>(options);

        remList.setSelectedIndex(1);//set length of the text

        JPanel p5 = new JPanel();
        p5.setSize(new Dimension(250, 50));

        String s = textField1.getText();
        String t = textField1.getText();
        String b = remList.getSelectedValue();




        //create submit button
        JButton b1 = new JButton("SUBMIT"); //set label to button
        b1.addActionListener(e -> CreateHabitController.HabitCreation(s,t,b));

        frame.add(major);
        major.add(p);
        p.add(l);
        major.add(p1);
        major.add(p2);
        major.add(p3);
        major.add(p5);
        p5.add(b1);

        p1.add(l1);
        p1.add(textField1);
        p2.add(l2);
        p2.add(textField2);
        p3.add(l3);
        p3.add(remList);

        frame.pack();
        frame.setVisible(true);

        }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(HabitCreation::addHabit);
    }
}

