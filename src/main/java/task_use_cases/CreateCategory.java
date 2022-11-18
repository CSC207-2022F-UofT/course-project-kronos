package task_use_cases;
import entities.Category;

public class CreateCategory {

    //input bound will have to check that the input is valid (colour should have static FINAL options, no repeat names)
    /**
     * The constructor of Order.
     * @param name - the name of the category that is to be created
     * @param colour -  the colour of the category
     */
    public static boolean createCategory(String name, String colour) {
        Category category = new Category(name, colour);
        return true; // should it check if the factory updated? But then you would need to pass on the user in parameters
    }
}
