package controllers;

import use_cases.categories.edit_category.EditCategoryOutputBoundary;
import use_cases.categories.edit_category.EditCategoryOutputData;

public class EditCategoryPresenter implements EditCategoryOutputBoundary {
    @Override
    public EditCategoryOutputData prepareSuccessView(EditCategoryOutputData outputData) {
        return outputData;
    }

    @Override
    public EditCategoryOutputData prepareFailView(EditCategoryOutputData outputData) {
        return outputData;
    }
}