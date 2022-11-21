// example: https://github.com/CSC207-2022F-UofT/UserLoginCleanArchitecture/blob/main/test/user_register_use_case/UserRegisterInteractorTest.java

package test_use_cases;

import entities.Category;
import entities.User;
import org.junit.Test;
import use_cases.tasks.categories.CategoryPresenter;
import use_cases.tasks.categories.create_category.CreateCategoryInputBound;
import use_cases.tasks.categories.delete_category.DeleteCategory;
import use_cases.tasks.categories.edit_category.EditCategory;
import use_cases.tasks.categories.edit_category.EditCategoryInputBound;

import static org.junit.Assert.*;

public class TestCategory {

    // creating Use Case interactors and prerequisite objects
    User user = new User();
    CategoryPresenter presenter = new CategoryPresenter(user);

    String name = "Chores";
    String newName = "Groceries";

    String colour = "RED";
    String newColour = "BLUE";
    CreateCategoryInputBound createInputBound = new CreateCategoryInputBound(name, colour, user.getCategoryCollection());
    Category category = presenter.createCategory(name, colour);

    @Test(timeout = 500)
    public void testCreateCategory() {
        assertTrue(createInputBound.getSuccessful());
        assertEquals(name, category.getCategoryName());
        assertEquals(colour, category.getColour());
    }

    @Test(timeout = 500)
    public void testDuplicateCreateCategory() {
        CreateCategoryInputBound duplicateInputBound = new CreateCategoryInputBound(name, colour, user.getCategoryCollection());

        assertFalse(duplicateInputBound.getSuccessful());
    }


    @Test(timeout = 500)
    public void testEditCategoryName() {
        EditCategory.editCategoryName(category, newName);

        assertEquals(newName, presenter.editName(name, newName, colour));
    }

    @Test(timeout = 500)
    public void testEditDuplicateCategoryName() {
        assertFalse(name, EditCategoryInputBound.editNameInputBound(category, newName, user.getCategoryCollection()));
    }

    @Test(timeout = 500)
    public void testEditCategoryColour() {
        EditCategory.editCategoryColour(category, newColour);

        assertEquals(newColour, presenter.editColour(newName, newColour).getColour()); // is this ok? doesn't follow the steps in the example
    }

    @Test(timeout = 500)
    public void testEditCategoryVisibility() {
        EditCategory.editCategoryVisibility(category, false);

        assertFalse(presenter.editVisibility(newName, newColour, false).getVisibility());
    }

    @Test(timeout = 500)
    public void testDeleteCategory() {
        DeleteCategory.delete(category, user.getCategoryCollection());

        assertTrue(presenter.deleteCategory(name));
    }


}
