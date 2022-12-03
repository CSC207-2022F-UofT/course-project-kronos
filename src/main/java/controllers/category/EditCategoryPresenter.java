package controllers.category;

import use_cases.categories.edit_category.EditCategoryOutputBoundary;
import use_cases.categories.edit_category.EditCategoryOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of EditCategory to the UI.
 */
public class EditCategoryPresenter implements EditCategoryOutputBoundary {

    /**
     * This method is called when the editing of the category is successful. It prepares the view.
     * @param outputData - the output data
     * @return the output data
     */
    @Override
    public EditCategoryOutputData prepareSuccessView(EditCategoryOutputData outputData) {
        return outputData;
    }

    /**
     * This method is called when the editing of the category is unsuccessful. It prepares the view.
     * @param error - the error message
     * @return the output data
     */
    @Override
    public EditCategoryOutputData prepareFailView(String error) {
        throw new CategoryEditFailed(error);
    }
}
