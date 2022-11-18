package ui;

import adapters.CreateCategoryPresenter;
import entities.Category;
import entities.CategoryFactory;
import entities.Task;
import entities.User;
import input_output.CreateCategoryInputBound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ToDoViewModel extends JFrame{
    public User user = new User(); // ? need to keep track of the user somehow, don't declare a new one
    private TitleBar title;
    private JButton newTask;
    private JButton newCategory;

    public ToDoViewModel() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        title = new TitleBar();
        ArrayList<Category> categories = updateList(user.getCategoryCollection); // User needs a getter for categories

        for (Category cat: categories) {
            CategoryList cat.getCategoryName() = new CategoryList(cat.getTasks().h_items).size(); // does this name declaration work?
            this.add(cat.getCategoryName(), BorderLayout.CENTER);  // ? replace h_items with the hashmap object name
            // can size() be called on an empty hashmap or null?
            for (Task task: cat.getTasks().h_items){ // populating the categoryList object with the category's tasks
                cat.getCategoryName().add(task.getName()); // ? need to make sure that Task entity has getters
                cat.getCategoryName().add(new JToggleButton()); // should be a checkmark button
            }
        }
        this.add(title, BorderLayout.NORTH);



    }


    public ArrayList<Category> updateList(CategoryFactory factory) {
        ArrayList<Category> categoryList = new ArrayList<>();
        if (factory.categories.isEmpty() == false) {
            for (Integer key : factory.categories.keySet()) {
                categoryList.add(factory.categories.get(key));
            }
        } // else don't populate the list
        return categoryList;
    }

}
