package use_cases.tasks.edit_task;

import entities.Task;

/**
 * Edit properties of a task. Properties include: name, category,and deadline.
 */
public class EditTask implements EditTaskInputBoundary {
    private final EditTaskOutputBoundary outputBoundary;

    public EditTask(EditTaskOutputBoundary outputBoundary) {
        this.outputBoundary = outputBoundary;
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
            return outputBoundary.prepareFailView(outputData);
        }
        Task task = inputData.getTask();
        task.setName(inputData.getInputName());
        task.setDeadline(inputData.getInputDeadline());
        task.setTaskCategory(inputData.getInputCategory());
        EditTaskOutputData outputData = new EditTaskOutputData("Changes have been saved.", task);
         return outputBoundary.prepareSuccessView(outputData);

    }

    public EditTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }
}