package use_cases.categories.edit_category;

import entities.Category;

/**
 * Contains input data for editing an existing Category.
 */
public class EditCategoryInputData {
    private final Category category;
    private final String inputName;
    private final String inputColour;
    private final Boolean inputState;

    /**
     * Constructor for a EditCategoryInputData object.
     * @param category- the category to be edited
     * @param inputName - the name of the category after editing is done
     * @param inputColour - the colour of the category after editing is done
     * @param inputState - the visibility state of the category after editing is done
     */

    public EditCategoryInputData(Category category, String inputName, String inputColour, Boolean inputState) {
        this.category = category;
        this.inputName = inputName;
        this.inputColour = inputColour;
        this.inputState = inputState;
    }

    // getters

    public Category getCategory() { return this.category; }
    public String getName() { return this.inputName; }
    public String getColour() {
        return this.inputColour;
    }
    public Boolean getVisibility() {
        return this.inputState;
    }

}
