package ui.category;

import controllers.category.CategoryEditFailed;
import controllers.category.DeleteCategoryController;
import controllers.category.EditCategoryController;
import use_cases.categories.delete_category.DeleteCategoryOutputData;
import use_cases.categories.edit_category.EditCategoryOutputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import static java.awt.Component.*;
/**
 * -- UI --
 * The screen for editing a Category
 */
public class CategoryScreen implements ActionListener {
    /**
     * The possible colours for the Category
     */
    public static String[] COLOURS = {"pink", "red", "white", "blue", "yellow", "green", "orange", "purple", "grey"};

    /**
     * The Controllers
     */
    private final EditCategoryController editController;
    private final DeleteCategoryController deleteController;

    /**
     * Frame components and input information
     */
    private static JFrame EditCategoryFrame;
    private final int id;
    private final JButton save;
    private final JButton delete;
    private final JTextField categoryNameInput;
    protected final JComboBox colourInput;


    public CategoryScreen(EditCategoryController editController, DeleteCategoryController deleteController,
                          int id, String name, String colour) {
        this.id = id;
        this.editController = editController;
        this.deleteController = deleteController;

        EditCategoryFrame = new JFrame("Edit Category");
        EditCategoryFrame.setSize(500, 300);
        EditCategoryFrame.setLocation(800, 200);
        EditCategoryFrame.setTitle("Edit Category");
        EditCategoryFrame.setVisible(true);
        EditCategoryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // layout
        GridBagLayout layout = new GridBagLayout(); // need rows to adapt to number of tasks in that category
        GridBagConstraints constraints = new GridBagConstraints();
        EditCategoryFrame.setLayout(layout);

        // labels
        constraints.insets = new Insets(0, 15, 5, 15);
        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel nameLabel = new JLabel("Edit the category name: ");
        nameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        nameLabel.setFont(new Font("Serif", Font.BOLD, 15));
        EditCategoryFrame.add(nameLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel colourLabel = new JLabel("Edit the colour: ");
        colourLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        colourLabel.setFont(new Font("Serif", Font.BOLD, 15));
        EditCategoryFrame.add(colourLabel, constraints);

        // input fields + button
        constraints.gridx = 1;
        constraints.gridy = 0;
        categoryNameInput = new JTextField(name);
        categoryNameInput.setForeground(Color.gray);
        categoryNameInput.setAlignmentX(CENTER_ALIGNMENT);
        categoryNameInput.setFont(new Font("Serif", Font.PLAIN, 15));
        EditCategoryFrame.add(categoryNameInput, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        colourInput = new JComboBox(COLOURS);
        colourInput.setSelectedItem(colour);
        colourInput.setAlignmentX(CENTER_ALIGNMENT);
        colourInput.setFont(new Font("Serif", Font.PLAIN, 15));
        EditCategoryFrame.add(colourInput, constraints);

        constraints.insets = new Insets(30, 0, 0, 0);
        constraints.gridx = 0;
        constraints.gridy = 3;
        delete = new JButton("Delete");
        delete.setAlignmentX(RIGHT_ALIGNMENT);
        delete.setFont(new Font("Serif", Font.BOLD, 15));
        delete.setBackground(Color.white);
        EditCategoryFrame.add(delete, constraints);

        constraints.insets = new Insets(30, 0, 0, 0);
        constraints.gridx = 1;
        constraints.gridy = 3;
        save = new JButton("Save");
        save.setAlignmentX(LEFT_ALIGNMENT);
        save.setFont(new Font("Serif", Font.BOLD, 15));
        save.setBackground(Color.white);
        EditCategoryFrame.add(save, constraints);
        save.addActionListener(this);
    }

    public static void loadScreen(EditCategoryController editController, DeleteCategoryController deleteController,
                                  int id, String name, String colour) {
        EventQueue.invokeLater(() -> {
            // CategoryScreen categoryScreen = new CategoryScreen(editController, deleteController, id, name, colour);
            EditCategoryFrame.setVisible(true);
        });
    }
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == save){
            // save the changes
            String categoryNameText = categoryNameInput.getText();
            String colourText = (String) colourInput.getSelectedItem();
            try {
                EditCategoryOutputData editCategoryOutput = editController.create(id, categoryNameText, colourText, true);
                JOptionPane.showMessageDialog(EditCategoryFrame, editCategoryOutput.getError());
                EditCategoryFrame.dispatchEvent(new WindowEvent(EditCategoryFrame, WindowEvent.WINDOW_CLOSING));
            } catch (CategoryEditFailed error){
                JOptionPane.showMessageDialog(EditCategoryFrame, error.getMessage());
            }

        }
        if (evt.getSource() == delete){
            try {
                DeleteCategoryOutputData deleteCategoryOutput = deleteController.delete(id);
                JOptionPane.showMessageDialog(EditCategoryFrame, deleteCategoryOutput.getMessage());
                EditCategoryFrame.dispatchEvent(new WindowEvent(EditCategoryFrame, WindowEvent.WINDOW_CLOSING));
            } catch (CategoryEditFailed error){ // CategoryDeletionFailed ?
                JOptionPane.showMessageDialog(EditCategoryFrame, error.getMessage());
            }
        }
    }

}
