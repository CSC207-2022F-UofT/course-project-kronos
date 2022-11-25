package use_cases.categories.edit_category;

public interface EditCategoryOutputBoundary {
    EditCategoryOutputData prepareSuccessView(EditCategoryOutputData outputData);
    EditCategoryOutputData prepareFailView(EditCategoryOutputData outputData);
}
