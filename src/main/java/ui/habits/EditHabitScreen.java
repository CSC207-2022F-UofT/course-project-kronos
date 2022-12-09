package ui.habits;
import controllers.habits.EditHabitController;

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
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // The main panel of the screen which contains all other panels.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 0));

        JPanel panelEdit = new JPanel();
        panelEdit.setSize(new Dimension(250, 50));
        JLabel labelEdit = new JLabel( "EDIT A HABIT", JLabel.CENTER);

        JPanel panelOldName = new JPanel();
        panelOldName.setSize(new Dimension(250, 50));
        JLabel labelOldName = new JLabel( "Old Habit Name", JLabel.CENTER);
        labelOldName.setPreferredSize(new Dimension(100, 30));
        labelOldName.setLayout(new BorderLayout());

        JPanel panelNewName = new JPanel();
        panelNewName.setSize(new Dimension(250, 50));
        JLabel labelNewName = new JLabel( "New Habit Name", JLabel.CENTER);
        labelNewName.setPreferredSize(new Dimension(100, 30));
        labelNewName.setLayout(new BorderLayout());

        JPanel panelNewType = new JPanel();
        panelNewType.setSize(new Dimension(250, 50));
        JLabel labelNewType = new JLabel( "New Habit Type", JLabel.CENTER);
        labelNewType.setPreferredSize(new Dimension(100, 30));
        labelNewType.setLayout(new BorderLayout());

        JPanel panelButton = new JPanel();
        panelButton.setSize(new Dimension(250, 50));

        //Button: EDIT
        JButton button = new JButton("EDIT"); //set label to button
        button.addActionListener(this);

        frame.add(mainPanel);

        mainPanel.add(panelEdit);
        mainPanel.add(panelOldName);
        mainPanel.add(panelNewName);
        mainPanel.add(panelNewType);
        mainPanel.add(panelButton);

        panelEdit.add(labelEdit);

        panelOldName.add(labelOldName);
        panelOldName.add(this.oldName);

        panelNewName.add(labelNewName);
        panelNewName.add(this.newName);

        panelNewType.add(labelNewType);
        panelNewType.add(this.newType);

        panelButton.add(button);

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
            JOptionPane.showMessageDialog(this, oldName.getText() + " edited.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public static void editScreen(){

        new EditHabitScreen();

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(EditHabitScreen::editScreen);
    }
    }







