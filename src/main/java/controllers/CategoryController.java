package controllers;

import entities.Category;
// controller can't depend on Entities (can't go more than 1 layer deep)
// may need to change the Category controller for deleteCategory so we can pass in an ID instead of the Category object
import entities.CategoryCollection;
import use_cases.categories.create_category.*;

public class CategoryController {
    private final CategoryCollection factory;
    private final String inputName;
    private final String inputColour;
    private final Boolean state;
    private final Category category;
    CreateCategoryInputData inputData;


    public CategoryController(CategoryCollection factory, String name, String colour) {
        this.factory = factory;
        this.inputName = name;
        this.inputColour = colour;
        this.state = true;
        this.category = null;
        this.inputData = new CreateCategoryInputData(this.inputName, this.inputColour);
    }

    public CategoryController(CategoryCollection factory, Category category) {
        this.factory = factory;
        this.inputName = category.getName();
        this.inputColour = category.getColour();
        this.state = category.getVisibility();
        this.category = category;
    }

    public CategoryController(CategoryCollection factory, String name, String colour, Boolean state) {
        this.factory = factory;
        this.inputName = name;
        this.inputColour = colour;
        this.state = state;
        this.category = null;
    }


    // passes it onto to InputData

    public CreateCategoryOutputData CreateCategory(){
        //CreateCategoryPresenter presenter = new CreateCategoryPresenter();
        //CreateCategory createCategory = new CreateCategory(presenter, factory);

        //return createCategory.edit(inputData);
        return null;
    }

}
