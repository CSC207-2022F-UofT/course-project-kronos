package controllers.category;
/**
 * Exception deals with failure of creating a new category.
 */
public class CategoryCreationFailed extends RuntimeException {

    /**
     * Exception Constructor.
     * @param error - the error message
     */
    public CategoryCreationFailed(String error) {
        super(error);
    }
}
