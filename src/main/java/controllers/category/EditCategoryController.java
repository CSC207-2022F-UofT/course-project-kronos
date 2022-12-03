package controllers.category;

import use_cases.categories.edit_category.EditCategoryInputBound;
import use_cases.categories.edit_category.EditCategoryInputData;
import use_cases.categories.edit_category.EditCategoryOutputData;

public class EditCategoryController {
    final EditCategoryInputBound inputBound;

    public EditCategoryController(EditCategoryInputBound categoryGateway) {
        this.inputBound = categoryGateway;
    }

    public EditCategoryOutputData create(Integer ID, String name, String colour, Boolean state) {
        EditCategoryInputData inputData = new EditCategoryInputData(ID, name, colour, state);
        return inputBound.edit(inputData);
    }
}
