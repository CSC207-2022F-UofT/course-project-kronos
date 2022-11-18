package task_use_cases;

import entities.Category;

public class EditCategoryVisibility {
    // Acts like a filter.

    public static Boolean editCategoryVisibility(Category category, Boolean state) {
        category.setVisibility(state);
        return category.getVisibility() == state;
    }
}
