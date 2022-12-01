package use_cases.tasks.create_task;

/**
 * -- Application Business Layer --
 * This is an interface that passes the inputData to the interactor of task creation.
 */

public interface CreateTaskInputBoundary {
    /**
     * Create a new task based on input data.
     * @param inputData - input data including the name and deadline of the task.
     */
    CreateTaskOutputData create(CreateTaskInputData inputData);
}
