package controllers;

import use_cases.categories.create_category.CreateCategoryInputBound;
import use_cases.categories.create_category.CreateCategoryInputData;
import use_cases.categories.create_category.CreateCategoryResponseModel;
import use_cases.categories.delete_category.DeleteCategoryInputBound;
import use_cases.categories.edit_category.EditCategory;
import use_cases.categories.edit_category.EditCategoryInputBound;

public class CategoryController {
    private final CreateCategoryInputBound createInputBound;
    private final DeleteCategoryInputBound deleteInputBound;
    private final EditCategoryInputBound editInputBound;

    public CategoryController(CreateCategoryInputBound inputBound) {
        this.createInputBound = inputBound;
        this.deleteInputBound = null;
        this.editInputBound = null;
    }

    public CategoryController(DeleteCategoryInputBound deleteInputBound) {
        this.createInputBound = null;
        this.deleteInputBound = deleteInputBound;
        this.editInputBound = null;
    }

    public CategoryController(EditCategoryInputBound editInputBound) {
        this.createInputBound = null;
        this.deleteInputBound = null;
        this.editInputBound = editInputBound;
    }


}
