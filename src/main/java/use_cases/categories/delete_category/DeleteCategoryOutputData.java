package use_cases.categories.delete_category;

import entities.Category;

/**
 * Contains output data for Category deletion.
 */

public class DeleteCategoryOutputData {
    private final String message;
    private final Category category;

    /**
     * Constructor for DeleteCategoryOutputData.
     * @param message - the message to be displayed after deletion
     * @param category - the category that was just deleted
     */
    public DeleteCategoryOutputData(String message, Category category) {
        this.message = message;
        this.category = category;
    }

    // getters
    public String getMessage() {
        return this.message;
    }

    public Category getCategory() {
        return this.category;
    }
}
