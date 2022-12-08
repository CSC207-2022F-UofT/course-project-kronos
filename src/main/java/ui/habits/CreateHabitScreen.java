package ui.habits;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controllers.habits.CreateHabitController;

public class CreateHabitScreen extends JFrame implements ActionListener {

    /**
     * Produces a UI to add new Habits to the User's collection.
     */
    JTextField title = new JTextField(15);

    JTextField type = new JTextField(15);

    CreateHabitController userHabit;
    public CreateHabitScreen() {

        // The frame of the screen titled "HABIT CREATION PAGE"
        JFrame frame = new JFrame("HABIT CREATION PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The main panel of the screen which contains all other panels.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 0));

        // Panel 1
        JPanel panelCreate = new JPanel();
        panelCreate.setSize(new Dimension(250, 50));
        //Label 1
        JLabel labelCreate = new JLabel( "CREATE A NEW HABIT", JLabel.CENTER);

        // Panel 2
        JPanel panelEdit = new JPanel();
        panelEdit.setSize(new Dimension(250, 50));
        // Label 2
        JLabel labelEdit = new JLabel( "Habit Title", JLabel.CENTER);
        labelEdit.setPreferredSize(new Dimension(100, 30));
        labelEdit.setLayout(new BorderLayout());


        // Panel 3
        JPanel panelTrack = new JPanel();
        panelTrack.setSize(new Dimension(250, 50));
        // Label 3
        JLabel labelTrack = new JLabel( "Habit Type", JLabel.CENTER);
        labelTrack.setPreferredSize(new Dimension(100, 30));
        labelTrack.setLayout(new BorderLayout());

        // Panel 5
        JPanel panelSubmit = new JPanel();
        panelSubmit.setSize(new Dimension(250, 50));


        //Button 1 : Submit button
        JButton buttonSubmit = new JButton("SUBMIT");
        buttonSubmit.addActionListener(this);

        frame.add(mainPanel);

        mainPanel.add(panelCreate);
        mainPanel.add(panelEdit);
        mainPanel.add(panelTrack);
        mainPanel.add(panelSubmit);

        panelCreate.add(labelCreate);

        panelEdit.add(labelEdit);
        panelEdit.add(this.title);

        panelTrack.add(labelTrack);
        panelTrack.add(this.type);

        panelSubmit.add(buttonSubmit);

        frame.pack();
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent evt) {

        System.out.println("Click" + evt.getActionCommand());
        try {
            userHabit.create(title.getText(), type.getText());
            JOptionPane.showMessageDialog(this, title.getText() + "%s created.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }

}

