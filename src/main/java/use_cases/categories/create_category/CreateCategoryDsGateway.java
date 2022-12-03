package use_cases.categories.create_category;

/**
 * -- Application Business Layer --
 * The database gateway for createCategory use case.
 */
public interface CreateCategoryDsGateway {
    /**
     * Saves the data about the task after creation to the database.
     * @param requestModel - a data structure that contains data about the new category
     */
    void saveCategory(CreateCategoryDsRequestModel requestModel);
}
