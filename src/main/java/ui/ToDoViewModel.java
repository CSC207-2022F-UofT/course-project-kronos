package ui;

import entities.Category; // shouldn't reference entity classes
import entities.User;
import task_use_cases.CategoryPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ToDoViewModel extends JFrame{
    public User user = new User(); // ? need to keep track of the user somehow, don't declare a new one
    private TitleBar title;

    public ToDoViewModel() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        title = new TitleBar();
        CategoryPresenter presenter = new CategoryPresenter(user);
        ArrayList<Category> categories = presenter.getAllCategories(); // ? User needs a getter for CategoryFactory (CategoryCollection)

        for (Category cat: categories) { // loops through all the user's categories
            // adding a new CategoryList to the frame with up to date row number (row num = tasks num)
            this.add(new CategoryList(cat.getTasks().getH_items().size(), cat.getTasks().convertToArray()), BorderLayout.CENTER);  // ? need getter for getH_items (hashmap) from TaskFactory, size = num of tasks in hasmap
            // can size() be called on an empty hashmap or null?
        }

        this.add(title, BorderLayout.NORTH);



    }


}
