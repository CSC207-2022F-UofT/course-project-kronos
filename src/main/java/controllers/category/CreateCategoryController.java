package controllers.category;

import use_cases.categories.create_category.*;

public class CreateCategoryController {

    final CreateCategoryInputBound inputBound;

    public CreateCategoryController(CreateCategoryInputBound categoryGateway) {
        this.inputBound = categoryGateway;
    }

    public CreateCategoryOutputData create(String name, String colour) {
        CreateCategoryInputData inputData = new CreateCategoryInputData(name, colour);
        return inputBound.edit(inputData);
    }


}
