package ui.category;

import controllers.category.CategoryCreationFailed;
import controllers.category.CreateCategoryController;
import use_cases.categories.create_category.CreateCategoryOutputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import static java.awt.Component.CENTER_ALIGNMENT;
import static java.awt.Component.LEFT_ALIGNMENT;

public class CreateCategoryScreen {
    public static String COLOURS[] = { "pink", "red", "blue", "yellow", "green", "orange", "purple", "grey"};
    public JFrame createCategoryFrame;
    private JButton createCategoryButton;
    private JTextField categoryNameInput;
    private JComboBox colourInput;
    private CreateCategoryController controller;

    public CreateCategoryScreen(CreateCategoryController controller) {
        this.controller = controller;

        createCategoryFrame = new JFrame("Create Category");
        createCategoryFrame.setSize(500, 300);
        createCategoryFrame.setLocation(800, 200);
        createCategoryFrame.setTitle("Create Category");
        createCategoryFrame.setVisible(true);
        createCategoryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // layout
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        createCategoryFrame.setLayout(layout);

        // labels
        constraints.insets = new Insets(0, 15, 5, 15);
        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel categoryName = new JLabel("Category Name");
        categoryName.setAlignmentX(Component.LEFT_ALIGNMENT);
        categoryName.setFont(new Font("Serif", Font.BOLD, 15));
        createCategoryFrame.add(categoryName, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel colour = new JLabel("Chose a colour");
        colour.setFont(new Font("Serif", Font.BOLD, 15));
        colour.setAlignmentX(Component.LEFT_ALIGNMENT);
        createCategoryFrame.add(colour, constraints);

        // input fields + button
        constraints.gridx = 1;
        constraints.gridy = 0;
        categoryNameInput = new JTextField("Category Name");
        categoryNameInput.setFont(new Font("Serif", Font.PLAIN, 15));
        categoryNameInput.setForeground(Color.gray);
        createCategoryFrame.add(categoryNameInput, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        colourInput = new JComboBox(COLOURS);
        colourInput.setFont(new Font("Serif", Font.PLAIN, 15));
        createCategoryFrame.add(colourInput, constraints);

        constraints.insets = new Insets(30, 0, 0, 0);
        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 3;
        createCategoryButton = new JButton("Create");
        createCategoryButton.setFont(new Font("Serif", Font.BOLD, 15));
        createCategoryButton.setBackground(Color.white);
        createCategoryButton.setAlignmentX(CENTER_ALIGNMENT);
        createCategoryFrame.add(createCategoryButton, constraints);
        createCategoryButton.addActionListener(e -> {
            if (e.getSource() == createCategoryButton){
                String categoryNameText = categoryNameInput.getText();
                String colourText = (String) colourInput.getSelectedItem();

                try {
                    CreateCategoryOutputData createCategoryOutput = controller.create(categoryNameText, colourText);
                    JOptionPane.showMessageDialog(this.createCategoryFrame, createCategoryOutput.getError()); // ? Null Pointer Exception thrown
                    createCategoryFrame.dispatchEvent(new WindowEvent(createCategoryFrame, WindowEvent.WINDOW_CLOSING));
                } catch (CategoryCreationFailed error){
                    JOptionPane.showMessageDialog(this.createCategoryFrame, error.getMessage());
                }
            }
        });
    }

    public static void loadScreen(CreateCategoryController createController) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateCategoryScreen createCategoryScreen = new CreateCategoryScreen(createController);
                createCategoryScreen.createCategoryFrame.setVisible(true);
            }
        });
    }

}
