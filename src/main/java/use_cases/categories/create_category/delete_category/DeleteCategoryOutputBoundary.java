package use_cases.categories.create_category.delete_category;

/**
 * Interface that passes the inputData to the interactor of Category deletion.
 */
public interface DeleteCategoryOutputBoundary {
    DeleteCategoryOutputData prepareSuccessView(DeleteCategoryOutputData outputData);
}
