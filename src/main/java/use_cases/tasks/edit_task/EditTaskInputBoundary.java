package use_cases.tasks.edit_task;

import use_cases.tasks.create_task.CreateTaskInputData;

/**
 * This is an interface that passes the inputData to the interactor of task modification/edition.
 */
public interface EditTaskInputBoundary {
    void edit(EditTaskInputData inputData);
}
