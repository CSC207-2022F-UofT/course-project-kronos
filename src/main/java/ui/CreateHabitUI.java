package ui;
import javax.swing.*;
import java.awt.*;
import controllers.CreateHabitController;
import static example_user.UserExample.sendUser;


public class CreateHabitUI {

    /**
     * Produces a UI to add new Habits to the User's collection.
     */
    public static void addNewHabit () {

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
        JTextField textField1 = new JTextField(15);

        // Panel 3
        JPanel p3 = new JPanel();
        p3.setSize(new Dimension(250, 50));
        // Label 3
        JLabel l3 = new JLabel( "Habit Type", JLabel.CENTER);
        l3.setPreferredSize(new Dimension(100, 30));
        l3.setLayout(new BorderLayout());
        //Text field 2 : Gets Habit type from user
        JTextField textField2 = new JTextField(15);

        // Panel 4
        JPanel p4 = new JPanel();
        p4.setSize(new Dimension(250, 50));
        // Label 4
        JLabel l4 = new JLabel( "Reminder ON/OFF", JLabel.CENTER);
        l4.setPreferredSize(new Dimension(150, 30));
        l4.setLayout(new BorderLayout());
        // String Array of possible states for Reminder
        String[] options = {"ON", "OFF"};
        // JList 1
        JList<String> reminderOptions = new JList<>(options);
        reminderOptions.setSelectedIndex(1);

        // Panel 5
        JPanel p5 = new JPanel();
        p5.setSize(new Dimension(250, 50));


        //Button 1 : Submit button
        JButton b1 = new JButton("SUBMIT");
        b1.addActionListener(e -> {
            String s = textField1.getText();
            String t = textField1.getText();
            String b = reminderOptions.getSelectedValue();
            CreateHabitController.createHabitC(sendUser(), s, t, b);
        });


        frame.add(mainPanel);

        mainPanel.add(p1);
        mainPanel.add(p2);
        mainPanel.add(p3);
        mainPanel.add(p4);
        mainPanel.add(p5);

        p1.add(l1);

        p2.add(l2);
        p2.add(textField1);

        p3.add(l3);
        p3.add(textField2);

        p4.add(l4);
        p4.add(reminderOptions);

        p5.add(b1);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(CreateHabitUI::addNewHabit);
    }
}

