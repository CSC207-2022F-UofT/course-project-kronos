package controllers.category;

import use_cases.categories.create_category.*;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that creates a new category.
 */
public class CreateCategoryController {
    final CreateCategoryInputBoundary inputBound;

    /**
     * Constructor
     * @param categoryGateway - Input Boundary Interface
     */
    public CreateCategoryController(CreateCategoryInputBoundary categoryGateway) {
        this.inputBound = categoryGateway;
    }

    /**
     * Calls create() method in use case interactor.
     * @param name - the input name of the category
     * @param colour - the input colour of the category
     * @return corresponding OutputData object
     */
    public CreateCategoryOutputData create(String name, String colour) {
        CreateCategoryInputData inputData = new CreateCategoryInputData(name, colour);
        return inputBound.create(inputData);
    }


}
