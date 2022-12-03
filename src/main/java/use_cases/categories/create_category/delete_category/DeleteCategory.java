package use_cases.categories.create_category.delete_category;

<<<<<<< HEAD:src/main/java/use_cases/categories/create_category/delete_category/DeleteCategory.java
import entities.CategoryFactory;
=======
import entities.Category;
import entities.CategoryCollection;
import entities.User;
>>>>>>> origin/main:src/main/java/use_cases/categories/delete_category/DeleteCategory.java

public class DeleteCategory implements DeleteCategoryInputBound {
    private final DeleteCategoryOutputBoundary outputBound;
    private final CategoryCollection categories;

    /**
     * The constructor of DeleteCategory.
     * @param outputBound - the outputData that would be displayed
     * @param categories - the categories of the User that's logged in
     * @return true if the CategoryCollection no longer contains category, returns false otherwise.
     */
    public DeleteCategory(DeleteCategoryOutputBoundary outputBound, CategoryCollection categories) {
        this.outputBound = outputBound;
        this.categories = categories;
    }

    /**
     * Deleting the category with given input.
     * @param inputData - the outputData that would be displayed
     * @return true if the CategoryCollection no longer contains category, returns false otherwise.
     */
    @Override
    public DeleteCategoryOutputData delete(DeleteCategoryInputData inputData) {
        Integer ID = inputData.getID();
        Category category = this.categories.getItem(ID);
        String name = category.getName();
        categories.removeItem(category);
        DeleteCategoryOutputData outputData = new DeleteCategoryOutputData(name + " has been successfully " +
                "deleted.", category);
        return outputBound.prepareSuccessView(outputData);
    }

    // getters
    public DeleteCategoryOutputBoundary getOutputBound() {
        return this.outputBound;
    }

    public CategoryCollection getFactory() {
        return this.categories;
    }
}
