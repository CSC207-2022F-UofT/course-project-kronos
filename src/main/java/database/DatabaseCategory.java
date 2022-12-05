package database;

import entities.CategoryCollection;
import use_cases.categories.create_category.CreateCategoryDsGateway;
import use_cases.categories.create_category.CreateCategoryDsRequestModel;
import use_cases.categories.delete_category.DeleteCategoryDsGateway;
import use_cases.categories.delete_category.DeleteCategoryDsRequestModel;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryDsRequestModel;

public class DatabaseCategory implements CreateCategoryDsGateway, DeleteCategoryDsGateway, EditCategoryDsGateway {

    protected CategoryCollection collection;

    public DatabaseCategory(Database database){
        this.collection = database.currUser.getCategoryCollection();
    }

    @Override
    public void deleteCategory(DeleteCategoryDsRequestModel requestModel) {
        this.collection.categories.remove(requestModel.getCategory().getId());
    }

    @Override
    public void saveCategory(CreateCategoryDsRequestModel requestModel) {
        this.collection.categories.put(requestModel.getId(), requestModel.getCategory());
    }

    @Override
    public void editCategory(EditCategoryDsRequestModel requestModel) {
        this.collection.categories.replace(requestModel.getCategory().getId(), requestModel.getCategory());
    }
}
