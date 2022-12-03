package use_cases.categories.delete_category;

import entities.Category;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to deletion of a category, it is created by the
 *  Interactor and sent to the Presenter.
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

    /**
     * @return the message if category deletion success
     */
    public String getMessage() {
        return this.message;
    }
    /**
     * @return the category to be deleted
     */
    public Category getCategory() {
        return this.category;
    }
    /**
     * @return the ID of category that's deleted
     */
    public int getCategoryId() {
        return this.category.getId();
    }
}
