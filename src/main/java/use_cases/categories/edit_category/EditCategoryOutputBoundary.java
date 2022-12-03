package use_cases.categories.edit_category;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of category edition/modification.
 */
public interface EditCategoryOutputBoundary {
    /**
     * This method passes output data from the Interactor to the Presenter if category editing is successful.
     * @param outputData - the output data.
     * @return output data.
     */
    EditCategoryOutputData prepareSuccessView(EditCategoryOutputData outputData);
    /**
     * This method passes output data from the Interactor to the Presenter if category editing failed.
     * @param error - the error message showed.
     * @return output data.
     */
    EditCategoryOutputData prepareFailView(String error);
}
