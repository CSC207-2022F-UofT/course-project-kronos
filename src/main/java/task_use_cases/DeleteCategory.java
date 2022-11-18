package task_use_cases;

import entities.Category;
import entities.CategoryFactory;

public class DeleteCategory {

    public static Boolean delete(Category category, CategoryFactory factory) {
        // need to go into factory and delete the category's data
        factory.removeItem(category); // this method name might change
        return !factory.contains(category.getCategoryName(), false);
    }
}
