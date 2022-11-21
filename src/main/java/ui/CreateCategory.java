package ui;

import controllers.CategoryController;
import entities.CategoryFactory;
import use_cases.categories.create_category.CreateCategoryInputData;
import use_cases.categories.create_category.CreateCategoryOutputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class CreateCategory extends JFrame implements ActionListener {
    public static String COLOURS[] = { "pink", "red", "white", "blue", "yellow", "green", "orange", "purple"};

    public static void createCategory(CategoryFactory factory) {
        JFrame frame = new JFrame("New Category");

        frame.setSize(500, 300);
        frame.setLocation(300, 200);
        frame.setTitle("Create Category");
        frame.setVisible(true);

        // layout
        GridBagLayout layout = new GridBagLayout(); // need rows to adapt to number of tasks in that category
        GridBagConstraints constraints = new GridBagConstraints();
        frame.setLayout(layout);

        // labels
        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel categoryName = new JLabel("Category Name");
        categoryName.setAlignmentX(Component.LEFT_ALIGNMENT);
        frame.add(categoryName, constraints);

        // input fields + button
        constraints.gridx = 1;
        constraints.gridy = 0;
        JTextField categoryNameInput = new JTextField("Category Name");
        categoryNameInput.setAlignmentX(CENTER_ALIGNMENT);
        frame.add(categoryNameInput, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        JComboBox colourInput = new JComboBox(COLOURS);
        colourInput.setAlignmentX(CENTER_ALIGNMENT);
        frame.add(colourInput, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        JButton createCategory = new JButton("Create");
        createCategory.setAlignmentX(CENTER_ALIGNMENT);
        frame.add(createCategory, constraints);



        createCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String action = e.getActionCommand();
                if (action == "Create") {
                    String categoryName = categoryNameInput.getText();
                    String colour = (String) colourInput.getSelectedItem(); // ? need to check that these are the same as COLOURS list
                    // pass this onto controller
                    CreateCategoryInputData inputData = new CreateCategoryInputData(categoryName, colour);
                    CategoryController controller = new CategoryController(factory, categoryName, colour);
                    CreateCategoryOutputData outputData = controller.CreateCategory();

                    // create a new CategoryList
                    CategoryList categoryList = new CategoryList(outputData.getCategory(), 0, new ArrayList<>()); // empty list since no tasks

                    // close window
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
            }
        });

    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
