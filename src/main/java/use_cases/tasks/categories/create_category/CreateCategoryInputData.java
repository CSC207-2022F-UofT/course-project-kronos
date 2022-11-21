package use_cases.tasks.categories.create_category;

import entities.Category;
import entities.CategoryFactory;

public class CreateCategoryInputData {
    // data structure class

    private final Category category;
    private final String inputName;
    private final String inputColour;

    /**
     * Constructor for a CreateCategoryInputData object.
     * @param category - the category that was added
     * @param inputName - the name of the category
     * @param category - the colour of the category
     */

    public CreateCategoryInputData(Category category, String inputName, String inputColour) {
        this.category = category;
        this.inputName = inputName;
        this.inputColour = inputColour;
    }

    // getters
    public Category getCategory() {
        return this.category;
    }

    public String getName() {
        return this.inputName;
    }

    public String getColour() {
        return this.inputColour;
    }

}
