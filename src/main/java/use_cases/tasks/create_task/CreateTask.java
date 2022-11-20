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
    public CreateTaskOutputData create(CreateTaskInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getName().isBlank()){
            CreateTaskOutputData outputData = new CreateTaskOutputData("Task Creation Failed. " +
                    "Please enter the name of the task.");
            return outputBoundary.prepareFailView(outputData);
        } else if (inputData.getDeadline().isLenient()) {
            CreateTaskOutputData outputData = new CreateTaskOutputData("Task Creation Failed. " +
                    "Please enter a valid deadline");
            return outputBoundary.prepareFailView(outputData);
        }

        Task task = new Task(inputData.getName(), inputData.getDeadline());
        // The new Task object above is not assigned to any category.
        // So we do not need to update the Category/CategoryFactory.
        taskFactory.addItem(task);
        CreateTaskOutputData outputData = new CreateTaskOutputData(task);
        return outputBoundary.prepareSuccessView(outputData);
    }

    public CreateTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public TaskFactory getTaskFactory() {
        return taskFactory;
    }
}
