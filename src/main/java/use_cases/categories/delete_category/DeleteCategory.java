package use_cases.categories.delete_category;

import entities.Category;
import entities.CategoryCollection;

/**
 * -- Application Business Layer --
 * The use case Interactor that is responsible for deleting a category.
 */
public class DeleteCategory implements DeleteCategoryInputBoundary {
    private final DeleteCategoryOutputBoundary outputBound;
    private final CategoryCollection categories;

    /**
     * The constructor of DeleteCategory.
     * @param outputBound - the outputData that would be displayed
     * @param dsGateway - the database gateway interface
     * @param categories - the categories of the User that's logged in
     */
    public DeleteCategory(DeleteCategoryOutputBoundary outputBound, DeleteCategoryDsGateway dsGateway, CategoryCollection categories) {
        this.outputBound = outputBound;
        this.categories = categories;
    }

    /**
     * Deleting the category with the given input.
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

    /**
     * collection getter
     * @return the category collection of the user logged in
     */
    public CategoryCollection getCollection() {
        return this.categories;
    }
}
