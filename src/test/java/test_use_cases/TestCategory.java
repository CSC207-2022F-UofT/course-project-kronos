// example: https://github.com/CSC207-2022F-UofT/UserLoginCleanArchitecture/blob/main/test/user_register_use_case/UserRegisterInteractorTest.java
package test_use_cases;

import database.DatabaseCategory;
import entities.Category;
import entities.CategoryCollection;
import org.junit.Test;
import use_cases.categories.create_category.*;
import use_cases.categories.delete_category.*;
import use_cases.categories.edit_category.*;

import static org.junit.Assert.*;

public class TestCategory {
    /**
     * Test CreateCategoryFrame use case.
     */
    @Test
    public void create() {
        CreateCategoryDsGateway categoryRepository = new DatabaseCategory();
        CreateCategoryOutputBound outputBoundary = new CreateCategoryOutputBound() {
            @Override
            public CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData) {
                assertEquals("example", outputData.getCategoryName());
                assertEquals(0, outputData.getCategoryId());
                assertEquals(true, outputData.getCategory().getVisibility());
                // assertTrue(categoryRepository.existsById(0));
                return null;
            }

            @Override
            public CreateCategoryOutputData prepareFailView(String error) {
                fail("Category Creation Failed. Please enter valid information.");
                return null;
            }
        };
        CategoryCollection categories = new CategoryCollection();

        CreateCategoryInputBound interactor = new CreateCategory(outputBoundary, categoryRepository, categories);
        CreateCategoryInputData inputData = new CreateCategoryInputData("example", "yellow");

        interactor.create(inputData);
    }

    /**
     * Test DeleteCategory use case.
     */
    @Test
    public void delete(){
        // Set example category object
        Category example = new Category("example delete", "pink");
        int id = example.getId();

        DeleteCategoryDsGateway categoryRepository = new DatabaseCategory();
        DeleteCategoryOutputBoundary outputBoundary = new DeleteCategoryOutputBoundary() {
            @Override
            public DeleteCategoryOutputData prepareSuccessView(DeleteCategoryOutputData outputData) {
                assertEquals(0, outputData.getCategoryId());
                assertEquals("example has been successfully deleted.", outputData.getMessage());
                // assertFalse(categories.existById(id));
                // shouldnt the above line be after defining the collection?
                return null;
            }
        };
        CategoryCollection categories = new CategoryCollection();

        DeleteCategoryInputBound deleteInteractor = new DeleteCategory(outputBoundary, categoryRepository, categories);
        DeleteCategoryInputData inputData = new DeleteCategoryInputData(id);
        deleteInteractor.delete(inputData);
    }

    /**
     * Test EditCategory use case.
     */
    @Test
    public void edit(){
        // Set example task object.

        Category example = new Category("example", "orange");
        int id = example.getId();

        EditCategoryDsGateway categoryRepository = new DatabaseCategory();
        EditCategoryOutputBoundary outputBoundary = new EditCategoryOutputBoundary() {
            @Override
            public EditCategoryOutputData prepareSuccessView(EditCategoryOutputData outputData) {
                assertEquals("after", outputData.getCategoryName());
                assertEquals("pink", outputData.getCategoryColour());
                assertFalse(outputData.getVisibility());
                assertEquals(1, outputData.getCategoryId());
                return null;
            }

            @Override
            public EditCategoryOutputData prepareFailView(String error) {
                assertEquals("Changes not saved. Please fill out all fields.", error);
                return null;
            }

        };
        CategoryCollection categories = new CategoryCollection();

        EditCategoryInputBound editInteractor = new EditCategory(outputBoundary, categoryRepository, categories, id);
        EditCategoryInputData inputData = new EditCategoryInputData(id, "after", "pink", false);
        editInteractor.edit(inputData);

    }

}
