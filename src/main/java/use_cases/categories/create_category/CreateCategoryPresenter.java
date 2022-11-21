package use_cases.categories.create_category;

public class CreateCategoryPresenter implements CreateCategoryOutputBound{

    @Override
    public CreateCategoryOutputData prepareFailView(CreateCategoryOutputData outputData) {
        return outputData;
    }

    @Override
    public CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData) {
        return outputData;
    }


}
