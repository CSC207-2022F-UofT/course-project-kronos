package use_cases.categories.delete_category;

import entities.Category;
import entities.CategoryCollection;
import entities.User;

public class DeleteCategory implements DeleteCategoryInputBound {
    private final DeleteCategoryOutputBoundary outputBound;
    private final User user;
    private final CategoryCollection collection;

    /**
     * The constructor of DeleteCategory.
     * @param outputBound - the outputData that would be displayed
     * @param user - the User that's logged in
     * @return true if the CategoryCollection no longer contains category, returns false otherwise.
     */
    public DeleteCategory(DeleteCategoryOutputBoundary outputBound, User user) {
        this.outputBound = outputBound;
        this.user = user;
        this.collection = user.getCategoryCollection();
    }

    /**
     * Deleting the category with given input.
     * @param inputData - the outputData that would be displayed
     * @return true if the CategoryCollection no longer contains category, returns false otherwise.
     */
    @Override
    public DeleteCategoryOutputData delete(DeleteCategoryInputData inputData) {
        Integer ID = inputData.getID();
        Category category = this.collection.getItem(ID);
        String name = category.getName();
        collection.removeItem(category);
        DeleteCategoryOutputData outputData = new DeleteCategoryOutputData(name + " has been successfully " +
                "deleted.", category);
        return outputBound.prepareSuccessView(outputData);
    }

    // getters
    public DeleteCategoryOutputBoundary getOutputBound() {
        return this.outputBound;
    }

    public CategoryCollection getFactory() {
        return this.collection;
    }
}
