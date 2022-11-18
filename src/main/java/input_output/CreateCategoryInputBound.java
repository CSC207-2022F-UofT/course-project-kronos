package input_output;

import entities.Category;
import task_use_cases.CreateCategory;

import java.util.ArrayList;
import java.util.List;

public class CreateCategoryInputBound {

    private static String[] COLOURS = {"BLACK", "WHITE", "RED", "BLUE", "YELLOW", "PURPLE", "GREEN", "ORANGE", "GREY", "PINK", "BROWN"};
    private Boolean successful;


    public CreateCategoryInputBound(String name, String colour) {
        if (Category.categories.contains(name, true) == false && name != "") {
            this.successful = CreateCategory.createCategory(name, colour);
        }
    }

    public Boolean getSuccessful() {
        return this.successful;
    }

    // Can categories have same colours? Leaning on YES
    private Boolean checkColours(String colour) { // ? SIKE might not even need this if J Swing only has drop down menu
        boolean found = false;
        for(String c: COLOURS) {
            if (c == colour) {
                found = true;
            }
        }
        return found;
    }
}
