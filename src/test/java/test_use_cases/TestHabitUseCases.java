package test_use_cases;
import entities.Habit;
import entities.HabitCollection;
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
     * Test CreateHabit use case.
     */
    @Test
    public void create() {

        CreateHabitDsGateway habitRepository = new CreateHabitDsGateway() {
            @Override
            public void save(CreateHabitDsRequestModel requestModel) {

            }
        };
        CreateHabitOutputBoundary outputBoundary = new CreateHabitOutputBoundary() {
            @Override
            public CreateHabitOutputData prepareSuccessView(CreateHabitOutputData outputData) {
                assertEquals("Read a Book", outputData.getName());
                return null;
            }

            @Override
            public CreateHabitOutputData prepareFailView(String error) {
                fail("Habit Creation Failed. Please enter valid information.");
                return null;
            }
        };
        HabitCollection habitCollection = new HabitCollection();

        CreateHabitInputBoundary createInteractor = new CreateHabit(outputBoundary, habitRepository, habitCollection);

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

        DeleteHabitDsGateway habitRepository = new DeleteHabitDsGateway() {
            @Override
            public void deleteHabit(DeleteHabitDsRequestModel requestModel) {

            }
        };
        DeleteHabitOutputBoundary outputBoundary = new DeleteHabitOutputBoundary() {
            @Override
            public DeleteHabitOutputData prepareSuccessView(DeleteHabitOutputData outputData) {
                assertEquals("Habit example is successfully deleted.", outputData.getMessage());
                return null;
            }
        };
        HabitCollection habitCollection = new HabitCollection();
        DeleteHabitInputBoundary deleteInteractor = new DeleteHabitInputBoundary() {
            @Override
            public DeleteHabitOutputData delete(DeleteHabitInputData inputData) {
                return null;
            }
        };
        DeleteHabitInputData inputData = new DeleteHabitInputData(id);
        deleteInteractor.delete(inputData);
    }

    /**
     * Test EditHabit use case.
     */
    @Test
    public void edit(){
        // Set example habit object.
        Habit example = new Habit("Read a Book", "Daily");
        String id = example.getName();

        String newName = "Read a Philosophy Book";

        EditHabitDsGateway habitRepository = new EditHabitDsGateway() {
            @Override
            public void save(EditHabitDsRequestModel requestModel) {

            }
        };
        EditHabitOutputBoundary outputBoundary = new EditHabitOutputBoundary() {
            @Override
            public EditHabitOutputData prepareSuccessView(EditHabitOutputData outputData) {
                assertEquals("Read a Philosophy Book", outputData.getHabitName());
                assertEquals("Daily", outputData.getHabitType());
                return null;
            }

            @Override
            public EditHabitOutputData prepareFailView(String error) {
                return null;
            }
            
        };
        HabitCollection habitCollection = new HabitCollection();

        EditHabitInputBoundary editInteractor = new EditHabit(outputBoundary, habitRepository, habitCollection);
        EditHabitInputData inputData = new EditHabitInputData("Read a Book", newName, "Daily");
        editInteractor.edit(inputData);

    }

    /**
     * Tests TrackHabit use case.
     */

    @Test
    public void track(){
        // Set example habit object.
        Habit example = new Habit("Read a Book", "Daily");
        String id = example.getName();

        TrackHabitDsGateway habitRepository = new TrackHabitDsGateway() {
            @Override
            public void save(TrackHabitDsRequestModel requestModel) {

            }
        };
        TrackHabitOutputBoundary outputBoundary = new TrackHabitOutputBoundary() {
            @Override
            public TrackHabitOutputData prepareSuccessView(TrackHabitOutputData outputData) {
                assertEquals("The frequency has been increased.", outputData.getHabitFrequency(), 1);
                return null;
            }

            @Override
            public TrackHabitOutputData prepareFailView(String error) {
                return null;

            }
        };
        HabitCollection habitCollection = new HabitCollection();

        TrackHabitInputBoundary trackInteractor = new TrackHabit(outputBoundary, habitRepository, habitCollection);
        TrackHabitInputData inputData = new TrackHabitInputData("Read a Book");
        trackInteractor.track(inputData);

    }
}