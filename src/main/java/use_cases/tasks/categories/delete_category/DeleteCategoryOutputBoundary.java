package use_cases.tasks.categories.delete_category;

import use_cases.tasks.categories.create_category.CreateCategoryOutputData;

/**
 * Interface that passes the inputData to the interactor of Category deletion.
 */
public interface DeleteCategoryOutputBoundary {
    DeleteCategoryOutputData prepareSuccessView(DeleteCategoryOutputData outputData);
}
