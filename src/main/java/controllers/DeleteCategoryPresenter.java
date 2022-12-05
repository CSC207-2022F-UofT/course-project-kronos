package controllers;

import use_cases.categories.delete_category.DeleteCategoryOutputBoundary;
import use_cases.categories.delete_category.DeleteCategoryOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Presenter that passes output data from the use case of DeleteCategory to the UI.
 */
public class DeleteCategoryPresenter implements DeleteCategoryOutputBoundary {
    /**
     * This method is called when the deletion of a category is successful. It prepares view.
     * @param outputData - the output data.
     * @return the output data.
     */
    @Override
    public DeleteCategoryOutputData prepareSuccessView(DeleteCategoryOutputData outputData) {
        return outputData;
    }
}
