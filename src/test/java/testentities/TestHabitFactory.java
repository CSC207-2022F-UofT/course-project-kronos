package testentities;

import entities.Habit;
import entities.HabitFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;


public class TestHabitFactory {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testHabitAddItem() {
        Habit h = new Habit("Run 5 Kms", "weekly", true);
        HashMap<String, Habit> testFactory = new HashMap<>();
        testFactory.put(h.getName(), h);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h);
        assertEquals("The habit is recorded in the Factory", testFactory, hFactory.h_items );
    }

    @Test(timeout = 500)
    public void testHabitRemoveItem() {
        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        Habit h2 = new Habit("Read a book", "daily", true);
        Habit h3 = new Habit("Drink Water", "daily", false);
        HashMap<String, Habit> testFactory = new HashMap<>();
        testFactory.put(h1.getName(), h1);
        testFactory.put(h3.getName(), h3);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);
        hFactory.removeItem(h2);
        assertEquals("The habit is deleted from the Factory", testFactory, hFactory.h_items);
    }

    @Test(timeout = 500)
    public void testHabitRemoveItemEmpty() {
        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);
        hFactory.removeItem(h1);
        assertTrue("The Factory is empty", hFactory.h_items.isEmpty());
    }

    @Test(timeout = 500)
    public void testHabitUpdateKey() {
        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        Habit h2 = new Habit("Read a book", "daily", true);
        Habit h3 = new Habit("Drink Water", "daily", false);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);

        assertTrue("The Key 'Run 5 Kms' exists in the Factory", hFactory.h_items.containsKey("Run 5 Kms"));

        hFactory.updateKey("Run 5 Kms", "Run 2.5 Kms");

        assertFalse("The Key 'Run 5 Kms' exists in the Factory", hFactory.h_items.containsKey("Run 5 Kms"));
        assertTrue("The Key 'Run 2.5 Kms' exists in the Factory", hFactory.h_items.containsKey("Run 2.5 Kms"));
    }


}
