package adapters;

import entities.Category;
import input_output.CreateCategoryInputBound;

public class CategoryController {

    // have a method for all the use cases for category

    public void createCategory(String name, String colour) {
        CreateCategoryInputBound inputBound = new CreateCategoryInputBound(name, colour);
    }

    public void deleteCategory(Category category) {

    }

    public void editCategoryVisibility(Category category, Boolean visiblity) {

    }

}
