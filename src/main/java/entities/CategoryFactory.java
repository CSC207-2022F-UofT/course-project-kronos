package entities;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoryFactory extends Factory<Category> {

    public HashMap<Integer, Category> categories;


    public CategoryFactory() {
        super();
    }

    /**
     * Add item to the hashmap
     * @param category - the Category object to be added
     */
    @Override
    public void addItem(Category category) {
        categories.put(category.getId(), category); // categories = null, throws exception, but then how do I add pairs?
    }

    @Override
    public void removeItem(Category category) {
        categories.remove(category.getId());
    } // this should only be called when the category already exists in factory since user can only delete from dropdown

    /**
     * Check if the factory contains the specified category name. Create a new factory if categories = null (factory
     * hasn't been created yet)
     * @param name - the name of the category that is to be checked.
     * @return true if the name is in the factory hashmap, return false otherwise.
     */
    public boolean contains(String name, Boolean createNew) {
        if (categories == null) {
            // create a factory?
            if (createNew) {
                CategoryFactory factory = new CategoryFactory();
            }
            return false;
        }else {
            return categories.containsValue(name); // categories hasn't been created, so it's null - how to make it so
            // the very first time the user create a category the constructor is called?
        }


    }

    /**
     * Given the user, return an array list of that user's categories.
     * @return this CategoryFactory object as an arraylist
     */
    public ArrayList<Category> convertToArray() {
        ArrayList<Category> categoryList = new ArrayList<>();
        if (this.categories.isEmpty() == false) {
            for (Integer key : this.categories.keySet()) {
                categoryList.add(this.categories.get(key));
            }
        } // else don't populate the list
        return categoryList;
    }

}
