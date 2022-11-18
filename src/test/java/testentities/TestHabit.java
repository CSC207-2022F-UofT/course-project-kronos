package testentities;

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

    @Test(timeout = 500)
    public void testHabitConstructor() {
        Habit h = new Habit("Read a book", "daily", true);
        assertEquals("The name of the habit should be 'Read a book'", "Read a book", h.getName());
        assertEquals("The type of the habit should be 'daily'", "daily",h.getType());
        assertTrue("The name of the habit should be 'Read a book'", h.getReminder());
        assertEquals("The frequency of the habit should be 0", 0, h.getFrequency());
        assertTrue("The Frequency Map of the habit is empty", h.isFrequencyMapEmpty());

    }

    @Test(timeout = 500)
    public void testHabitSetName() {
        Habit h = new Habit("Run 5 Kms", "weekly", true);
        assertEquals("The name of the habit should be 'Run 5 Kms'", "Run 5 Kms", h.getName());
        h.setName("Run 3 Kms");
        assertEquals("The name of the habit should be 'Run 3 Kms' after the change", "Run 3 Kms",
                h.getName());
    }

    @Test(timeout = 500)
    public void testHabitSetType() {
        Habit h = new Habit("Run 5 Kms", "weekly", true);
        assertEquals("The type of the habit should be 'weekly'", "weekly", h.getType());
        h.setType("daily");
        assertEquals("The type of the habit should be 'daily' after the change", "daily",
                h.getType());
    }

    @Test(timeout = 500)
    public void testHabitSetReminder() {
        Habit h = new Habit("Run 5 Kms", "weekly", true);
        assertTrue("The reminder of the Habit is ON'", h.getReminder());
        h.setReminder(false);
        assertFalse("The reminder of the Habit is OFF", h.getReminder());
    }

    @Test(timeout = 500)
    public void testHabitGetFrequencyMap() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put(LocalDate.now().toString(), 3);
        Habit h = new Habit("Run 5 Kms", "weekly", true);
        h.markFrequency();
        h.markFrequency();
        h.markFrequency();
        assertEquals("The Frequency Map of the Habit is " + LocalDate.now() +"3", testMap,
                h.getFrequencyMap());
    }

    @Test(timeout = 500)
    public void testHabitMarkFrequency() {
        Habit h = new Habit("Run 5 Kms", "weekly", true);
        h.markFrequency();
        h.markFrequency();
        h.markFrequency();
        h.markFrequency();
        assertEquals("The frequency of the Habit is four", 4, h.getFrequency());
    }

}
