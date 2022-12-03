package use_cases.categories.create_category.delete_category;

/**
 * -- Application Business Layer --
 * This is an interface that passes the inputData to the interactor of category deletion.
 */
public interface DeleteCategoryInputBound {
    /**
     * Create a category based on input data.
     * @param inputData - input data of the category to be deleted
     */
    DeleteCategoryOutputData delete(DeleteCategoryInputData inputData);
}
