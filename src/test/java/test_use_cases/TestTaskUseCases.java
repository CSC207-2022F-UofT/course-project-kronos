package test_use_cases;

import database.DatabaseTask;
import entities.Task;
import entities.TaskFactory;

import org.junit.After;
import org.junit.Before;

import use_cases.tasks.create_task.*;
import use_cases.tasks.delete_task.*;
import use_cases.tasks.edit_task.*;
import use_cases.tasks.mark_task_completion.*;

import org.junit.Test;

import java.util.Calendar;

import static java.lang.Boolean.FALSE;
import static org.junit.jupiter.api.Assertions.*;

public class TestTaskUseCases {
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
        CreateTaskDsGateway taskRepository = new DatabaseTask();
        CreateTaskOutputBoundary outputBoundary = new CreateTaskOutputBoundary() {
            @Override
            public CreateTaskOutputData prepareSuccessView(CreateTaskOutputData outputData) {
                assertEquals("example", outputData.getTaskName());
                assertEquals(1, outputData.getTaskId());
                return null;
            }

            @Override
            public CreateTaskOutputData prepareFailView(String error) {
                fail("Task Creation Failed. Please enter valid information.");
                return null;
            }
        };
        TaskFactory taskFactory = new TaskFactory();

        CreateTaskInputBoundary interactor = new CreateTask(outputBoundary, taskRepository, taskFactory);

        CreateTaskInputData inputData = new CreateTaskInputData("example");
        interactor.create(inputData);
    }

    /**
     * Test DeleteTask use case.
     */
    @Test
    public void delete(){
        // Set example task object.
        Task example = new Task("example");
        int id = example.getId();

        DeleteTaskDsGateway taskRepository = new DatabaseTask();
        DeleteTaskOutputBoundary outputBoundary = new DeleteTaskOutputBoundary() {
            @Override
            public DeleteTaskOutputData prepareSuccessView(DeleteTaskOutputData outputData) {
                assertEquals(0, outputData.getTaskId());
                assertEquals("Task example is successfully deleted.", outputData.getMessage());
                // assertFalse(taskFactory.existById(id));
                return null;
            }
        };
        TaskFactory taskFactory = new TaskFactory();

        DeleteTaskInputBoundary deleteInteractor = new DeleteTask(outputBoundary,taskRepository, taskFactory);
        DeleteTaskInputData inputData = new DeleteTaskInputData(id);
        deleteInteractor.delete(inputData);
    }

    /**
     * Test EditTask use case.
      */
    @Test
    public void edit(){
        // Set example task object.
        Task example = new Task("example");
        int id = example.getId();


        EditTaskDsGateway taskRepository = new DatabaseTask();
        EditTaskOutputBoundary outputBoundary = new EditTaskOutputBoundary() {
            @Override
            public EditTaskOutputData prepareSuccessView(EditTaskOutputData outputData) {
                assertEquals("after", outputData.getTaskName());
                assertEquals(1, outputData.getTaskId());
                return null;
            }

            @Override
            public EditTaskOutputData prepareFailView(String error) {
                assertEquals("Changes not saved. Please fill all required fields.", error);
                return null;
            }
        };
        TaskFactory taskFactory = new TaskFactory();

        EditTaskInputBoundary editInteractor = new EditTask(outputBoundary, taskRepository,taskFactory);
        EditTaskInputData inputData = new EditTaskInputData(id, "after");
        editInteractor.edit(inputData);

    }

    /**
     * Test MarkCompletion use case when the completion status of the task is FALSE before marking.
     */
    @Test
    public void markCompletionToTrue(){
        // Set example task object.
        Task example = new Task("example");
        int id = example.getId();

        MarkCompletionDsGateway taskRepository = new DatabaseTask();
        MarkCompletionOutputBound outputBound = new MarkCompletionOutputBound() {
            @Override
            public MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData) {
                assertTrue(outputData.isCompletionStatus());
                assertEquals("example", outputData.getName());
                assertEquals(id, outputData.getTaskId());
                return null;
            }
        };
        TaskFactory taskfactory = new TaskFactory();
        MarkCompletionInputBound markCompletionInteractor = new MarkCompletion(outputBound, taskRepository, taskfactory);

        MarkCompletionInputData inputData = new MarkCompletionInputData(id);

        markCompletionInteractor.mark(inputData);
    }

    /**
     * Test MarkCompletion use case when the completion status of the task is TRUE before marking.
     */
    @Test
    public void markCompletionToFalse(){
        // Set example task object.
        Task example = new Task("example");
        example.markAsComplete();
        int id = example.getId();

        MarkCompletionDsGateway taskRepository = new DatabaseTask();
        MarkCompletionOutputBound outputBound = new MarkCompletionOutputBound() {
            @Override
            public MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData) {
                assertFalse(outputData.isCompletionStatus());
                assertEquals("example", outputData.getName());
                assertEquals(id, outputData.getTaskId());
                return null;
            }
        };
        TaskFactory taskfactory = new TaskFactory();
        MarkCompletionInputBound markCompletionInteractor = new MarkCompletion(outputBound, taskRepository, taskfactory);

        MarkCompletionInputData inputData = new MarkCompletionInputData(id);

        markCompletionInteractor.mark(inputData);
    }


}
