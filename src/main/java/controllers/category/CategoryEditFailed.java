package controllers.category;

public class CategoryEditFailed extends RuntimeException{
    public CategoryEditFailed(String error){
        super(error);
    }
}
