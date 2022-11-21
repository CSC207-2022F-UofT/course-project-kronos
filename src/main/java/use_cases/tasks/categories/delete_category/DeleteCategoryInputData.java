package use_cases.tasks.categories.delete_category;

import entities.Category;
import entities.CategoryFactory;

/**
 * Contains input data to delete a Category (goes from controller to use case).
 */
public class DeleteCategoryInputData {
    private final Category category;

    /**
     * Constructor for a DeleteCategoryInputData object.
     * @param category - the input category to be deleted
     * Precondition: argument will always exist in the database (since user will select from a drop down menu to delete)
     */
    public DeleteCategoryInputData(Category category) {
        this.category = category;
    }

    // getters
    public Category getCategory() {
        return this.getCategory();
    }
}
