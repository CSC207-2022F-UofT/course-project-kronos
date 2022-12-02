// example: https://github.com/CSC207-2022F-UofT/UserLoginCleanArchitecture/blob/main/test/user_register_use_case/UserRegisterInteractorTest.java

package test_use_cases;

import database.DatabaseCategory;
import entities.Category;
import entities.CategoryCollection;
import org.junit.Test;
import use_cases.categories.create_category.*;

import static org.junit.Assert.*;

public class TestCategory {
    /**
     * Test CreateCategory use case.
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
                // assertEquals(categoryRepository.existsById(1))
                return null;
            }

            @Override
            public CreateCategoryOutputData prepareFailView(String error) {
                fail("Category Creation Failed. Please enter valid information.");
                return null;
            }
        };
        CategoryCollection categories = new CategoryCollection();

        CreateCategoryInputBound interactor = new CreateCategory(outputBoundary, categories);
        CreateCategoryInputData inputData = new CreateCategoryInputData("example", "yellow");

        interactor.create(inputData);
    }

    /**
     * Test DeleteCategory use case.
     */
}
