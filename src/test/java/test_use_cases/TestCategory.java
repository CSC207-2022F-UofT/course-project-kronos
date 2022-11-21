// example: https://github.com/CSC207-2022F-UofT/UserLoginCleanArchitecture/blob/main/test/user_register_use_case/UserRegisterInteractorTest.java

package test_use_cases;

import entities.Category;
import entities.CategoryFactory;
import entities.User;
import org.junit.Test;
import use_cases.categories.CategoryPresenter;
import use_cases.categories.create_category.*;
import use_cases.categories.delete_category.DeleteCategory;
import use_cases.categories.edit_category.EditCategory;
import use_cases.categories.edit_category.EditCategoryInputBound;

import static org.junit.Assert.*;

public class TestCategory {
     CategoryFactory factory = new CategoryFactory();
     String name = "Chores";
     String colour = "RED";
     CreateCategoryOutputBound outputBound = new CreateCategoryOutputBound() {
        @Override
        public CreateCategoryOutputData prepareSuccessView(CreateCategoryOutputData outputData) {
            assertEquals(name, outputData.getCategory().getName());
            assertTrue(factory.contains(outputData.getCategory().getName(), false));
            return null;
        }
        @Override
        public CreateCategoryOutputData prepareFailView(CreateCategoryOutputData outputData) {
            return null;
        }
    } ;

    CreateCategoryInputBound inputBound = new CreateCategoryInputBound() {
        @Override
        public CreateCategoryOutputData edit(CreateCategoryInputData inputData) {
            if (inputData.getName().isBlank()) {
                CreateCategoryOutputData outputData = new CreateCategoryOutputData("Error: Please enter the name of " +
                        "the category.");
                return outputBound.prepareFailView(outputData);
            } else if(factory.contains(inputData.getName(), false)){
                CreateCategoryOutputData outputData = new CreateCategoryOutputData("Error: This category name " +
                        "already exists. Please enter a new category name.");
                return outputBound.prepareFailView(outputData);
            }
            Category category = new Category(inputData.getName(), inputData.getColour());
            factory.addItem(category);
            CreateCategoryOutputData outputData = new CreateCategoryOutputData(category);
            return outputBound.prepareSuccessView(outputData);
        }
    };

    CreateCategoryInputData inputData = new CreateCategoryInputData(name, colour);

    // inputBound.edit(inputData); // what's wrong here?
}
