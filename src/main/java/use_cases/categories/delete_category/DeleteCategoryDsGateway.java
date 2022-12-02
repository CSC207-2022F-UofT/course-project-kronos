package use_cases.categories.delete_category;

/**
 * -- Application Business Layer --
 * The database gateway for deleteCategory use case.
 */
public interface DeleteCategoryDsGateway {
    /**
     * Deletes that category that matches the data in the request model from the database.
     * @param requestModel - a data structure that contains data about the category to be deleted
     */
    void deleteCategory(DeleteCategoryDsRequestModel requestModel);
}
