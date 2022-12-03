package use_cases.categories.create_category;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of category creation
 */
public interface CreateCategoryOutputBound {
    /**
     * This method passes output data from the Interactor to the Presenter if category creation failed.
     * @param error - the error message showed.
     * @return output data.
     */
    CreateCategoryOutputData prepareFailView(String error);
    /**
     * This method passes output data from the Interactor to the Presenter if category creation is successful.
     * @param outputData - the output data.
     * @return output data.
     */
    CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData);

}
