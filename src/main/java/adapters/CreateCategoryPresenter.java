package adapters;

import entities.Category; // breaks clean architecture
import entities.User;

import java.util.ArrayList;

public class CreateCategoryPresenter {
    private ArrayList<Category> visibleCategories = new ArrayList<>();

    public CreateCategoryPresenter(User user) {
        if (user.getCategoryCollection() != null) {
            // user has categories
            ArrayList<Category> categories = user.getCategoryCollection().categories.
            for (Integer key: categories.keySet()) {
                if (categories.get(key).getVisibility() == true) {
                    visibleCategories.add(categories.get(key));
                }
            }
        }

    }

    // need to be able to reference the user's categories


    // ? might just need 1 category presenter since all it's doing is taking all the catergories from the factory that
    // are set to visible

}

