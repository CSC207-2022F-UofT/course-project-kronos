package adapters;

import entities.Category;
import entities.CategoryFactory;
import input_output.CreateCategoryInputBound;
import task_use_cases.DeleteCategory;

public class CategoryController {

    // have a method for all the use cases for category

    /**
     * Create a new category given a name and a colour. Return whether the category was successfully created.
     * @param name - the nane of the new category to be created.
     * @param colour - the colour of the new category to be created.
     * @return true if there is not a category with provided category name in the system, return false otherwise.
     */
    public Boolean createCategory(String name, String colour) {
        CreateCategoryInputBound inputBound = new CreateCategoryInputBound(name, colour);
        return inputBound.getSuccessful();
    }

    /**
     * Delete a category given a Category object. Return whether category was successfully deleted.
     *
     * @param category - the Category object to be deleted.
     * @return true if the Category object is no longer in the system, return false otherwise.
     */
    public Boolean deleteCategory(Category category, CategoryFactory factory) {
        return DeleteCategory.delete(category, factory);
    }

    public void editCategoryVisibility(Category category, Boolean visiblity) {

    }

    public void editCategoryVisibility(Category category, Boolean visiblity) {

    }

    public void editCategoryVisibility(Category category, Boolean visiblity) {

    }

}
