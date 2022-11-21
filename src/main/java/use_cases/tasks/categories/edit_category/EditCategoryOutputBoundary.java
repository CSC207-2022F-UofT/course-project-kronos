package use_cases.tasks.categories.edit_category;

import use_cases.tasks.categories.delete_category.DeleteCategoryOutputData;

public interface EditCategoryOutputBoundary {
    EditCategoryOutputData prepareSuccessView(EditCategoryOutputData outputData);
    EditCategoryOutputData prepareFailView(EditCategoryOutputData outputData);
}
