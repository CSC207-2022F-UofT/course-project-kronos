package ui;

import entities.*;
import use_cases.categories.create_category.CreateCategoryInputBound;

import java.util.Calendar;

public class Main {

    public static String first = "Bob";
    public static String last = "Smith";
    public static String email = "example@gmail.com";
    public static String password = "password";
    public static HabitFactory habits = new HabitFactory();
    public static CategoryFactory categories = new CategoryFactory();
    public static TaskFactory tasks = new TaskFactory();

    public static Calendar deadline1 = Calendar.getInstance();
    public static Calendar deadline2 = Calendar.getInstance();
    public static Task task1 = new Task("task 1", deadline1);
    public static Task task2 = new Task("task 1", deadline2);
    public static Category category1 = new Category("Category 1", "Red");

    public static Timer timer = new Timer();




    /**
     * this is a temporary class to check that the UI and other files work while the UI pages
     * aren't connected yet.
     */

    public static void main(String[] args){
        task1.setTaskCategory("Category 1");
        task2.setTaskCategory("Category 1");
        tasks.addItem(task1);
        tasks.addItem(task2);
        category1.addTask(task1);
        category1.addTask(task2);
        categories.addItem(category1);

        User user = new User(email, password, first, last, habits, tasks, categories, timer);
        // CreateCategoryInputBound interactor = new CreateCategory(user,)

        new ToDoViewModel(user);
    }
}
