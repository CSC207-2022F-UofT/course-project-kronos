package test_entities;

import entities.Habit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestHabit {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Tests the constructor for the habit entity.
     */

    @Test(timeout = 500)
    public void testHabitConstructor() {
        Habit h = new Habit("Read a book", "daily");
        assertEquals("The name of the habit should be 'Read a book'", "Read a book", h.getName());
        assertEquals("The type of the habit should be 'daily'", "daily",h.getType());
        assertEquals("The frequency of the habit should be 0", 0, h.getFrequency());
        assertTrue("The Frequency Map of the habit is empty", h.isFrequencyMapEmpty());

    }

    /**
     * Tests the setter setName for the habit entity.
     */

    @Test(timeout = 500)
    public void testHabitSetName() {
        Habit h = new Habit("Run 5 Kms", "weekly");
        assertEquals("The name of the habit should be 'Run 5 Kms'", "Run 5 Kms", h.getName());
        h.setName("Run 3 Kms");
        assertEquals("The name of the habit should be 'Run 3 Kms' after the change", "Run 3 Kms",
                h.getName());
    }

    /**
     * Tests the setter setType for the habit entity.
     */

    @Test(timeout = 500)
    public void testHabitSetType() {
        Habit h = new Habit("Run 5 Kms", "weekly");
        assertEquals("The type of the habit should be 'weekly'", "weekly", h.getType());
        h.setType("daily");
        assertEquals("The type of the habit should be 'daily' after the change", "daily",
                h.getType());
    }

    /**
     * Tests the getter getFrequencyMap for the habit entity.
     */

    @Test(timeout = 500)
    public void testHabitGetFrequencyMap() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put(LocalDate.now().toString(), 3);
        Habit h = new Habit("Run 5 Kms", "weekly");
        h.markFrequency();
        h.markFrequency();
        h.markFrequency();
        assertEquals("The Frequency Map of the Habit is " + LocalDate.now() +"3", testMap,
                h.getFrequencyMap());
    }

    /**
     * Tests the method markFrequency for the habit entity.
     */

    @Test(timeout = 500)
    public void testHabitMarkFrequency() {
        Habit h = new Habit("Run 5 Kms", "weekly");
        h.markFrequency();
        h.markFrequency();
        h.markFrequency();
        h.markFrequency();
        assertEquals("The frequency of the Habit is four", 4, h.getFrequency());
    }

}

