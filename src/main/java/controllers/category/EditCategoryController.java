package controllers.category;

import use_cases.categories.edit_category.EditCategoryInputBoundary;
import use_cases.categories.edit_category.EditCategoryInputData;
import use_cases.categories.edit_category.EditCategoryOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that edits a category.
 */
public class EditCategoryController {
    final EditCategoryInputBoundary inputBound;

    /**
     * Constructor
     * @param categoryGateway - Input Boundary Interface
     */
    public EditCategoryController(EditCategoryInputBoundary categoryGateway) {
        this.inputBound = categoryGateway;
    }

    /**
     * Calls edit() method in use case Interactor.
     * @param ID - the original input ID of the category (not changed)
     * @param name - the new input name of the category
     * @param colour - the new input colour of the category
     * @param state - the new visibility state of the category
     * @return corresponding OutputData object
     */
    public EditCategoryOutputData create(Integer ID, String name, String colour, Boolean state) {
        EditCategoryInputData inputData = new EditCategoryInputData(ID, name, colour, state);
        return inputBound.edit(inputData);
    }
}
