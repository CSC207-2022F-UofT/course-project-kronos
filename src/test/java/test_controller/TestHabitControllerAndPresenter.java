package test_controller;

import controllers.habits.*;
import org.junit.Test;
import use_cases.habits.create_habit.CreateHabitOutputData;
import use_cases.habits.edit_habit.EditHabitOutputData;

import static org.junit.Assert.*;

public class TestHabitControllerAndPresenter {
    static CreateHabitController cHController;
    static CreateHabitPresenter cHPresenter;

    static EditHabitController eHController;
    static EditHabitPresenter eHPresenter;


    /**
     * Tests the CreateHabit controller and presenter.
     */
    @Test
    public void create() {

        assertEquals("Read a book", cHController.create("Read a book", "daily").getName());
        CreateHabitOutputData output = new CreateHabitOutputData("Read a book");
        assertEquals( output,cHPresenter.prepareSuccessView(output));
    }

    /**
     * Tests the EditHabit controller and presenter.
     */
    @Test
    public void edit() {

        assertEquals("Read a research paper", eHController.edit("Read a book",
                "Read a research paper","daily").getHabitName());
        EditHabitOutputData output = new EditHabitOutputData("Read a research paper", "daily");
        assertEquals( output, eHPresenter.prepareSuccessView(output));
    }

}
