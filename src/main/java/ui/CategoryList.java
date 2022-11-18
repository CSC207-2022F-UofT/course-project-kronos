package ui;

import entities.Task;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CategoryList extends JPanel {
    public CategoryList(int rows, ArrayList<Task> tasks) {
        GridLayout layout = new GridLayout(rows, 2); // need rows to adapt to number of tasks in that category
        layout.setVgap(5);
        // JPanel components = new JPanel();
        // components.setLayout(layout);

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400, 560));
        this.setBackground(ColourPalette.white); // need to set the colour to specified from category

        // ? have to populate the list from here with tasks

        populate(tasks);
    }

    public void populate(ArrayList<Task> tasks) {
        for (Task task: tasks){
            // this.add(task.getName()); // ? Task entity needs a getName() method
            // how do I add the new Category List's tasks without a reference name for the CategoryList?
            this.add(new JRadioButton()); // since adding is done from left to right, up to down
        }
    }


}
