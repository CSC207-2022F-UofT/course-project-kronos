package controllers.category;

public class CategoryCreationFailed extends RuntimeException{

    public CategoryCreationFailed(String error) {
        super(error);
    }
}
