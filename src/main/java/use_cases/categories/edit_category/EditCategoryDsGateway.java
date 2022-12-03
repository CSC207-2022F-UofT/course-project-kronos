package use_cases.categories.edit_category;

/**
 * -- Application Business Layer --
 * The database gateway for editCategory use case.
 */
public interface EditCategoryDsGateway {
    /**
     * Saves the data about the category after edition to the database.
     * @param requestModel - a data structure that contains data about the category after editing
     */
    void editCategory(EditCategoryDsRequestModel requestModel);
}
