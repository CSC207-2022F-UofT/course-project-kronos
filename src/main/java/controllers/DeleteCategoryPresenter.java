package controllers;

import use_cases.categories.delete_category.DeleteCategoryOutputBoundary;
import use_cases.categories.delete_category.DeleteCategoryOutputData;

public class DeleteCategoryPresenter implements DeleteCategoryOutputBoundary {
    @Override
    public DeleteCategoryOutputData prepareSuccessView(DeleteCategoryOutputData outputData) {
        return outputData;
    }
}