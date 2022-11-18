package task_use_cases;

import entities.Category;

public class EditCategoryVisibility {
    // Acts like a filter.

    public EditCategoryVisibility(Category category, Boolean state) {
        category.setVisibility(state);
    }
}
