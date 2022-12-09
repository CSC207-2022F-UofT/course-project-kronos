package use_cases.categories.edit_category;

import entities.Category;
/**
 * -- Application Business Layer --
 * A data structure that stores data about the edited category that should be updated in the database. It passes data to
 * the gateway.
 */
public class EditCategoryDsRequestModel {
    private final Category category;

    /**
     * Constructor
     * @param category - the category that's edited
     */
    public EditCategoryDsRequestModel(Category category){
        this.category = category;
    }

    /**
     * @return the name of the category
     */
    public Category getCategory() {
        return category;
    }
}
