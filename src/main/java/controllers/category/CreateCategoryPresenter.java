package controllers.category;

import use_cases.categories.create_category.CreateCategoryOutputBoundary;
import use_cases.categories.create_category.CreateCategoryOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of CreateCategory to the UI.
 */
public class CreateCategoryPresenter implements CreateCategoryOutputBoundary {

    /**
     * This method is called when the creation of new category is unsuccessful, it prepares the view.
     * @param error - the error message
     * @return the output data
     */
    @Override
    public CreateCategoryOutputData prepareFailView(String error) {
        throw new CategoryCreationFailed(error);
    }

    /**
     * This method is called when the creation of new category is successful. It prepares the view.
     * @param outputData - the output data
     * @return the output data
     */
    @Override
    public CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData) {
        return null;
    }


}
