package task_use_cases;

import entities.Category;

public class EditCategoryName {

    public EditCategoryName(Category category, String newName){
        category.setCategoryName(newName);
    }
}
