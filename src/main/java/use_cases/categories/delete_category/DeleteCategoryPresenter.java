package use_cases.categories.delete_category;

public class DeleteCategoryPresenter implements DeleteCategoryOutputBoundary {
    @Override
    public DeleteCategoryOutputData prepareSuccessView(DeleteCategoryOutputData outputData) {
        return outputData;
    }
}
