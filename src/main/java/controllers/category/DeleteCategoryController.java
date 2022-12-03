package controllers.category;

import use_cases.categories.delete_category.DeleteCategoryInputBound;
import use_cases.categories.delete_category.DeleteCategoryInputData;
import use_cases.categories.delete_category.DeleteCategoryOutputData;

public class DeleteCategoryController {
    final private DeleteCategoryInputBound inputBound;


    public DeleteCategoryController(DeleteCategoryInputBound categoryGateway) {
        this.inputBound = categoryGateway;
    }

    public DeleteCategoryOutputData delete(int catID) {
        DeleteCategoryInputData inputData = new DeleteCategoryInputData(catID);
        return inputBound.delete(inputData);
    }
}
