package controllers;

import entities.Category;
import entities.CategoryFactory;
import use_cases.categories.create_category.*;

public class CategoryController {
    private final CategoryFactory factory;
    private final String inputName;
    private final String inputColour;
    private final Boolean state;
    private final Category category;

    public CategoryController(CategoryFactory factory, String name, String colour) {
        this.factory = factory;
        this.inputName = name;
        this.inputColour = colour;
        this.state = true;
        this.category = null;
    }

    public CategoryController(CategoryFactory factory, Category category) {
        this.factory = factory;
        this.inputName = category.getName();
        this.inputColour = category.getColour();
        this.state = category.getVisibility();
        this.category = category;
    }

    public CategoryController(CategoryFactory factory, String name, String colour, Boolean state) {
        this.factory = factory;
        this.inputName = name;
        this.inputColour = colour;
        this.state = state;
        this.category = null;
    }


    // passes it onto to InputData

    public CreateCategoryOutputData CreateCategory(){
        CreateCategoryInputData inputData = new CreateCategoryInputData(this.inputName, this.inputColour);
        CreateCategoryPresenter presenter = new CreateCategoryPresenter();
        CreateCategory createCategory = new CreateCategory(presenter, factory);
        return createCategory.edit(inputData);
    }

}
