package controllers.category;

import use_cases.categories.create_category.delete_category.DeleteCategoryInputBound;
import use_cases.categories.create_category.delete_category.DeleteCategoryInputData;
import use_cases.categories.create_category.delete_category.DeleteCategoryOutputData;

/**
 * -- Interface Adaptor Layer --
 * The Controller that passes input data from the UI to the use case that deletes a category.
 */
public class DeleteCategoryController {
    final private DeleteCategoryInputBound inputBound;


    public DeleteCategoryController(DeleteCategoryInputBound categoryGateway) {
        this.inputBound = categoryGateway;
    }

    /**
     * Calls delete() method in use case Interactor.
     * @param catID - the id of the category to be deleted
     * @return corresponding OutputData object
     */
    public DeleteCategoryOutputData delete(int catID) {
        DeleteCategoryInputData inputData = new DeleteCategoryInputData(catID);
        return inputBound.delete(inputData);
    }
}
