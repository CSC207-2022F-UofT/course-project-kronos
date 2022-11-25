package ui.category;

import entities.CategoryFactory;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    private JButton newTask = new JButton("New Task");
    private JButton newCategory = new JButton("New Category");

    public TitleBar(CategoryFactory factory) {
        newTask.setFont(new Font("Serif", Font.PLAIN, 15));
        newCategory.setFont(new Font("Serif", Font.PLAIN, 15));

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        this.setLayout(layout);

        // this.setPreferredSize(new Dimension(600, 100));
        this.setBackground(ColourPalette.purple);
        JLabel title = new JLabel("To Do List");
        // title.setPreferredSize(new Dimension(200, 60));

        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;

        title.setFont(new Font("Serif", Font.BOLD, 20));
        title.setHorizontalAlignment(JLabel.CENTER);
        this.add(title, constraints);


        // add buttons
        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(newTask, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        this.add(newCategory, constraints);

        newCategory.addActionListener(e -> CreateCategory.createCategory(factory));
    }
}
