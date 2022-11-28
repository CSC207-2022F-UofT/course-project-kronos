package use_cases.tasks;

import entities.Category; // breaks clean architecture
import entities.UserEntity; // breaks clean architecture

import java.util.ArrayList;

public class CategoryPresenter {

    /**
     * Isolate for the user's Category objects that are set to visible
     * @param user - the user whose currently logged in
     */
    private ArrayList<Category> visibleCategories = new ArrayList<>();
    private ArrayList<Category> allCategories = new ArrayList<>();

    public CategoryPresenter(UserEntity user) {
        if (user.getCategoryCollection() != null) {
            // user has categories
            ArrayList<Category> categories = user.getCategoryCollection().convertToArray();
            for (Category cat: categories) {
                allCategories.add(cat);
                if (cat.getVisibility() == true) {
                    visibleCategories.add(cat);
                }
            }
        }

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

