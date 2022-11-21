package use_cases.tasks.categories.delete_category;

/**
 * Interface passing inputData to use case for deleting a Category.
 */
public interface DeleteCategoryInputBound {
    DeleteCategoryOutputData delete(DeleteCategoryInputData inputData);
}
