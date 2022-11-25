package ui.category;

import controllers.category.CategoryController;
import entities.CategoryFactory;
import use_cases.categories.create_category.CreateCategoryInputData;
import use_cases.categories.create_category.CreateCategoryOutputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

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

        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel colour = new JLabel("Chose a colour");
        categoryName.setAlignmentX(Component.LEFT_ALIGNMENT);
        frame.add(colour, constraints);

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

        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 3;
        JButton createCategory = new JButton("Create");
        createCategory.setAlignmentX(CENTER_ALIGNMENT);
        frame.add(createCategory, constraints);

        createCategory.addActionListener(e -> {
            String action = e.getActionCommand();
            if (action == "Create") {
                String categoryName1 = categoryNameInput.getText();
                String colour1 = (String) colourInput.getSelectedItem();

                // pass this onto controller
                CreateCategoryInputData inputData = new CreateCategoryInputData(categoryName1, colour1);
                // this is never used, so where do we use input data since we don't have to convert anything?

                CategoryController controller = new CategoryController(factory, categoryName1, colour1);
                CreateCategoryOutputData outputData = controller.CreateCategory();

                // create a new CategoryList - how to add it back to ToDoViewModel?
                ToDoViewModel.update(outputData);

                // close window
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });

    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
