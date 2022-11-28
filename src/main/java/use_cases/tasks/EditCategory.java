package use_cases.tasks;

import entities.Category;

public class EditCategory {


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
     * @param category - the Category object to be edited
     * @param newName - the new name of category
     * @return true if the name has been updated, return false otherwise.
     */
    public static Boolean editCategoryName(Category category, String newName){
        category.setName(newName);
        return category.getName() == newName;
    }
}
