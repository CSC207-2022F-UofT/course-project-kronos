package input_output;

import entities.Category;
import task_use_cases.EditCategoryName;

public class EditCategoryInputBound {

    public static Boolean editNameInputBound(Category category, String name) {
        if (Category.categories.contains(name, true) == false && name != "") {
            return EditCategoryName.editCategoryName(category, name);
        }
        return false;
    }
    // for now, don't need input bounds for other inputs (colour and visibility) can UI will take care of that (drop down menus)



}
