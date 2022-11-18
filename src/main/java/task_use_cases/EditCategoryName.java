package task_use_cases;

import entities.Category;

public class EditCategoryName {

    public static Boolean editCategoryName(Category category, String newName){
        category.setCategoryName(newName);
        return category.getCategoryName() == newName;
    }
}
