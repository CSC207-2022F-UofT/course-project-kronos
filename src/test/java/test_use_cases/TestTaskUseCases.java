
package test_use_cases;

import database.DatabaseTask;
import database.DatabaseUser;
import entities.Task;
import entities.TaskCollection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import use_cases.tasks.create_task.*;
import use_cases.tasks.delete_task.*;
import use_cases.tasks.edit_task.*;
import use_cases.tasks.mark_task_completion.*;

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
        CreateTaskDsGateway taskRepository = new DatabaseTask(new DatabaseUser("src/test.json"));
        CreateTaskOutputBoundary outputBoundary = new CreateTaskOutputBoundary() {
            @Override
            public CreateTaskOutputData prepareSuccessView(CreateTaskOutputData outputData) {
                assertEquals("example", outputData.getTaskName());
                assertEquals(0, outputData.getTaskId());
                return null;
            }

            @Override
            public CreateTaskOutputData prepareFailView(String error) {
                fail("Task Creation Failed. Please enter valid information.");
                return null;
            }
        };
        TaskCollection taskCollection = new TaskCollection();

        CreateTaskInputBoundary interactor = new CreateTask(outputBoundary, taskRepository, taskCollection);

        CreateTaskInputData inputData = new CreateTaskInputData("example");
        interactor.create(inputData);
    }

    /**
     * Test DeleteTask use case.
     */

    @Test
    public void delete(){
        Task example = new Task("example");
        int id = example.getId();

        DeleteTaskDsGateway taskRepository = new DatabaseTask(new DatabaseUser("src/test.json"));
        DeleteTaskOutputBoundary outputBoundary = new DeleteTaskOutputBoundary() {
            @Override
            public DeleteTaskOutputData prepareSuccessView(DeleteTaskOutputData outputData) {
                assertEquals("Task example is successfully deleted.", outputData.getMessage());
                return null;
            }
        };
        TaskCollection taskCollection = new TaskCollection();

        DeleteTaskInputBoundary deleteInteractor = new DeleteTask(outputBoundary,taskRepository, taskCollection);
        DeleteTaskInputData inputData = new DeleteTaskInputData(id);
        DeleteTaskOutputData outputData = deleteInteractor.delete(inputData);
        outputBoundary.prepareSuccessView(outputData);
    }

    /**
     * Test EditTask use case.
     */

    @Test
    public void edit(){
        Task example = new Task("example");
        int id = example.getId();


        EditTaskDsGateway taskRepository = new DatabaseTask(new DatabaseUser("src/test.json"));
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
        TaskCollection taskCollection = new TaskCollection();

        EditTaskInputBoundary editInteractor = new EditTask(outputBoundary, taskRepository, taskCollection);
        EditTaskInputData inputData = new EditTaskInputData(id, "after");
        editInteractor.edit(inputData);

    }

    /**
     * Test MarkCompletion use case when the completion status of the task is FALSE before marking.
     */

    @Test
    public void markCompletionToTrue(){
        Task example = new Task("example");
        int id = example.getId();

        MarkCompletionDsGateway taskRepository = new DatabaseTask(new DatabaseUser("src/test.json"));
        MarkCompletionOutputBound outputBound = new MarkCompletionOutputBound() {
            @Override
            public MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData) {
                assertTrue(outputData.isCompletionStatus());
                assertEquals("example", outputData.getName());
                assertEquals(id, outputData.getTaskId());
                return null;
            }
        };
        TaskCollection taskFactory = new TaskCollection();
        MarkCompletionInputBound markCompletionInteractor = new MarkCompletion(outputBound, taskRepository, taskFactory);

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

        MarkCompletionDsGateway taskRepository = new DatabaseTask(new DatabaseUser("src/test.json"));
        MarkCompletionOutputBound outputBound = new MarkCompletionOutputBound() {
            @Override
            public MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData) {
                assertFalse(outputData.isCompletionStatus());
                assertEquals("example", outputData.getName());
                assertEquals(id, outputData.getTaskId());
                return null;
            }
        };
        TaskCollection taskFactory = new TaskCollection();
        MarkCompletionInputBound markCompletionInteractor = new MarkCompletion(outputBound, taskRepository, taskFactory);

        MarkCompletionInputData inputData = new MarkCompletionInputData(id);

        markCompletionInteractor.mark(inputData);
    }

}
