package use_cases.tasks;

import entities.Category;
import entities.CategoryFactory;

public class DeleteCategory {

    /**
     * The constructor of Order.
     * @param category - the category that is to be deleted
     * @param factory - the CategoryFactory of the user
     * @return true if the CategoryFactory no longer contains category, returns false otherwise.
     */
    public static Boolean delete(Category category, CategoryFactory factory) {
        // need to go into factory and delete the category's data
        factory.removeItem(category); // this method name might change
        return !factory.contains(category.getCategoryName(), false);
    }
}
