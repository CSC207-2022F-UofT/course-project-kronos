package ui.category;

import entities.Category; // shouldn't reference entity classes?
import entities.CommonUser;
import use_cases.categories.create_category.CreateCategoryOutputData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * THIS IS A PRACTISE RUN
 */
public class ToDoViewModel extends JFrame{

    public CommonUser user = new CommonUser(); // ? need to keep track of the user somehow, don't declare a new one
    private TitleBar title;
    public static JFrame frame = new JFrame("To Do List");
    public static GridBagLayout layout = new GridBagLayout();
    public static GridBagConstraints constraints = new GridBagConstraints();
    public static Dimension dimension = new Dimension(1080, 800);
    public static int y = 2;
    public ToDoViewModel(CommonUser user) {
        layout.minimumLayoutSize(frame);
        frame.setLayout(layout);
        frame.setSize(dimension);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        title = new TitleBar(user.getCategoryCollection());
        ArrayList<Category> categories = user.getCategoryCollection().convertToArray();

        // labels for the table
        JLabel legendName = new JLabel("Task");
        legendName.setFont(new Font("Serif", Font.PLAIN, 15));
        constraints.gridx = 0;
        constraints.ipadx = 20;
        constraints.gridy = 1;
        constraints.ipady = 0;
        constraints.gridwidth = 1;
        frame.add(legendName, constraints);

        JLabel legendDeadline = new JLabel("Deadline");
        legendDeadline.setFont(new Font("Serif", Font.PLAIN, 15));
        constraints.gridx = 1;
        constraints.gridy = 1;
        frame.add(legendDeadline, constraints);

        JLabel legendCompletion = new JLabel("Completion");
        legendCompletion.setFont(new Font("Serif", Font.PLAIN, 15));
        constraints.gridx = 2;
        constraints.gridy = 1;
        frame.add(legendCompletion, constraints);

        for (Category cat: categories) { // loops through all the user's categories
            constraints.gridwidth = 3;
            constraints.gridx = 0;
            constraints.gridy = y;
            int size;
            if (cat.getTasks().getTasks() == null) { size = 0;
            } else { size = cat.getTasks().getTasks().size(); }
            frame.add(new CategoryList(cat, size, cat.getTasks().convertToArray()), constraints);
            y++;
        }

        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(title, constraints);

    }

    public static void update(CreateCategoryOutputData outputData) {
        CategoryList categoryList = new CategoryList(outputData.getCategory(), 0, new ArrayList<>()); // empty list since no tasks
        constraints.gridx = 0;
        constraints.gridy = y;
        frame.add(categoryList, constraints); // why does this not update the model?
        y ++;
    }


}
