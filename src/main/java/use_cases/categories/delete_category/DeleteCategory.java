package use_cases.categories.delete_category;

import entities.CategoryFactory;

public class DeleteCategory implements DeleteCategoryInputBound {
    private final DeleteCategoryPresenter presenter;
    private final CategoryFactory factory;

    /**
     * The constructor of DeleteCategory.
     * @param presenter - the outputData that would be displayed
     * @param factory - the CategoryFactory of the user
     * @return true if the CategoryFactory no longer contains category, returns false otherwise.
     */
    public DeleteCategory(DeleteCategoryPresenter presenter, CategoryFactory factory) {
        this.presenter = presenter;
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
        return presenter.prepareSuccessView(outputData);
    }

    // getters
    public DeleteCategoryOutputBoundary getOutputBound() {
        return this.presenter;
    }

    public CategoryFactory getFactory() {
        return this.factory;
    }
}
