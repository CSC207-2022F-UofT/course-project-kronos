package use_cases.categories.create_category;
import entities.Category;
import entities.CategoryCollection;
import entities.User;

public class CreateCategory implements CreateCategoryInputBound {
    private final CreateCategoryOutputBound outputBound;
    private final User user;
    private final CategoryCollection collection;

    public CreateCategory(CreateCategoryOutputBound outputBound, User user) {
        this.outputBound = outputBound;
        this.user = user;
        this.collection = user.getCategoryCollection();

    }


    /**
     * Creates a new category.
     * @param inputData - the name of the category that is to be created
     * @return output data upon Category creation
     */

    @Override
    public CreateCategoryOutputData edit(CreateCategoryInputData inputData) {
        if (inputData.getName().isBlank()) {
            String error = "Error: Please enter the name of the category.";
            return outputBound.prepareFailView(error);
        } else if(this.collection.contains(inputData.getName(), false)){
            String error ="Error: This category name already exists. Please enter a new category name.";
            return outputBound.prepareFailView(error);
        }
        // no need to check for colour input cause UI will display drop down menu (no user error unless they're hackers)

        Category category = new Category(inputData.getName(), inputData.getColour());
        collection.addItem(category);
        CreateCategoryOutputData outputData = new CreateCategoryOutputData(category);
        return outputBound.prepareSuccessView(outputData);
    }

    // getters
    public CreateCategoryOutputBound getOutputBound() {
        return this.outputBound;
    }

    public CategoryCollection getFactory() {
        return this.collection;
    }
}
