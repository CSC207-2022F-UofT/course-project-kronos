package use_cases.tasks.categories;

import entities.Category;
import entities.CategoryFactory;
import use_cases.tasks.categories.delete_category.DeleteCategory;
import use_cases.tasks.categories.create_category.CreateCategoryInputBound;
import use_cases.tasks.categories.edit_category.EditCategory;
import use_cases.tasks.categories.edit_category.EditCategoryInputBound;

public class CategoryController {

    // have a method for all the use cases for category

    /**
     * Create a new category given a name and a colour. Return whether the category was successfully created.
     * @param name - the nane of the new category to be created.
     * @param colour - the colour of the new category to be created.
     * @return true if there is not a category with provided category name in the system, return false otherwise.
     */
    public Boolean createCategory(String name, String colour, CategoryFactory factory) {
        CreateCategoryInputBound inputBound = new CreateCategoryInputBound(name, colour, factory);
        return inputBound.getSuccessful();
    }

    /**
     * Delete a category given a Category object. Return whether category was successfully deleted.
     * @param category - the Category object to be deleted.
     * @return true if the Category object is no longer in the system, return false otherwise.
     */
    public Boolean deleteCategory(Category category, CategoryFactory factory) {
        return DeleteCategory.delete(category, factory);
    }

    /**
     * Edit existing Category's visibility.
     * @param category - the Category object that is to be edited.
     * @param state - the visibility state of the category.
     * @return true if the visibility of the Category object has been successfully updated.
     */
    public Boolean editCategoryVisibility(Category category, Boolean state) {
        return EditCategory.editCategoryVisibility(category, state);
    }

    /**
     * Edit existing Category's visibility.
     * @param category - the Category object that is to be edited.
     * @param name - the new name of the category.
     * @return true if the name of the Category object has been successfully updated.
     */
    public Boolean editCategoryName(Category category, String name, CategoryFactory factory) {
        return EditCategoryInputBound.editNameInputBound(category, name, factory);
    }

    /**
     * Edit existing Category's visibility.
     * @param category - the Category object that is to be edited.
     * @param colour - the new name of the category.
     * @return true if the name of the Category object has been successfully updated.
     */
    public Boolean editCategoryColour(Category category, String colour) {
        return EditCategory.editCategoryColour(category, colour);
    }

}
