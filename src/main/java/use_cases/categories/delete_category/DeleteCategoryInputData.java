package use_cases.categories.delete_category;

/**
 * -- Application Business Layer --
 *  This class is a container for the input data related to deletion of a category, it is created by the controller and
 *  sent to the interactor or use case
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

    /**
     * @return the id of the category that will be deleted.
     */
    public Integer getID() {
        return this.ID;
    }
}
