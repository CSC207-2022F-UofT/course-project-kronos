package use_cases.categories.create_category;

/**
 * Interface that passes the inputData to the interactor of Category creation.
 */
public interface CreateCategoryOutputBound {

    CreateCategoryOutputData prepareFailView(CreateCategoryOutputData outputData);
    CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData);

}
