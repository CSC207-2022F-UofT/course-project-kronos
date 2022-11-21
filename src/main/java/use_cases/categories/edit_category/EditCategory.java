package use_cases.categories.edit_category;

import entities.Category;

/**
 * Edit properties (name, colour) of a Category.
 */
public class EditCategory implements EditCategoryInputBound{
    private final EditCategoryPresenter presenter;

    public EditCategory(EditCategoryPresenter presenter) {
        this.presenter = presenter;
    }

    /**
     * Edits properties of a Category.
     * @param category - the Category object to be edited
     * @param colour - the new colour of category
     * @return true if the colour has been updated, return false otherwise.
     */
    public static Boolean editCategoryColour(Category category, String colour) { // how to make the colour reference ColourPalaatte?
        category.setColour(colour);
        return category.getColour() == colour;
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
        if (inputData.getName().isBlank()) {
            EditCategoryOutputData outputData = new EditCategoryOutputData("Changes not saved. Please fill " +
                    "out all fields.");
            return presenter.prepareFailView(outputData);
        }
        Category category = inputData.getCategory();
        category.setName(inputData.getName());
        category.setColour(inputData.getName());
        category.setVisibility(inputData.getVisibility());
        EditCategoryOutputData outputData = new EditCategoryOutputData("Changes have been saved.", category);
        return presenter.prepareSuccessView(outputData);
    }

    // getters
    public EditCategoryOutputBoundary getOutputBound() {
        return this.presenter;
    }

}
