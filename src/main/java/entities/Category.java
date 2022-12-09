package entities;

import java.io.Serializable;

public class Category implements Serializable {

    private static int numberOfCategories = 0;

    public String categoryName;
    private String colour; // can we make all of these public without losing marks
    private final TaskCollection tasks = new TaskCollection(); // new since Category was just created
    private boolean visibility;
    private final int id;

    /**
     * The constructor of Category.
     * @param name - the name of the category
     * @param colour the colour of the category
     */

    public Category(String name, String colour){
        this.id = numberOfCategories;
        numberOfCategories += 1;

        this.categoryName = name;
        this.colour = colour;
        this.visibility = true;
    }


    /**
     * The setter for name.
     * @param name - the name of the category
     */
    public void setName(String name) {
        this.categoryName = name;
    }
    /**
     * The setter for name.
     * @param colour - the colour of the category
     */
    public void setColour(String colour) {
        this.colour = colour;
    }/**
     * The setter for name.
     * @param state - the state of the category
     */
    public void setVisibility(Boolean state) {
        this.visibility = state;
    }

    /**
     * The getter for name.
     * @return - the name of the category
     */
    public String getName() {
        return this.categoryName;
    }
    /**
     * The getter for colour.
     * @return - the colour of the category
     */
    public String getColour() {
        return this.colour;
    }
    /**
     * The getter for visibility.
     * @return - the visibility state of the category
     */
    public Boolean getVisibility() {
        return this.visibility;
    }
    /**
     * The getter for id.
     * @return - the id of the category
     */
    public int getId() {
        return this.id;
    }
    /**
     * The getter for tasks.
     * @return - the tasks of the category
     */
    public TaskCollection getTasks() {
        return this.tasks;
    }

    /**
     * add a task to the category's Task Factory.
     * @param task - the task to be added
     */
    public void addTask(Task task) {
        tasks.addItem(task);
    }
    /**
     * remove the task from the category's Task Factory.
     * @param task - the task to be removed
     */
    public void removeTask(Task task) {
        tasks.removeItem(task);
    }
}
