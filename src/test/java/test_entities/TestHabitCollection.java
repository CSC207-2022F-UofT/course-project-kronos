package test_entities;
import entities.Habit;
import entities.HabitCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.Assert.*;

public class TestHabitCollection {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testHabitAddItem() {
        Habit h = new Habit("Run 5 Kms", "weekly");
        HashMap<String, Habit> testFactory = new HashMap<>();
        testFactory.put(h.getName(), h);
        HabitCollection hFactory = new HabitCollection();
        hFactory.addItem(h);
        assertEquals("The habit is recorded in the Factory", testFactory, hFactory.getCollection() );
    }

    @Test(timeout = 500)
    public void testHabitRemoveItem() {
        Habit h1 = new Habit("Run 5 Kms", "weekly");
        Habit h2 = new Habit("Read a book", "daily");
        Habit h3 = new Habit("Drink Water", "daily");
        HashMap<String, Habit> testFactory = new HashMap<>();
        testFactory.put(h1.getName(), h1);
        testFactory.put(h3.getName(), h3);
        HabitCollection hFactory = new HabitCollection();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);
        hFactory.removeItem(h2);
        assertEquals("The habit is deleted from the Factory", testFactory, hFactory.getCollection());
    }

    @Test(timeout = 500)
    public void testHabitRemoveItemEmpty() {
        Habit h1 = new Habit("Run 5 Kms", "weekly");
        HabitCollection hFactory = new HabitCollection();
        hFactory.addItem(h1);
        hFactory.removeItem(h1);
        assertTrue("The Factory is empty", hFactory.getCollection().isEmpty());
    }

    @Test(timeout = 500)
    public void testHabitUpdateKey() {
        Habit h1 = new Habit("Run 5 Kms", "weekly");
        Habit h2 = new Habit("Read a book", "daily");
        Habit h3 = new Habit("Drink Water", "daily");
        HabitCollection hFactory = new HabitCollection();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);

        assertTrue("The Key 'Run 5 Kms' exists in the Factory", hFactory.getCollection().containsKey("Run 5 Kms"));

        hFactory.updateKey("Run 5 Kms", "Run 2.5 Kms");

        assertFalse("The Key 'Run 5 Kms' exists in the Factory",
                hFactory.getCollection().containsKey("Run 5 Kms"));
        assertTrue("The Key 'Run 2.5 Kms' exists in the Factory",
                hFactory.getCollection().containsKey("Run 2.5 Kms"));
    }

    @Test(timeout = 500)
    public void testGetCollection() {
        Habit h1 = new Habit("Run 5 Kms", "weekly");
        Habit h2 = new Habit("Read a book", "daily");
        Habit h3 = new Habit("Drink Water", "daily");
        HabitCollection hFactory = new HabitCollection();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);

        assertEquals("The correct collection is returned", hFactory.getCollection(), hFactory.getCollection());
    }

    @Test(timeout = 500)
    public void testConvertToArray() {
        Habit h1 = new Habit("Run 5 Kms", "weekly");
        Habit h2 = new Habit("Read a book", "daily");
        Habit h3 = new Habit("Drink Water", "daily");
        HabitCollection hFactory = new HabitCollection();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);

        ArrayList<Habit> habits = hFactory.convertToArray();

        assertTrue("The correct array is returned", habits.contains(h1));
        assertTrue("The correct array is returned", habits.contains(h2));
        assertTrue("The correct array is returned", habits.contains(h3));

    }
}
