package use_cases.categories.create_category;

import entities.Category;

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


    // getters
    public String getError() {
        return this.error;
    }

    public Category getCategory() {
        return this.category;
    }

    public String getCategoryName() {
        return this.category.getName();
    }
    public int getCategoryId() {
        return this.category.getId();
    }
}
