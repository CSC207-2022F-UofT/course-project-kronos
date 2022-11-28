package use_cases.tasks.delete_task;

import entities.Task;
import entities.TaskFactory;

/**
 * The Interactor that is responsible for deleting a new task.
 */
public class DeleteTask implements DeleteTaskInputBoundary{
    private final DeleteTaskOutputBoundary outputBoundary;
    private final DeleteTaskDsGateway dsGateway;
    private final TaskFactory taskFactory;

    public DeleteTask(DeleteTaskOutputBoundary outputBoundary, DeleteTaskDsGateway dsGateway, TaskFactory taskFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.taskFactory = taskFactory;
    }

    /**
     * Delete an existing task based on input data.
     * @param inputData  - the input data which contain a task object that will be deleted.
     * @return the output data after deletion.
     */
    @Override
    public DeleteTaskOutputData delete(DeleteTaskInputData inputData) {
        int id = inputData.getTaskId();
        Task taskToDelete = taskFactory.getTasks().get(id);
        taskFactory.removeItem(taskToDelete);
        String name = taskToDelete.getName();
        DeleteTaskOutputData outputData = new DeleteTaskOutputData(
                "Task \"" + name + "\" is successfully deleted.");
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

    public DeleteTaskDsGateway getDsGateway() {
        return dsGateway;
    }
}
