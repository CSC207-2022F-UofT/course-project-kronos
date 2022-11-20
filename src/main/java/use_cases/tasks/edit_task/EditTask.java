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
     */
    @Override
    public void edit(EditTaskInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getInputName().isBlank() || inputData.getInputDeadline().isLenient()){
            EditTaskOutputData outputData = new EditTaskOutputData("Changes not saved. " +
                    "Please fill all required fields.");
            // How can we know which failView should be prepared? To-do or Calendar?
            outputBoundary.prepareTodoFailView(outputData);
            outputBoundary.prepareCalendarFailView(outputData);
            // The above 2 lines will be refactored by extracting method and pulling up field after the above question
            // is solved.
        }
        Task task = inputData.getTask();
        task.setName(inputData.getInputName());
        task.setDeadline(inputData.getInputDeadline());
        task.setTaskCategory(inputData.getInputCategory());
        EditTaskOutputData outputData = new EditTaskOutputData("Changes have been saved.", task);
        // How can we know which successView should be prepared? To-do or Calendar?
        outputBoundary.prepareCalendarSuccessView(outputData);
        outputBoundary.prepareTodoSuccessView(outputData);
        // The above 2 lines will be refactored by extracting method and pulling up field after the above question is
        // solved.
    }

}
