package use_cases.tasks.edit_task;

import entities.Task;
import entities.TaskCollection;

/**
 * -- Application Business Layer --
 * The Interactor that edits properties of a task. Properties include: name, category,and deadline.
 */
public class EditTask implements EditTaskInputBoundary {
    private final EditTaskOutputBoundary outputBoundary;
    private final EditTaskDsGateway dsGateway;
    private final TaskCollection taskCollection;

    /**
     * Constructor
     * @param outputBoundary - the output boundary interface.
     * @param dsGateway - the database gateway interface.
     * @param taskCollection - the task factory of a specific user.
     */
    public EditTask(EditTaskOutputBoundary outputBoundary, EditTaskDsGateway dsGateway, TaskCollection taskCollection) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.taskCollection = taskCollection;
    }

    /**
     * Edit the properties of a task. The edible properties are name, category, and deadline for a task object.
     * @param inputData - the input data which contain a task, an input name, an input category name, and an input
     *                  deadline.
     * @return the output data after editing.
     */
    @Override
    public EditTaskOutputData edit(EditTaskInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getInputName().isBlank()){
            String error = "Changes not saved. Please fill all required fields.";
            return outputBoundary.prepareFailView(error);
        }
        int id = inputData.getTaskId();
        Task taskBeEdited = taskCollection.getTasks().get(id);
        taskBeEdited.setName(inputData.getInputName());
        EditTaskOutputData outputData = new EditTaskOutputData(
                id,
                taskBeEdited.getName(), taskBeEdited.isCompleteStatus());
         return outputBoundary.prepareSuccessView(outputData);

    }

    /**
     * @return the output boundary of the use case.
     */
    public EditTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return the data gateway of the use case.
     */
    public EditTaskDsGateway getDsGateway() {
        return dsGateway;
    }

    /**
     * @return the taskFactory of the use case. (A specific user's task factory)
     */
    public TaskCollection getTaskFactory() {
        return taskCollection;
    }
}
