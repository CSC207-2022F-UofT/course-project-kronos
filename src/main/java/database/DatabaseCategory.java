package database;

import use_cases.categories.create_category.CreateCategoryDsGateway;
import use_cases.categories.create_category.CreateCategoryDsRequestModel;
import use_cases.categories.delete_category.DeleteCategoryDsGateway;
import use_cases.categories.delete_category.DeleteCategoryDsRequestModel;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryDsRequestModel;

/**
 * External layer, database for the category objects.
 */

public class DatabaseCategory implements CreateCategoryDsGateway, DeleteCategoryDsGateway, EditCategoryDsGateway {
    /**
     * Saves the data in the request model to the database.
     * @param requestModel - a data structure that contains data about the new category that should be saved in database
     */

    @Override
    public void saveCategory(CreateCategoryDsRequestModel requestModel) {

    }

    /**
     * Deletes the data in the request model from the database.
     * @param requestModel - a data structure that contains data about the category that should be deleted from database
     */
    @Override
    public void deleteCategory(DeleteCategoryDsRequestModel requestModel) {

    }

    /**
     * Edits the data in the database to match the data from the request model.
     * @param requestModel - a data structure that contains data about the category that should be edited
     */
    @Override
    public void editCategory(EditCategoryDsRequestModel requestModel) {

    }

}
