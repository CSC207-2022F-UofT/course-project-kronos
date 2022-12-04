package use_cases.tasks.edit_task;

import entities.Task;
import entities.TaskFactory;

/**
 * Edit properties of a task. Properties include: name, category,and deadline.
 */
public class EditTask implements EditTaskInputBoundary {
    private final EditTaskOutputBoundary outputBoundary;
    private final EditTaskDsGateway dsGateway;
    private final TaskFactory taskFactory;

    public EditTask(EditTaskOutputBoundary outputBoundary, EditTaskDsGateway dsGateway, TaskFactory taskFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.taskFactory = taskFactory;
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
        if (inputData.getInputName().isBlank() || inputData.getInputDeadline().isLenient()){
            EditTaskOutputData outputData = new EditTaskOutputData("Changes not saved. " +
                    "Please fill all required fields.");
            // return outputBoundary.prepareFailView(outputData);
        }
        int id = inputData.getTaskId();
        Task taskBeEdited = taskFactory.getTasks().get(id);
        taskBeEdited.setName(inputData.getInputName());
        taskBeEdited.setDeadline(inputData.getInputDeadline());
        taskBeEdited.setTaskCategory(inputData.getInputCategory());
        EditTaskOutputData outputData = new EditTaskOutputData(
                "Changes have been saved.",
                id,
                taskBeEdited.getName(),
                taskBeEdited.getDeadline());
         return outputBoundary.prepareSuccessView(outputData);

    }

    public EditTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public EditTaskDsGateway getDsGateway() {
        return dsGateway;
    }

    public TaskFactory getTaskFactory() {
        return taskFactory;
    }
}
