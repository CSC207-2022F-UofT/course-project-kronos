package use_cases.categories.create_category;

import entities.Category;
/**
 * -- Application Business Layer --
 * A data structure that stores data about the new category that should be updated in the database. It passes data to
 * the gateway.
 */
public class CreateCategoryDsRequestModel {
    private Category category;

    /**
     * Constructor
     *
     * @param category - the new category
     */
    public CreateCategoryDsRequestModel(Category category) {
        this.category = category;
    }

    /**
     * @return the name of the category
     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * @return the ID of the category
     */
    public Integer getId() {
        return this.category.getId();
    }
}
