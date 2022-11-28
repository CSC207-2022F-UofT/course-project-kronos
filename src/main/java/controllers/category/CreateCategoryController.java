package controllers.category;

import use_cases.categories.create_category.*;

public class CreateCategoryController {

    final CreateCategoryInputBound inputBound;

    public CreateCategoryController(CreateCategoryInputBound categoryGateway) {
        this.inputBound = categoryGateway;
    }

    public CreateCategoryOutputData create(String name, String colour) {
        // should there be a try catch here?
        CreateCategoryInputData inputData = new CreateCategoryInputData(name, colour);
        return inputBound.edit(inputData); // where does this go? How does this get to use case?
    }


}
