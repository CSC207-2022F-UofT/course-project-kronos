package task_use_cases;
import entities.Category;

public class CreateCategory {

    //input bound will have to check that the input is valid (colour should have static FINAL options, no repeat names)
    public CreateCategory(String name, String colour) {
        Category category = new Category(name, colour);
    }
}
