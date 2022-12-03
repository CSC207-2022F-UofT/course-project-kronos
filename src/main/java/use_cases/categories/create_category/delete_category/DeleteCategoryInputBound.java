package use_cases.categories.create_category.delete_category;

/**
 * Interface passing inputData to use case for deleting a Category.
 */
public interface DeleteCategoryInputBound {
    DeleteCategoryOutputData delete(DeleteCategoryInputData inputData);
}
