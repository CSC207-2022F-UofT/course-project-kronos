package input_output;

import entities.Category;
import use_cases.tasks.EditCategoryName;

public class EditCategoryInputBound {

    /**
     * Checks whether the edited category name is valid.
     * @param category - the category that is to be changed
     * @param name - the new name of the category
     * @return true if the category's name has been successfully updated, return false if it has not updated or if the
     * input is not valid
     */
    public static Boolean editNameInputBound(Category category, String name) {
        if (Category.categories.contains(name, true) == false && name != "") {
            return EditCategoryName.editCategoryName(category, name);
        }
        return false;
    }
    // for now, don't need input bounds for other inputs (colour and visibility) can UI will take care of that (drop down menus)



}
