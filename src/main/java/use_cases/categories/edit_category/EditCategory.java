package use_cases.categories.edit_category;

import entities.Category;
import entities.CategoryCollection;

import java.util.Objects;

/**
 * -- Application Business Layer --
 * The use case Interactor that is responsible for editing a category.
 */
public class EditCategory implements EditCategoryInputBoundary {
    private final EditCategoryOutputBoundary outputBound;
    private final CategoryCollection categories;
    private final Integer ID;
    private EditCategoryDsGateway dsGateway;

    /**
     * Constructor for EditCategory
     * @param outputBound - outputBound for EditCategory
     * @param dsGateway - the database gateway interface
     * @param categories - the categories of the User that's logged in
     * @param ID - the ID of the category to be edited
     */
    public EditCategory(EditCategoryOutputBoundary outputBound, EditCategoryDsGateway dsGateway, CategoryCollection categories, Integer ID) {
        this.outputBound = outputBound;
        this.categories = categories;
        this.ID = ID;
        this.dsGateway = dsGateway;
    }

    /**
     * Edits properties of a Category.
     * @param category - the Category object to be edited
     * @param colour - the new colour of category
     * @return true if the colour has been updated, return false otherwise.
     */
    public static Boolean editCategoryColour(Category category, String colour) { // how to make the colour reference ColourPalaatte?
        category.setColour(colour);
        return Objects.equals(category.getColour(), colour);
    }

    /**
     * Edits the visibility of an already existing category.
     * @param category - the Category object to be edited
     * @param state - the new visibility state of the category
     * @return true if the visibility state has been updated, return false otherwise.
     */
    public static Boolean editCategoryVisibility(Category category, Boolean state) {
        category.setVisibility(state);
        return category.getVisibility() == state;
    }

    /**
     * Edits the name of an already existing category.
     * @param inputData - the input data to edit the Category properties
     * @return the output after edit.
     */
    @Override
    public EditCategoryOutputData edit(EditCategoryInputData inputData) {
        Category currentCategory = categories.getItem(inputData.getId());
        if (inputData.getName().isBlank()) {
            String error = "Changes not saved. Please fill out all fields.";
            EditCategoryOutputData outputData = new EditCategoryOutputData(error);
            return outputBound.prepareFailView(error);
        }else if(this.categories.contains(inputData.getName(), false) &&
                inputData.getName() != currentCategory.getName()){
            String error ="Error: This category name already exists. Please enter a new category name.";
            return outputBound.prepareFailView(error);
        }

        Category category = categories.getItem(ID);
        category.setName(inputData.getName());
        category.setColour(inputData.getName());
        category.setVisibility(inputData.getVisibility());
        EditCategoryOutputData outputData = new EditCategoryOutputData("Changes have been saved.", category);
        return outputBound.prepareSuccessView(outputData);
    }

    /**
     * outputBound getter
     * @return the outputBound object
     */
    public EditCategoryOutputBoundary getOutputBound() {
        return this.outputBound;
    }

}
