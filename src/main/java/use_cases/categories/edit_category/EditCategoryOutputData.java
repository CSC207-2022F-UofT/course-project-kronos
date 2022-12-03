package use_cases.categories.edit_category;

import entities.Category;

/**
 * Contains output data for Category editing.
 */

public class EditCategoryOutputData {
    private final String message;
    private final Category category;

    /**
     /** Constructor to be called if the use case was unsuccessful.
     * @param message - the message to be displayed after deletion
     */
    public EditCategoryOutputData(String message) {
        this.message = message;
        category = null;
    }

    /**
     /** Constructor to be called if the use case was successful.
     * @param category - the category that was just deleted
     */
    public EditCategoryOutputData(String message, Category category) {
        this.message = message;
        this.category = category;
    }

    // getters
    public String getError() {
        return this.message;
    }

    public Category getCategory() {
        return this.category;
    }
}
