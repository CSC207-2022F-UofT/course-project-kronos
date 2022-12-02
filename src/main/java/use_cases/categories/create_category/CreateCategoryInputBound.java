package use_cases.categories.create_category;

/**
 * Interface that passes the inputData to the interactor for creating a Category.
 */

public interface CreateCategoryInputBound {
    CreateCategoryOutputData create(CreateCategoryInputData inputData); // takes in inputData and returns outputData
}
