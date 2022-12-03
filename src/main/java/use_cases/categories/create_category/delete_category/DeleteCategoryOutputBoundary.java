package use_cases.categories.create_category.delete_category;

/**
 * -- Application Business Layer --
 * This is an interface that passes the output to the Presenter of category deletion.
 */
public interface DeleteCategoryOutputBoundary {
    /**
     * This method passes output data from the Interactor to the Presenter if the deletion of catgory is successful.
     * @param outputData - the output data.
     * @return output data.
     */
    DeleteCategoryOutputData prepareSuccessView(DeleteCategoryOutputData outputData);
}
