package task_use_cases;

import entities.Category;
import entities.CategoryFactory;

public class deleteCategory {

    public void delete(Category category, CategoryFactory factory) {
        // need to go into factory and delete the category's data
        factory.removeItem(category); // this method name might change
    }
}
