package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import controller?

public class CreateCategory extends JFrame implements ActionListener {

    // UI calls the presenter method

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
