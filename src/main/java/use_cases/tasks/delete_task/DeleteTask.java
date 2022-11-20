package use_cases.tasks.delete_task;

import entities.TaskFactory;

/**
 * The Interactor that is responsible for deleting a new task.
 */
public class DeleteTask implements DeleteTaskInputBoundary{
    private final DeleteTaskOutputBoundary outputBoundary;
    private final TaskFactory taskFactory;

    public DeleteTask(DeleteTaskOutputBoundary outputBoundary, TaskFactory taskFactory) {
        this.outputBoundary = outputBoundary;
        this.taskFactory = taskFactory;
    }

    /**
     * Delete an existing task based on input data.
     * @param inputData the input data which contain a task object that will be deleted.
     */
    @Override
    public DeleteTaskOutputData delete(DeleteTaskInputData inputData) {
        String name = inputData.getTask().getName();
        taskFactory.removeItem(inputData.getTask());
        DeleteTaskOutputData outputData = new DeleteTaskOutputData(
                "Task \"" + name + "\" is successfully deleted.", inputData.getTask());
        // How can we know which successView should be prepared? To-do or Calendar?
        return outputBoundary.prepareSuccessView(outputData);
        // The above 2 lines will be refactored by extracting method and pulling up field after the above question is
        // solved.
    }

    public DeleteTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public TaskFactory getTaskFactory() {
        return taskFactory;
    }
}
