//package ui.category;
//
//import controllers.category.CategoryEditFailed;
//import controllers.category.DeleteCategoryController;
//import controllers.category.EditCategoryController;
//import use_cases.categories.delete_category.DeleteCategoryOutputData;
//import use_cases.categories.edit_category.EditCategoryOutputData;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.WindowEvent;
//
//import static java.awt.Component.CENTER_ALIGNMENT;
//
//public class CategoryScreen {
//    public static String COLOURS[] = { "pink", "red", "white", "blue", "yellow", "green", "orange", "purple"};
//    private JFrame EditCategoryFrame;
//    private String name;
//    private String colour;
//    private int id;
//    private JButton save;
//    private JButton delete;
//    private JTextField categoryNameInput;
//    private JComboBox colourInput;
//    private EditCategoryController editController;
//    private DeleteCategoryController deleteController;
//
//    public CategoryScreen(EditCategoryController editController, DeleteCategoryController deleteController,
//                          int id, String name, String colour) {
//        this.colour = colour;
//        this.name = name;
//        this.id = id;
//        this.editController = editController;
//        this.deleteController = deleteController;
//
//        EditCategoryFrame = new JFrame("Edit Category");
//        EditCategoryFrame.setSize(500, 300);
//        EditCategoryFrame.setLocation(300, 200);
//        EditCategoryFrame.setTitle("Edit Category");
//        EditCategoryFrame.setVisible(true);
//        EditCategoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // layout
//        GridBagLayout layout = new GridBagLayout(); // need rows to adapt to number of tasks in that category
//        GridBagConstraints constraints = new GridBagConstraints();
//        EditCategoryFrame.setLayout(layout);
//
//        // labels
//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        JLabel nameLabel = new JLabel("Edit the category name: ");
//        nameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
//        EditCategoryFrame.add(nameLabel, constraints);
//
//        constraints.gridx = 0;
//        constraints.gridy = 1;
//        JLabel colourLabel = new JLabel("Edit the colour: ");
//        colourLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
//        EditCategoryFrame.add(colourLabel, constraints);
//
//        // input fields + button
//        constraints.gridx = 1;
//        constraints.gridy = 0;
//        categoryNameInput = new JTextField(name);
//        categoryNameInput.setAlignmentX(CENTER_ALIGNMENT);
//        EditCategoryFrame.add(categoryNameInput, constraints);
//
//        constraints.gridx = 1;
//        constraints.gridy = 1;
//        colourInput = new JComboBox(COLOURS);
//        colourInput.setSelectedItem(colour);
//        colourInput.setAlignmentX(CENTER_ALIGNMENT);
//        EditCategoryFrame.add(colourInput, constraints);
//
//        constraints.gridwidth = 2;
//        constraints.gridx = 0;
//        constraints.gridy = 3;
//        save = new JButton("Save");
//        save.setAlignmentX(CENTER_ALIGNMENT);
//        EditCategoryFrame.add(save, constraints);
//    }
//
//    public void actionPerformed(ActionEvent evt) {
//        if (evt.getSource() == save){
//            // save the changes
//            String categoryNameText = categoryNameInput.getText();
//            String colourText = (String) colourInput.getSelectedItem();
//            try {
//                EditCategoryOutputData editCategoryOutput = editController.create(id, categoryNameText, colourText, true);
//                JOptionPane.showMessageDialog(this.EditCategoryFrame, editCategoryOutput.getError());
//                EditCategoryFrame.dispatchEvent(new WindowEvent(EditCategoryFrame, WindowEvent.WINDOW_CLOSING));
//            } catch (CategoryEditFailed error){
//                JOptionPane.showMessageDialog(this.EditCategoryFrame, error.getMessage());
//            }
//
//        }
//        if (evt.getSource() == delete){
//            try {
//                DeleteCategoryOutputData deleteCategoryOutput = deleteController.delete(id);
//                JOptionPane.showMessageDialog(this.EditCategoryFrame, deleteCategoryOutput.getMessage());
//                EditCategoryFrame.dispatchEvent(new WindowEvent(EditCategoryFrame, WindowEvent.WINDOW_CLOSING));
//            } catch (CategoryEditFailed error){ // CategoryDeletionFailed ?
//                JOptionPane.showMessageDialog(this.EditCategoryFrame, error.getMessage());
//            }
//        }
//    }
//
//}
