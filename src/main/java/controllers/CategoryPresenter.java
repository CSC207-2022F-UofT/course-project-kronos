package controllers;

import entities.Category; // breaks clean architecture
import entities.CategoryFactory;
import entities.User; // breaks clean architecture

import java.util.ArrayList;

public class CategoryPresenter {

    /**
     * Isolate for the user's Category objects that are set to visible
     * @param user - the user whose currently logged in
     */
    private ArrayList<Category> visibleCategories = new ArrayList<>();
    private ArrayList<Category> allCategories = new ArrayList<>();
    CategoryFactory factory;

    public CategoryPresenter(User user) {
        if (user.getCategoryCollection() != null) {
            // user has categories
            factory = user.getCategoryCollection();
            ArrayList<Category> categories = user.getCategoryCollection().convertToArray();
            for (Category cat: categories) {
                allCategories.add(cat);
                if (cat.getVisibility() == true) {
                    visibleCategories.add(cat);
                }
            }
        }

    }

    /**
     * Checking if the new category has been created by seeing if a category with specified name and colour are in the
     * factory and passing back the new category.
     * Precondition: category with the specified name does not already exist.
     * Note for Pre: in the case where the user created an exact replica of another category, the input boundary would
     * handle it.
     * @param name - the name of the category that was just created
     * @param colour - the colour of the category that was just created
     * @return: the newly created category if the category does exist in the factory, null otherwise.
     */
    public Category createCategory(String name, String colour) {
        if (factory.contains(name, false)){
            ArrayList<Category> array = factory.convertToArray();
            for (Category cat: array) {
                if (cat.getColour() == colour) {
                    return cat;
                }
            }
        }
        return null;
    }

    /**
     * Checking if the category has been removed from the factory.
     * @param name - the new name of the category
     * @return: true if the category is not in the category, false otherwise.
     */
    public Boolean deleteCategory(String name) {
        if (factory.contains(name, false)){
            return false;
        }
        return true;
    }


    /**
     * Checking if the category's new name has been updated in the factory and passing back the category.
     * @param oldName - the old name of the category
     * @param newName - the new name of the category
     * @param colour - the colour of the category
     * @return: the updated category if the category's name has been updated, null otherwise.
     */
    public Category editName(String oldName, String newName, String colour){
        if (factory.contains(newName, false) && !factory.contains(oldName, false)){
            ArrayList<Category> array = factory.convertToArray();
            for (Category cat: array) {
                if (cat.getColour() == colour) {
                    return cat;
                }
            }
        }
        return null;
    }

    // is this a code smell (repeated code)?
    public Category editColour(String name, String newColour) {
        if (factory.contains(name, false)){
            ArrayList<Category> array = factory.convertToArray();
            for (Category cat: array) {
                if (cat.getColour() == newColour) {
                    return cat;
                }
            }
        }
        return null;
    }

    /**
     * Checking if the category's visibility state has been updated in the factory and passing back the category.
     * @param name - the name of the category
     * @param colour - the colour of the category
     * @param state - the new visibility state of the category
     * @return: the updated category if the category's visibility state has been updated, null otherwise.
     */
    public Category editVisibility(String name, String colour, Boolean state) {
        if (factory.contains(name, false)){
            ArrayList<Category> array = factory.convertToArray();
            for (Category cat: array) {
                if (cat.getColour() == colour && cat.getVisibility() == state) {
                    return cat;
                }
            }
        }
        return null;
    }

    // getters
    public ArrayList<Category> getAllCategories() {
        return this.allCategories;
    }

    public ArrayList<Category> getVisibleCategories() {
        return this.visibleCategories;
    }

    // need to be able to reference the user's categories


    // ? might just need 1 category presenter since all it's doing is taking all the catergories from the factory that
    // are set to visible

}

