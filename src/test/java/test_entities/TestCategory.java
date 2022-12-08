package test_entities;

import entities.Category;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCategory {

    Category category = new Category("name", "colour");
    @Test(timeout = 500)
    public void testConstructor() {
        String name = "Chores";
        String colour = "RED";
        Category example = new Category(name, colour);
        // assertion
        assertEquals(name, example.categoryName);
    }
    @Test(timeout = 500)
    public void testSetCategoryName() {
        String name = "Chores";
        category.setName(name);
        // assertion
        assertEquals(name, category.categoryName);
    }
    public void testGetCategoryName() {
        String name = category.categoryName;
        // assertion
        assertEquals(name, category.getName());
    }
    @Test(timeout = 500)
    public void testColour() {
        String colour = "BLUE";
        category.setColour(colour);
        // assertion
        assertEquals(colour, category.getColour());
    }

    @Test(timeout = 500)
    public void testVisibility() {
        Boolean state = false;
        category.setVisibility(state);
        // assertion
        assertEquals(state, category.getVisibility());
    }

}
