package use_cases.categories.edit_category;

/**
 * -- Application Business Layer --
 * This is an interface that passes the inputData to the interactor of category modification.
 */
public interface EditCategoryInputBound {
    /**
     * Edit a category based on input data.
     * @param inputData - input data includes id, name, and colour, and visibility state of the category to be edited
     */
    EditCategoryOutputData edit(EditCategoryInputData inputData);

}
