package use_cases.tasks.categories.create_category;

import use_cases.tasks.categories.edit_category.EditCategory;

/**
 * Interface that passes the inputData to the interactor of Category creation.
 */
public interface CreateCategoryOutputBound {

    CreateCategoryOutputData prepareFailView(CreateCategoryOutputData outputData);
    CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData);

}
