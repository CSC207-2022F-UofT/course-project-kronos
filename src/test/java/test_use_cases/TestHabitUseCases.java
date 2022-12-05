package test_use_cases;
import database.DatabaseHabit;
import entities.Habit;
import entities.HabitFactory;
import use_cases.habits.create_habit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import use_cases.habits.delete_habit.*;
import use_cases.habits.edit_habit.*;
import use_cases.habits.track_habit.*;

import static org.junit.Assert.*;

public class TestHabitUseCases {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test CreateTask use case.
     */
    @Test
    public void create() {
        CreateHabitDsGateway habitRepository = new DatabaseHabit();
        CreateHabitOutputBoundary outputBoundary = new CreateHabitOutputBoundary() {
            @Override
            public CreateHabitOutputData prepareSuccessView(CreateHabitOutputData outputData) {
                assertEquals("Read a Book", outputData.getHabit().getName());
                assertEquals("Daily", outputData.getHabit().getType());
                assertEquals(0, outputData.getHabit().getFrequency());
                return null;
            }

            @Override
            public CreateHabitOutputData prepareFailView(String error) {
                fail("Habit Creation Failed. Please enter valid information.");
                return null;
            }
        };
        HabitFactory habitFactory = new HabitFactory();

        CreateHabitInputBoundary createInteractor = new CreateHabit(outputBoundary, habitFactory);

        CreateHabitInputData inputData = new CreateHabitInputData("Read a Book", "Daily");

        createInteractor.create(inputData);
    }

    /**
     * Test DeleteHabit use case.
     */
    @Test
    public void delete(){
        // Set example habit object.
        Habit example = new Habit("Read a Book", "Daily");
        String id = example.getName();

        DeleteHabitDsGateway habitRepository = new DatabaseHabit();
        DeleteHabitOutputBoundary outputBoundary = new DeleteHabitOutputBoundary() {
            @Override
            public DeleteHabitOutputData prepareSuccessView(DeleteHabitOutputData outputData) {
                assertEquals("Habit example is successfully deleted.", outputData.getMessage());
                return null;
            }
        };
        HabitFactory habitFactory = new HabitFactory();
        //DeleteHabitInputBoundary deleteInteractor = new DeleteHabit(outputBoundary, habitRepository, habitFactory);
        DeleteHabitInputData inputData = new DeleteHabitInputData(id);
        //deleteInteractor.delete(inputData);
    }

    /**
     * Test EditTask use case.
     */
    @Test
    public void edit(){
        // Set example habit object.
        Habit example = new Habit("Read a Book", "Daily");
        String id = example.getName();

        String newName = "Read a Philosophy Book";

        EditHabitDsGateway habitRepository = new DatabaseHabit();
        EditHabitOutputBoundary outputBoundary = new EditHabitOutputBoundary() {
            @Override
            public EditHabitOutputData prepareSuccessView(EditHabitOutputData outputData) {
                assertEquals("Read a Philosophy Book", outputData.getHabitName());
                assertEquals("Daily", outputData.getHabitType());
                return null;
            }

            @Override
            public EditHabitOutputData prepareFailView(EditHabitOutputData outputData) {
                assertEquals("Changes not saved. Please fill all required fields.", outputData.getHabitName(),
                        "Read a book");
                return null;
            }
        };
        HabitFactory habitFactory = new HabitFactory();

        EditHabitInputBoundary editInteractor = new EditHabit(outputBoundary, habitRepository,habitFactory);
        EditHabitInputData inputData = new EditHabitInputData("Read a Book", newName, "Daily");
        editInteractor.edit(inputData);

    }

    @Test
    public void track(){
        // Set example habit object.
        Habit example = new Habit("Read a Book", "Daily");
        String id = example.getName();

        TrackHabitDsGateway habitRepository = new DatabaseHabit();
        TrackHabitOutputBoundary outputBoundary = new TrackHabitOutputBoundary() {
            @Override
            public TrackHabitOutputData prepareSuccessView(TrackHabitOutputData outputData) {
                assertEquals("The frequency has been increased.", outputData.getHabitFrequency(), 1);
                return null;
            }

            @Override
            public TrackHabitOutputData prepareFailView(TrackHabitOutputData outputData) {
                assertEquals("The frequency was not increased.",outputData.getHabitFrequency(), 0);
                return null;
            }
        };
        HabitFactory habitFactory = new HabitFactory();

        TrackHabitInputBoundary trackInteractor = new TrackHabit(outputBoundary, habitRepository, habitFactory);
        TrackHabitInputData inputData = new TrackHabitInputData("Read a Book");
        trackInteractor.track(inputData);

    }
}
