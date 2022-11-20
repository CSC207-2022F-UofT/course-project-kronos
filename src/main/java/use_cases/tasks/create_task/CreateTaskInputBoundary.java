package use_cases.tasks.create_task;

/**
 * This is an interface that passes the inputData to the interactor of task creation.
 */

public interface CreateTaskInputBoundary {
    CreateTaskOutputData create(CreateTaskInputData inputData);
}
