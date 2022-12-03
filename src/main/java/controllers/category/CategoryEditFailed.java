package controllers.category;
/**
 * Exception deals with failure of editing a category.
 */
public class CategoryEditFailed extends RuntimeException{

    /**
     * Exception Constructor.
     * @param error - the error message.
     */
    public CategoryEditFailed(String error){
        super(error);
    }
}
