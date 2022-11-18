package entities;

import java.util.HashMap;
import java.util.List;

import entities.Category;

public class CategoryFactory extends Factory<Category> {

    public HashMap<Integer, Category> categories;


    public CategoryFactory() {
        super();
    }

    @Override
    public void addItem(Category category) {
        categories.put(category.getId(), category); // categories = null, throws exception, but then how do I add pairs?
    }

    @Override
    public void removeItem(Category category) {
        categories.remove(category.getId());
    }

    public boolean contains(String name) {
        if (categories == null) {
            // create a factory?
            CategoryFactory factory = new CategoryFactory();
            return false;
        }else {
            return categories.values().contains(name); // categories hasn't been created so it's null - how to make it so
            // the very first time the user create a category the constructor is called?
        }



    }

}
