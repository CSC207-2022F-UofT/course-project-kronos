package use_cases.categories.edit_category;

public class EditCategoryPresenter implements EditCategoryOutputBoundary{
    @Override
    public EditCategoryOutputData prepareSuccessView(EditCategoryOutputData outputData) {
        return outputData;
    }

    @Override
    public EditCategoryOutputData prepareFailView(EditCategoryOutputData outputData) {
        return outputData;
    }
}
