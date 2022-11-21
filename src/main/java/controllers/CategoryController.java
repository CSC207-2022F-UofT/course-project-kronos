package controllers;

import use_cases.categories.create_category.*;
import use_cases.categories.delete_category.DeleteCategoryInputBound;
import use_cases.categories.edit_category.EditCategoryInputBound;

public class CategoryController {
    private final String inputName;
    private final String inputColour;

    public CategoryController(String name, String colour) {
        this.inputName = name;
        this.inputColour = colour;
    }


    // passes it onto to InputData
    public void createCategory(String name, String colour) {

    }


}
