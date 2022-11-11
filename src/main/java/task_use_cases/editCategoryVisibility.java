package task_use_cases;

import entities.Category;

public class editCategoryVisibility {
    // Acts like a filter.

    public void editCategoryVisibility(Category category, Boolean state) {
        category.setVisibility(state);
    }
}
