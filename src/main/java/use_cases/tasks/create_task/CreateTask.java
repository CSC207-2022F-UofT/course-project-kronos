package use_cases.tasks.create_task;

import entities.Task;
import entities.TaskFactory;

/**
 * The Interactor that is responsible for creating a new task.
 */
public class CreateTask implements CreateTaskInputBoundary {

    private final CreateTaskOutputBoundary outputBoundary;
    private final TaskFactory taskFactory;

    public CreateTask(CreateTaskOutputBoundary outputBoundary, TaskFactory taskfactory) {
        this.outputBoundary = outputBoundary;
        this.taskFactory = taskfactory;
    }

    /**
     * Create a new task based on input data.
     * @param inputData - the input data which may contain the name and deadline of a task.
     */
    @Override
    public void create(CreateTaskInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getName().isBlank()){
            CreateTaskOutputData outputData = new CreateTaskOutputData("Task Creation Failed. " +
                    "Please enter the name of the task.");
            // How can we know which failView should be prepared? To-do or Calendar?
            outputBoundary.prepareTodoFailView(outputData);
            outputBoundary.prepareCalendarFailView(outputData);
            // The above 2 lines will be refactored by extracting method and pulling up field after the above question
            // is solved.
        } else if (inputData.getDeadline().isLenient()) {
            CreateTaskOutputData outputData = new CreateTaskOutputData("Task Creation Failed. " +
                    "Please enter a valid deadline");
            // How can we know which failView should be prepared? To-do or Calendar?
            outputBoundary.prepareTodoFailView(outputData);
            outputBoundary.prepareCalendarFailView(outputData);
            // The above 2 lines will be refactored by extracting method and pulling up field after the above question
            // is solved.
        }

        Task task = new Task(inputData.getName(), inputData.getDeadline());
        // The new Task object above is not assigned to any category.
        // So we do not need to update the Category/CategoryFactory.
        taskFactory.addItem(task);
        CreateTaskOutputData outputData = new CreateTaskOutputData(task);
        // How can we know which successView should be prepared? To-do or Calendar?
        outputBoundary.prepareCalendarSuccessView(outputData);
        outputBoundary.prepareTodoSuccessView(outputData);
        // The above 2 lines will be refactored by extracting method and pulling up field after the above question is
        // solved.
    }

    public CreateTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public TaskFactory getTaskFactory() {
        return taskFactory;
    }
}
