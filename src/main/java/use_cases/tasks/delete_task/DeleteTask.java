package use_cases.tasks.delete_task;

import entities.Task;
import entities.TaskCollection;

/**
 * -- Application Business Layer --
 * The Interactor that is responsible for deleting a new task.
 */
public class DeleteTask implements DeleteTaskInputBoundary{
    private final DeleteTaskOutputBoundary outputBoundary;
    private final DeleteTaskDsGateway dsGateway;
    private final TaskCollection taskCollection;

    /**
     * Constructor
     * @param outputBoundary - the output boundary interface.
     * @param dsGateway - the database gateway interface.
     * @param taskCollection - the task factory of a specific user.
     */
    public DeleteTask(DeleteTaskOutputBoundary outputBoundary, DeleteTaskDsGateway dsGateway, TaskCollection taskCollection) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.taskCollection = taskCollection;
    }

    /**
     * Delete an existing task based on input data.
     * @param inputData  - the input data which contain a task object that will be deleted.
     * @return the output data after deletion.
     */
    @Override
    public DeleteTaskOutputData delete(DeleteTaskInputData inputData) {
        int id = inputData.getTaskId();
        Task taskToDelete = taskCollection.getTasks().get(id);
        taskCollection.removeItem(taskToDelete);
        String name = taskToDelete.getName();
        DeleteTaskOutputData outputData = new DeleteTaskOutputData(
                "Task \"" + name + "\" is successfully deleted.");
        // How can we know which successView should be prepared? To-do or Calendar?
        return outputBoundary.prepareSuccessView(outputData);
        // The above 2 lines will be refactored by extracting method and pulling up field after the above question is
        // solved.
    }

    /**
     * @return the output boundary of the use case.
     */
    public DeleteTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return the taskFactory of the use case. (A specific user's task factory)
     */
    public TaskCollection getTaskFactory() {
        return taskCollection;
    }

    /**
     * @return the data gateway of the use case.
     */
    public DeleteTaskDsGateway getDsGateway() {
        return dsGateway;
    }
}
