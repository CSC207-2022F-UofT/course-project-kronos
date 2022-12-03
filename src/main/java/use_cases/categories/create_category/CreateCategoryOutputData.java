package use_cases.categories.create_category;

import entities.Category;
/**
 * -- Application Business Layer --
 *  This class is a container for the output data related to creation of a category, it is created by the
 *  Interactor and sent to the Presenter.
 */
public class CreateCategoryOutputData {
    private final String error;
    private final Category category;

    /** Constructer to be called if the use case was unsuccessful.
     * @param error - the error message to be displayed
     */
    public CreateCategoryOutputData(String error) {
        this.error = error;
        this.category = new Category(null, null);
    }

    /** Constructer to be called if the use case was successful.
     * @param category - the category that was just created
     */
    public CreateCategoryOutputData(Category category) {
        this.category = category;
        this.error = null;
    }


    /**
     * @return the error message if category creation failed
     */
    public String getError() {
        return this.error;
    }
    /**
     * @return the category that was just created
     */
    public Category getCategory() {
        return this.category;
    }
    /**
     * @return the name of the category after creation
     */
    public String getCategoryName() {
        return this.category.getName();
    }
    /**
     * @return the id of the category created
     */
    public int getCategoryId() {
        return this.category.getId();
    }
}
