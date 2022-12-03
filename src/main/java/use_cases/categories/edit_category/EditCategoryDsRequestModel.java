package use_cases.categories.edit_category;

import entities.Category;
import use_cases.categories.create_category.CreateCategoryDsRequestModel;

public class EditCategoryDsRequestModel {
    private Category category;

    public EditCategoryDsRequestModel(Category category){
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
