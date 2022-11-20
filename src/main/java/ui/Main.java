package ui;

import entities.*;

public class Main {

    public static String first = "Bob";
    public static String last = "Smith";
    public static String email = "example@gmail.com";
    public static String password = "password";
    public static HabitFactory habits = new HabitFactory();
    public static CategoryFactory categories = new CategoryFactory();
    public static TaskFactory tasks = new TaskFactory();
    public static Timer timer = new Timer();

    public static User user = new User(email, password, first, last, habits, tasks, categories, timer);


    /**
     * this is a temporary class to check that the UI and other files work while the UI pages
     * aren't connected yet.
     */

    public static void main(String[] args){
        new ToDoViewModel(user);
    }
}
