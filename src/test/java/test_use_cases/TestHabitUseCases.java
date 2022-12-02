package test_use_cases;
import entities.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static use_cases.habits.create_habit.CreateHabit.createHabit;
import static use_cases.habits.delete_habit.DeleteHabit.deleteHabit;
import static use_cases.habits.edit_habit.EditHabit.*;
import static use_cases.habits.track_habit.TrackHabit.increaseHabitFrequency;
import static org.junit.Assert.*;

public class TestHabitUseCases {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testCreateHabit() {

        String hTitle = "Sleep at 10 pm daily";
        String hType = "weekly";
        HabitFactory hFactory = new HabitFactory();
        TaskFactory tFactory = new TaskFactory();
        CategoryCollection cFactory = new CategoryCollection();
        Timer t = new Timer();
        CommonUser u = new CommonUser("hello123@gmail.com", "12345678", "Harry", "Potter",
                hFactory, tFactory, cFactory, t);
        createHabit(u, hTitle, hType, true);
        Set<String> s = new HashSet<>();
        s.add("Sleep at 10 pm daily");
        assertEquals( u.getHabitCollection().habitCollection.keySet(), s);
    }

    @Test(timeout = 500)
    public void testDeleteHabit() {

        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        Habit h2 = new Habit("Read a book", "daily", true);
        Habit h3 = new Habit("Drink Water", "daily", false);

        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);
        TaskFactory tFactory = new TaskFactory();
        CategoryCollection cFactory = new CategoryCollection();
        Timer t = new Timer();
        CommonUser u = new CommonUser("hello123@gmail.com", "12345678", "Harry", "Potter",
                hFactory, tFactory, cFactory, t);

        Boolean v = deleteHabit(u, "Read a book");
        assertEquals("The habit is deleted from the Factory", false, v);
    }

    @Test(timeout = 500)
    public void testEditHabitName() {


        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);
        TaskFactory tFactory = new TaskFactory();
        CategoryCollection cFactory = new CategoryCollection();
        Timer t = new Timer();
        CommonUser u = new CommonUser("hello123@gmail.com", "12345678", "Harry", "Potter",
                hFactory, tFactory, cFactory, t);

        String newName = "Run 8 Kms";
        editName(u, h1, newName);

        assertEquals("The name was changed", h1.getName(), "Run 8 Kms");
    }

    @Test(timeout = 500)
    public void testEditHabitType() {

        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);
        String newType = "daily";

        editType(h1,newType);

        assertEquals("The type was changed", h1.getType(), "daily");
    }

    @Test(timeout = 500)
    public void testEditHabitReminder() {


        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);

        Boolean newState = false;

        editReminder(h1,newState);

        assertFalse("The Reminder state was changed", h1.getReminder());
    }

    @Test(timeout = 500)
    public void testTrackHabit() {

        Habit h1 = new Habit("Run 5 Kms", "weekly", true);
        HabitFactory hFactory = new HabitFactory();
        hFactory.addItem(h1);
        increaseHabitFrequency(h1);
        increaseHabitFrequency(h1);
        increaseHabitFrequency(h1);
        increaseHabitFrequency(h1);
        assertEquals("The frequency was marked", h1.getFrequency(), 4);
    }

}
