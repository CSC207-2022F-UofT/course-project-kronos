//package ui.category;
//
//import controllers.category.CategoryCreationFailed;
//import controllers.category.CreateCategoryController;
//import use_cases.categories.create_category.CreateCategoryOutputData;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.WindowEvent;
//
//import static java.awt.Component.CENTER_ALIGNMENT;
//
//public class CreateCategoryScreen {
//    public static String COLOURS[] = { "pink", "red", "white", "blue", "yellow", "green", "orange", "purple"};
//    private JFrame createCategoryFrame;
//    private JButton createCategoryButton;
//    private JTextField categoryNameInput;
//    private JComboBox colourInput;
//    private CreateCategoryController controller;
//
//    public CreateCategoryScreen(CreateCategoryController controller) {
//        this.controller = controller;
//
//        createCategoryFrame = new JFrame("Create Category");
//        createCategoryFrame.setSize(500, 300);
//        createCategoryFrame.setLocation(300, 200);
//        createCategoryFrame.setTitle("Create Category");
//        createCategoryFrame.setVisible(true);
//        createCategoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // layout
//        GridBagLayout layout = new GridBagLayout(); // need rows to adapt to number of tasks in that category
//        GridBagConstraints constraints = new GridBagConstraints();
//        createCategoryFrame.setLayout(layout);
//
//        // labels
//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        JLabel categoryName = new JLabel("Category Name");
//        categoryName.setAlignmentX(Component.LEFT_ALIGNMENT);
//        createCategoryFrame.add(categoryName, constraints);
//
//        constraints.gridx = 0;
//        constraints.gridy = 1;
//        JLabel colour = new JLabel("Chose a colour");
//        colour.setAlignmentX(Component.LEFT_ALIGNMENT);
//        createCategoryFrame.add(colour, constraints);
//
//        // input fields + button
//        constraints.gridx = 1;
//        constraints.gridy = 0;
//        categoryNameInput = new JTextField("Category Name");
//        categoryNameInput.setAlignmentX(CENTER_ALIGNMENT);
//        createCategoryFrame.add(categoryNameInput, constraints);
//
//        constraints.gridx = 1;
//        constraints.gridy = 1;
//        colourInput = new JComboBox(COLOURS);
//        colourInput.setAlignmentX(CENTER_ALIGNMENT);
//        createCategoryFrame.add(colourInput, constraints);
//
//        constraints.gridwidth = 2;
//        constraints.gridx = 0;
//        constraints.gridy = 3;
//        createCategoryButton = new JButton("Create");
//        createCategoryButton.setAlignmentX(CENTER_ALIGNMENT);
//        createCategoryFrame.add(createCategoryButton, constraints);
//    }
//
//    public void actionPerformed(ActionEvent evt) {
//        if (evt.getSource() == createCategoryButton){
//            String categoryNameText = categoryNameInput.getText();
//            String colourText = (String) colourInput.getSelectedItem();
//
//            try {
//                CreateCategoryOutputData createCategoryOutput = controller.create(categoryNameText, colourText);
//                JOptionPane.showMessageDialog(this.createCategoryFrame, createCategoryOutput.getError());
//                createCategoryFrame.dispatchEvent(new WindowEvent(createCategoryFrame, WindowEvent.WINDOW_CLOSING));
//            } catch (CategoryCreationFailed error){
//                JOptionPane.showMessageDialog(this.createCategoryFrame, error.getMessage());
//            }
//
//        }
//    }
//
//}
