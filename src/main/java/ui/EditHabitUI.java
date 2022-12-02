package ui;
import controllers.habits.create.CreateHabitController;
import controllers.habits.edit.EditHabitController;
import javax.swing.*;
import java.awt.*;

public class EditHabitUI {

    /**
     * Produces a UI to edit existing Habits in the User's collection.
     */

    EditHabitController uHabit;
    public void editExistingHabit(EditHabitController u) {

        this.uHabit = u;

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
        JLabel l2 = new JLabel( "Choose Habit", JLabel.CENTER);
        l2.setPreferredSize(new Dimension(100, 30));
        l2.setLayout(new BorderLayout());

        //int sizeCollection = uHabit.getHabitCollection().habitCollection.size();
        //String[] habitList = new String[sizeCollection];
        int k = 0;
        //for(String i :sendUser().getHabitCollection().habitCollection.keySet()){
          //  habitList[k] = i;
            k = k + 1;
        }
        // JList 1
        //JList<String> habitOptions = new JList<>(habitList);

        // Panel 3
        JPanel p3 = new JPanel();
        //p3.setSize(new Dimension(250, 50));
        // Label 3
        JLabel l3 = new JLabel( "New Habit Name", JLabel.CENTER);
        //l3.setPreferredSize(new Dimension(100, 30));
        //l3.setLayout(new BorderLayout());
        //Text field 1 : Gets new Habit name from the User
        JTextField textField1 = new JTextField(15);

        // Panel 4
        JPanel p4 = new JPanel();
        //p4.setSize(new Dimension(250, 50));
        // Label 4
        JLabel l4 = new JLabel( "New Habit Type", JLabel.CENTER);
        //l4.setPreferredSize(new Dimension(150, 30));
        //l4.setLayout(new BorderLayout());
        //Text field 2 : Gets new Habit type from the User
        JTextField textField2 = new JTextField(15);    //set length of the text


        // Panel 6
        JPanel p6 = new JPanel();
        //p6.setSize(new Dimension(250, 50));

        //String habitChosen = habitOptions.getSelectedValue();
        String newHabitName = textField1.getText();
        String newHabitType = textField2.getText();

        //Button 1: EDIT
        JButton b1 = new JButton("EDIT"); //set label to button
        //b1.addActionListener(e -> EditHabitController.editHabitC(sendUser(), habitChosen, newHabitName, newHabitType));

        //frame.add(mainPanel);

        //mainPanel.add(p1);
        //mainPanel.add(p2);
        //mainPanel.add(p3);
        //mainPanel.add(p4);
        //mainPanel.add(p6);

        //p1.add(l1);

        //p2.add(l2);
        //p2.add(habitOptions);

        //p3.add(l3);
        //p3.add(textField1);

        //p4.add(l4);
        //p4.add(textField2);

        //p6.add(b1);

        //frame.pack();
        //frame.setVisible(true);

    }




