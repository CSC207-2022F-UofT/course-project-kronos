package controllers;

import controllers.category.CategoryCreationFailed;
import use_cases.categories.create_category.CreateCategoryOutputBoundary;
import use_cases.categories.create_category.CreateCategoryOutputData;

public class CreateCategoryPresenter implements CreateCategoryOutputBoundary {
    /**
     * This method is called when the creation of new category is unsuccessful. It prepares view.
     * @param error - the output data.
     * @return categoryCreationFailed Exception.
     */
    @Override
    public CreateCategoryOutputData prepareFailView(String error) {
        throw new CategoryCreationFailed(error);
    }

    /**
     * This method is called when the creation of new category is successful. It prepares view.
     * @param outputData - the output data.
     * @return the output data.
     */
    @Override
    public CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData) {
        return outputData;
    }


}
