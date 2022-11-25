package use_cases.categories.delete_category;

import entities.Category;

public class DeleteCategoryDsRequestModel {
    private final Category category;


    public DeleteCategoryDsRequestModel(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
