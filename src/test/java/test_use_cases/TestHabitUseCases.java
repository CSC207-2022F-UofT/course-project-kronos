package test_use_cases;
import entities.Habit;
import entities.HabitFactory;
import use_cases.habits.create_habit.CreateHabit;
import use_cases.habits.create_habit.CreateHabitOutputBoundary;
import use_cases.habits.create_habit.CreateHabitOutputData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import use_cases.habits.edit_habit.EditHabit;
import use_cases.habits.edit_habit.EditHabitOutputBoundary;
import use_cases.habits.edit_habit.EditHabitOutputData;

import static org.junit.Assert.*;

public class TestHabitUseCases {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testCreateHabitConstructor() {

        Habit h1 = new Habit("Run 5 Kms", "weekly");

        HabitFactory hFactory = new HabitFactory();

        hFactory.addItem(h1);


        CreateHabitOutputBoundary outputBound = new CreateHabitOutputBoundary(){
            @Override
            public CreateHabitOutputData prepareSuccessView(CreateHabitOutputData outputData) {
                assertEquals(h1.getName(), outputData.getHabit().getName());
                assertTrue(hFactory.getCollection().containsKey(outputData.getHabit().getName()));

                return null;
            }

            @Override
            public CreateHabitOutputData prepareFailView(String error) {
                return null;
            }
        };

        CreateHabit cHabit = new CreateHabit(outputBound, hFactory);

        assertEquals("The output boundary is the correct one", cHabit.getOutputBoundary(), outputBound);
        assertEquals("The habit factory is the correct one", cHabit.getHabitFactory(), hFactory);

    }

    @Test(timeout = 500)
    public void testEditHabitConstructor() {

        Habit h1 = new Habit("Run 5 Kms", "weekly");

        HabitFactory hFactory = new HabitFactory();

        hFactory.addItem(h1);

        String newName = "Run 3 Kms";

        h1.setName(newName);


        EditHabitOutputBoundary outputBound = new EditHabitOutputBoundary(){
            @Override
            public EditHabitOutputData prepareSuccessView(EditHabitOutputData outputData) {
                assertEquals(h1.getName(), outputData.getHabitName());
                assertTrue(hFactory.getCollection().containsKey(outputData.getHabitName()));
                return null;
            }

            @Override
            public EditHabitOutputData prepareFailView(EditHabitOutputData outputData) {
                return null;
            }
        };


        EditHabit eHabit = new EditHabit(outputBound, null, hFactory);

        assertEquals("The output boundary is the correct one", eHabit.getOutputBoundary(), outputBound);
        assertEquals("The habit factory is the correct one", eHabit.getHabitFactory(), hFactory);

    }

    @Test(timeout = 500)
    public void testDeleteHabitConstructor() {

        Habit h1 = new Habit("Run 5 Kms", "weekly");

        HabitFactory hFactory = new HabitFactory();

        hFactory.addItem(h1);

    }


}
