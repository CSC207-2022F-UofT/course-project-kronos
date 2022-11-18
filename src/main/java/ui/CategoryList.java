package ui;

import entities.Category;
import entities.CategoryFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CategoryList extends JPanel {
    public CategoryList(int rows) {
        GridLayout layout = new GridLayout(rows, 2); // need rows to adapt to number of tasks in that category
        layout.setVgap(5);
        // JPanel components = new JPanel();
        // components.setLayout(layout);

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400, 560));
        this.setBackground(ColourPalette.white); // need to set the colour to specified from category
    }



}
