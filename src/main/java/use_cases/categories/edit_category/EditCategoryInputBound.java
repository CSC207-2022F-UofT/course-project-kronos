package use_cases.categories.edit_category;

/**
 * Interface that passes the inputData to the interactor for editing a Category.
 */

public interface EditCategoryInputBound {
    EditCategoryOutputData edit(EditCategoryInputData inputData);

}
