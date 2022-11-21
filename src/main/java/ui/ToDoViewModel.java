package ui;

import entities.Category; // shouldn't reference entity classes?
import entities.User;
import controllers.CategoryPresenter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ToDoViewModel extends JFrame{

    public User user = new User(); // ? need to keep track of the user somehow, don't declare a new one
    private TitleBar title;

    public ToDoViewModel(User user) {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        title = new TitleBar(user.getCategoryCollection());
        ArrayList<Category> categories = user.getCategoryCollection().convertToArray();

        for (Category cat: categories) { // loops through all the user's categories
            System.out.println("new category");
            // adding a new CategoryList to the frame with up to date row number (row num = tasks num)
            int size;
            if (cat.getTasks().getTasks() == null) {
                size = 0;
            } else {
                size = cat.getTasks().getTasks().size();
            }
            this.add(new CategoryList(cat, size, cat.getTasks().convertToArray()), BorderLayout.CENTER);
            // can size() be called on an empty hashmap or null?
        }

        this.add(title, BorderLayout.NORTH);



    }


}
