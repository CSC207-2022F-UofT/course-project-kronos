package use_cases.categories.delete_category;

/**
 * Contains input data to delete a Category (goes from controller to use case).
 */
public class DeleteCategoryInputData {
    private final Integer ID;

    /**
     * Constructor for a DeleteCategoryInputData object.
     * @param ID - the input category to be deleted
     * Precondition: argument will always exist in the database (since user will select from a drop down menu to delete)
     */
    public DeleteCategoryInputData(Integer ID) {
        this.ID = ID;
    }

    // getters
    public Integer getID() {
        return this.ID;
    }
}
