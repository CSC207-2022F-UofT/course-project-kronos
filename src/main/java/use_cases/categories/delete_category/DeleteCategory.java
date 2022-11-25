package use_cases.categories.delete_category;

import entities.CategoryFactory;

public class DeleteCategory implements DeleteCategoryInputBound {
    private final DeleteCategoryOutputBoundary outputBound;
    private final CategoryFactory factory;

    /**
     * The constructor of DeleteCategory.
     * @param outputBound - the outputData that would be displayed
     * @param factory - the CategoryFactory of the user
     * @return true if the CategoryFactory no longer contains category, returns false otherwise.
     */
    public DeleteCategory(DeleteCategoryOutputBoundary outputBound, CategoryFactory factory) {
        this.outputBound = outputBound;
        this.factory = factory;
    }

    /**
     * Deleting the category with given input.
     * @param inputData - the outputData that would be displayed
     * @return true if the CategoryFactory no longer contains category, returns false otherwise.
     */
    @Override
    public DeleteCategoryOutputData delete(DeleteCategoryInputData inputData) {
        String name = inputData.getCategory().getName();
        factory.removeItem(inputData.getCategory());
        DeleteCategoryOutputData outputData = new DeleteCategoryOutputData(name + " has been successfully " +
                "deleted.", inputData.getCategory());
        return outputBound.prepareSuccessView(outputData);
    }

    // getters
    public DeleteCategoryOutputBoundary getOutputBound() {
        return this.outputBound;
    }

    public CategoryFactory getFactory() {
        return this.factory;
    }
}
