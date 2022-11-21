package ui;

import entities.Category;
import entities.Task;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CategoryList extends JPanel {
    public CategoryList(Category category, int rows, ArrayList<Task> tasks) {
        GridBagLayout layout = new GridBagLayout(); // need rows to adapt to number of tasks in that category
        GridBagConstraints constraints = new GridBagConstraints();

        this.setLayout(layout);
        // this.setPreferredSize(new Dimension(500, tasks.size()*20));

        // add Category label
        JLabel categoryLabel = new JLabel(category.getName());
        categoryLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        categoryLabel.setHorizontalAlignment(JLabel.CENTER);
        categoryLabel.setBackground(ColourPalette.getColour(category.getColour()));

        constraints.gridwidth = 4;
        constraints.ipady = 20;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(categoryLabel, constraints);

        //  have to populate the list from here with tasks
        if (!category.getTasks().convertToArray().isEmpty()) {
            populate(tasks, constraints);
        }

    }

    public void populate(ArrayList<Task> tasks, GridBagConstraints constraints) {
        int y = 3;
        for (Task task: tasks){
            constraints.gridwidth = 1;
            constraints.gridx = 0;
            constraints.gridy = y;
            constraints.ipadx = 20;
            this.add(new JLabel(task.getName()), constraints);

            constraints.gridwidth = 2;
            constraints.gridx = 1;
            constraints.gridy = y;
            constraints.ipadx = 40;
            String deadline;

            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

            if (task.getDeadline() != null) {
                deadline = dateFormat.format(task.getDeadline().getTime());
            } else {
                deadline = "";
            }
            this.add(new JLabel(deadline), constraints);

            constraints.gridx = 3;
            constraints.gridy = y;
            constraints.ipadx = 0;
            this.add(new JRadioButton(), constraints); // since adding is done from left to right, up to down
            y ++;
        }
    }


}
