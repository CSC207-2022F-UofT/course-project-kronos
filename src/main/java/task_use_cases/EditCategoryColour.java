package task_use_cases;

import entities.Category;

public class EditCategoryColour {

    public EditCategoryColour(Category category, String colour) { // how to make the colour reference ColourPalaatte?
        category.setColour(colour);
    }
}
