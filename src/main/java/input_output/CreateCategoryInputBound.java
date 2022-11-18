package input_output;

import entities.CategoryFactory;
import entities.Category;
import task_use_cases.CreateCategory;

import java.util.ArrayList;
import java.util.List;

public class CreateCategoryInputBound {

    private static String[] COLOURS = {"BLACK", "WHITE", "RED", "BLUE", "YELLOW", "PURPLE", "GREEN", "ORANGE", "GREY", "PINK", "BROWN"};


    public CreateCategoryInputBound(String name, String colour) {
        if (Category.categories.contains(name) == false && name != "") {
            CreateCategory create = new CreateCategory(name, colour);
        }
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
