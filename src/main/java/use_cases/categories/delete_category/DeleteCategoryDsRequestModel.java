package use_cases.categories.delete_category;

import entities.Category;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the category that should be deleted from the database. It passes data to
 * the gateway.
 */
public class DeleteCategoryDsRequestModel {
    private final Category category;

    /**
     * Constructor
     * @param category - the category to be deleted
     */
    public DeleteCategoryDsRequestModel(Category category) {
        this.category = category;
    }

    /**
     * @return the name of the category
     */
    public Category getCategory() {
        return category;
    }
}
