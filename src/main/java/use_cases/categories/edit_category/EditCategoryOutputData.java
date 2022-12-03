package use_cases.categories.edit_category;

import entities.Category;

/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to edition/modification of a category, it is created by the
 *  Interactor and sent to the Presenter.
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

    /**
     * @return the error message if category editing failed
     */
    public String getError() {
        return this.message;
    }
    /**
     * @return the category that's been edited
     */
    public Category getCategory() {
        return this.category;
    }
    /**
     * @return the ID of the category
     */
    public int getCategoryId() {
        return this.category.getId();
    }
    /**
     * @return the name of the category after editing
     */
    public String getCategoryName() {
        return this.category.getName();
    }
    /**
     * @return the colour of the category after editing
     */
    public String getCategoryColour() {
        return this.category.getColour();
    }
    /**
     * @return the visibility state of the category after editing
     */
    public Boolean getVisibility() {
        return this.category.getVisibility();
    }


}
