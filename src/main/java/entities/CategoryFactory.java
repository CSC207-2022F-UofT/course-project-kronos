package entities;

import java.util.HashMap;
import java.util.List;

import entities.Category;

public class CategoryFactory extends Factory<Category> {

    HashMap<Integer, Category> categories;


    public CategoryFactory() {
        super();
    }

    @Override
    public void addItem(Category category) {

        categories.put(category.getId(), category);
    }

    @Override
    public void removeItem(Category category) {
        categories.remove(category.getId());
    }

}
