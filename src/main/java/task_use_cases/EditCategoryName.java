package task_use_cases;

import entities.Category;

public class EditCategoryName {

    /**
     * Edits the name of an already existing category.
     * @param category - the Category object to be edited
     * @param newName - the new name of category
     * @return true if the name has been updated, return false otherwise.
     */
    public static Boolean editCategoryName(Category category, String newName){
        category.setCategoryName(newName);
        return category.getCategoryName() == newName;
    }
}
