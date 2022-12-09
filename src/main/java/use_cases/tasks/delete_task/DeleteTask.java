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
        return outputBoundary.prepareSuccessView(outputData);
    }

    /**
     * @return the output boundary of the use case.
     */
    public DeleteTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }


    /**
     * @return the data gateway of the use case.
     */
    public DeleteTaskDsGateway getDsGateway() {
        return dsGateway;
    }
}
