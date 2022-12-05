package database;

import entities.Category;
import entities.CategoryCollection;
import use_cases.categories.create_category.CreateCategoryDsGateway;
import use_cases.categories.create_category.CreateCategoryDsRequestModel;
import use_cases.categories.delete_category.DeleteCategoryDsGateway;
import use_cases.categories.delete_category.DeleteCategoryDsRequestModel;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryDsRequestModel;

import java.util.HashMap;

public class DatabaseCategory implements CreateCategoryDsGateway, DeleteCategoryDsGateway, EditCategoryDsGateway {

    protected HashMap<Integer, Category> collection;

    public DatabaseCategory(DatabaseUser database){
        this.collection = database.getCategories().categories;
    }

    /**
     * Saves the data about the task after creation to the database.
     *
     * @param requestModel - a data structure that contains data about the new category
     */
    @Override
    public void saveCategory(CreateCategoryDsRequestModel requestModel) {
        this.collection.put(requestModel.getId(), requestModel.getCategory());
    }

    /**
     * Deletes that category that matches the data in the request model from the database.
     *
     * @param requestModel - a data structure that contains data about the category to be deleted
     */
    @Override
    public void deleteCategory(DeleteCategoryDsRequestModel requestModel) {
        this.collection.remove(requestModel.getCategory().getId());
    }

    /**
     * Saves the data about the category after edition to the database.
     *
     * @param requestModel - a data structure that contains data about the category after editing
     */
    @Override
    public void editCategory(EditCategoryDsRequestModel requestModel) {
        this.collection.replace(requestModel.getCategory().getId(), requestModel.getCategory());
    }
}