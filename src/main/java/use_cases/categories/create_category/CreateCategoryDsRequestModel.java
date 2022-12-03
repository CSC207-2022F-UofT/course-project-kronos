package use_cases.categories.create_category;

import entities.Category;

public class CreateCategoryDsRequestModel {
    private Category category;

    public CreateCategoryDsRequestModel(Category category){
        this.category = category;
    }

    // getters
    public Category getCategory(){
        return this.category;
    }

    public Integer getId() {
        return this.category.getId();
    }

    // setters
    public void setCategory(Category category) {
        this.category = category;
    }
}
