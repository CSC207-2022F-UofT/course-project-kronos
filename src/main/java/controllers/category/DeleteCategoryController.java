package controllers.category;

import use_cases.categories.create_category.delete_category.DeleteCategoryInputBound;
import use_cases.categories.create_category.delete_category.DeleteCategoryInputData;
import use_cases.categories.create_category.delete_category.DeleteCategoryOutputData;

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
