package task_use_cases;

import entities.Category;

public class EditCategoryColour {

    public static Boolean editCategoryColour(Category category, String colour) { // how to make the colour reference ColourPalaatte?
        category.setColour(colour);
        return category.getColour() == colour;
    }
}
