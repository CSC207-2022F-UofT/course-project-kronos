package test_use_cases;

import database.DatabaseTimer;
import database.DatabaseUser;
import org.junit.Test;
import use_cases.timer.create_single_timer.CreateWorkTimerDsGateway;
import use_cases.timer.create_single_timer.CreateWorkTimerInputData;
import use_cases.timer.create_single_timer.CreateWorkTimerInteractor;
import use_cases.timer.create_single_timer.CreateWorkTimerOutputData;
import use_cases.timer.edit_timer.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class TestTimerUseCases {

    /**
     * Test Create Single TImer use cases.
     */

    @Test
    public void create() {
        final int[] second = {0};
        final int[] minute = {0};
        Timer timer3 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // What happen set the timer

                second[0]++;

                if(second[0] ==60){
                    second[0] = 0;
                    minute[0]++;
                }
            }
        });
        CreateWorkTimerOutputData  outputBoundary = new CreateWorkTimerOutputData(timer3) {
            @Override
            public CreateWorkTimerOutputData prepareSuccessView(CreateWorkTimerOutputData outputData){
                assertEquals(timer3, outputData.getWorkTimer());
                return null;
            }

            public CreateWorkTimerOutputData prepareFailView(CreateWorkTimerOutputData outputData) {
                assertNull(outputData.getWorkTimer());
                return null;
            }

        };
        DatabaseUser databaseUser = new DatabaseUser("test.json");
        CreateWorkTimerDsGateway databaseTimer = new DatabaseTimer(databaseUser);

        CreateWorkTimerInputData inputBoundary = new CreateWorkTimerInteractor(databaseTimer);

        CreateWorkTimerInputData inputData = new CreateWorkTimerInputData(databaseTimer);

        CreateWorkTimerOutputData outputData = inputBoundary.create(inputData);
        outputBoundary.prepareSuccessView(outputData);

    }

    @Test
    public void edit(){
        final int[] second = {0};
        final int[] minute = {0};
        Timer timer1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // What happen set the timer

                second[0]++;

                if(second[0] ==60){
                    second[0] = 0;
                    minute[0]++;
                }
            }
        });
        EditTimerOutputBoundary outputBoundary = new EditTimerOutputBoundary() {
            @Override
            public EditTimerOutputData prepareSuccessView(EditTimerOutputData outputData) {
                assertEquals(timer1, outputData.getTimer());
                return null;
            }

            @Override
            public EditTimerOutputData prepareFailView(EditTimerOutputData outputData) {
                assertNull(outputData.getTimer());
                return null;
            }
        };
        DatabaseUser databaseUser = new DatabaseUser("test.json");

        EditTimerDsGateway databaseTimer = new DatabaseTimer(databaseUser);
        DatabaseTimer databaseTimer1 = new DatabaseTimer(databaseUser);

        EditTimerInputBoundary inputBoundary = new EditTimerInteractor(databaseTimer1, databaseTimer);
        EditTimerInputData inputData = new EditTimerInputData(25,5);
        EditTimerOutputData outputData = inputBoundary.edit(inputData);
        outputBoundary.prepareSuccessView(outputData);
    }
}
