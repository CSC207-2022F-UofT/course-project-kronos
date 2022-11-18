package ui;

import entities.CategoryFactory;
import input_output.CreateCategoryInputBound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import controller?

public class CreateCategory extends JFrame implements ActionListener {

    public static void createCategory() {
        JFrame frame = new JFrame("New Category");

        frame.setSize(500, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Create Category");
        frame.setVisible(true);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));


        JTextField categoryNameInput = new JTextField("Category Name");
        categoryNameInput.setAlignmentX(CENTER_ALIGNMENT);
        frame.add(categoryNameInput);

        // JComboBox colourInput = new JComboBox(COLOURS);
        // colourInput.setAlignmentX(CENTER_ALIGNMENT);
        // add(colourInput);
        // colourInput.addActionListener(this); ? add action listeners later

        JButton createCategory = new JButton("Create");
        createCategory.setAlignmentX(CENTER_ALIGNMENT);
        frame.add(createCategory);
        createCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String action = e.getActionCommand();
                if (action == "Create") {
                    String categoryName = categoryNameInput.getText();
                    // String colour = (String) colourInput.getSelectedItem(); // ? need to check that these are the same as COLOURS list
                    // pass this onto input bound
                    // new CreateCategoryInputBound(categoryName, colour); // this line works
                }
            }
        });

    }

    public static void main(String[] args) { // ? have this here for now, need to move this to its own class later on
        CategoryFactory factory = new CategoryFactory(); // this definitly shouldn't be in this file, only for testing purposes
        new CreateCategory();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
