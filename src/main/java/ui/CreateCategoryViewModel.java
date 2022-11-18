package ui;

import entities.CategoryFactory;
import input_output.CreateCategoryInputBound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import controller?

public class CreateCategoryViewModel extends JFrame implements ActionListener { // should I be separating the frame from the action listener?
    // how to get the data from input --> use case --> output? Can't just create a new presenter object cause
    // it doesn't retain the same original information

    private static String[] COLOURS = {"BLACK", "WHITE", "RED", "BLUE", "YELLOW", "PURPLE", "GREEN", "ORANGE", "GREY", "PINK", "BROWN"};
    // ? should have the line above and other constant stylizations in a separate file so we can all reference it

    public CreateCategoryViewModel() {
        setSize(500, 300);
        setLocation(100, 100);
        setTitle("Create Category");
        setVisible(true);

        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));


        JTextField categoryNameInput = new JTextField("Category Name");
        categoryNameInput.setAlignmentX(CENTER_ALIGNMENT);
        add(categoryNameInput);

        JComboBox colourInput = new JComboBox(COLOURS);
        colourInput.setAlignmentX(CENTER_ALIGNMENT);
        add(colourInput);
        // colourInput.addActionListener(this); ? add action listeners later

        JButton createCategory = new JButton("Create");
        createCategory.setAlignmentX(CENTER_ALIGNMENT);
        add(createCategory);
        createCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String action = e.getActionCommand();
                if (action == "Create") {
                    String categoryName = categoryNameInput.getText();
                    String colour = (String) colourInput.getSelectedItem(); // ? need to check that these are the same as COLOURS list
                    // pass this onto input bound
                    new CreateCategoryInputBound(categoryName, colour); // this line works
                }
            }
        });

    }

    public static void main(String[] args) { // ? have this here for now, need to move this to its own class later on
        CategoryFactory factory = new CategoryFactory(); // this definitly shouldn't be in this file, only for testing purposes
        new CreateCategoryViewModel();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
