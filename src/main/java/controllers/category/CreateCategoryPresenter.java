package controllers.category;

import use_cases.categories.create_category.CreateCategoryOutputBound;
import use_cases.categories.create_category.CreateCategoryOutputData;

public class CreateCategoryPresenter implements CreateCategoryOutputBound {

    @Override
    public CreateCategoryOutputData prepareFailView(String error) {
        throw new CategoryCreationFailed(error);
    }

    @Override
    public CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData) {
        return null;
    }


}
