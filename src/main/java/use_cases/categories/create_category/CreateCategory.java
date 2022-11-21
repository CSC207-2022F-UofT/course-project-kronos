package use_cases.categories.create_category;
import entities.Category;
import entities.CategoryFactory;

public class CreateCategory implements CreateCategoryInputBound {
    private final CreateCategoryPresenter presenter;
    private final CategoryFactory factory;

    public CreateCategory(CreateCategoryPresenter presenter, CategoryFactory factory) {
        this.presenter = presenter;
        this.factory = factory;
    }


    /**
     * Creates a new category.
     * @param inputData - the name of the category that is to be created
     * @return : output data upon Category creation
     */

    @Override
    public CreateCategoryOutputData edit(CreateCategoryInputData inputData) {
        if (inputData.getName().isBlank()) {
            CreateCategoryOutputData outputData = new CreateCategoryOutputData("Error: Please enter the name of " +
                    "the category.");
            return presenter.prepareFailView(outputData);
        } else if(this.factory.contains(inputData.getName(), false)){
            CreateCategoryOutputData outputData = new CreateCategoryOutputData("Error: This category name " +
                    "already exists. Please enter a new category name.");
            return presenter.prepareFailView(outputData);
        }
        // no need to check for colour input cause UI will display drop down menu (no user error unless they're hacker)

        Category category = new Category(inputData.getName(), inputData.getColour());
        factory.addItem(category);
        CreateCategoryOutputData outputData = new CreateCategoryOutputData(category);
        return presenter.prepareSuccessView(outputData);
    }

    // getters
    public CreateCategoryPresenter getPresenter() {
        return this.presenter;
    }

    public CategoryFactory getFactory() {
        return this.factory;
    }
}
