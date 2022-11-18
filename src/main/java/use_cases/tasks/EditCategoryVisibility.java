package use_cases.tasks;

import entities.Category;

public class EditCategoryVisibility {
    // Acts like a filter.

    public EditCategoryVisibility(Category category, Boolean state) {
        category.setVisibility(state);
    }
}
