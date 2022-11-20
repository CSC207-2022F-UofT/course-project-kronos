package use_cases.tasks.delete_task;

/**
 * This is an interface that passes the inputData to the interactor of task deletion.
 */

public interface DeleteTaskInputBoundary {
    DeleteTaskOutputData delete(DeleteTaskInputData inputData);
}
