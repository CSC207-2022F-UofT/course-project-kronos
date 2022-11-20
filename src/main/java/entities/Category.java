package entities;

public class Category {

    private static int numberOfCategories = 0;

    public String categoryName;
    private String colour; // can we make all of these public without losing marks
    private TaskFactory tasks;
    private boolean visibility;
    private int id;
    public static CategoryFactory categories = new CategoryFactory();

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
        categories.addItem(this);
    }


    /**
     * setters and getters
     */
    public void setCategoryName(String name) {
        this.categoryName = name;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setVisibility(Boolean state) {
        this.visibility = state;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    public String getColour() {
        return this.colour;
    }
    public Boolean getVisibility() {
        return this.visibility;
    }
    public int getId() {
        return this.id;
    }
    public TaskFactory getTasks() {
        return this.tasks;
    }

    /**
     * add a task to the category's Task Factory
     */
    public void addTask(Task task) {
        tasks.addItem(task);
    }

    public void removeTask(Task task) {
        tasks.removeItem(task);
    }
}
