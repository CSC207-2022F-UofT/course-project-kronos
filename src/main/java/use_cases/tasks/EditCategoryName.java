package use_cases.tasks;

import entities.Category;

public class EditCategoryName {

    public EditCategoryName(Category category, String newName){
        category.setCategoryName(newName);
    }
}
