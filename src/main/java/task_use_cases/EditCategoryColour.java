package task_use_cases;

import entities.Category;

public class EditCategoryColour {


    /**
     * Edits the colour of an already existing category.
     * @param category - the Category object to be edited
     * @param colour - the new colour of category
     * @return true if the colour has been updated, return false otherwise.
     */
    public static Boolean editCategoryColour(Category category, String colour) { // how to make the colour reference ColourPalaatte?
        category.setColour(colour);
        return category.getColour() == colour;
    }
}
