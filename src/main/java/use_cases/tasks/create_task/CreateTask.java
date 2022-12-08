package use_cases.tasks.create_task;

import entities.Task;
import entities.TaskFactory;

/**
 * -- Application Business Layer --
 * The use case Interactor that is responsible for creating a new task.
 */
public class CreateTask implements CreateTaskInputBoundary {

    private final CreateTaskOutputBoundary outputBoundary;

    private final CreateTaskDsGateway dsGateway;
    private final TaskFactory taskFactory;

    /**
     * Constructor
     *
     * @param outputBoundary - the output boundary.
     * @param dsGateway - the database gateway interface.
     * @param taskFactory    - the task factory of a specific user.
     */
    public CreateTask(CreateTaskOutputBoundary outputBoundary, CreateTaskDsGateway dsGateway, TaskFactory taskFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.taskFactory = taskFactory;
    }

    /**
     * Create a new task based on input data.
     * @param inputData - the input data which may contain the name and deadline of a task.
     * @return the output data after creation of new task.
     */
    @Override
    public CreateTaskOutputData create(CreateTaskInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getName().isBlank()){
            String error = "Task Creation Failed. Please enter valid information";
            return outputBoundary.prepareFailView(error);
        }

        Task task = new Task(inputData.getName());
        // The new Task object above is not assigned to any category.
        // So we do not need to update the Category/CategoryFactory.
        taskFactory.addItem(task);
        CreateTaskOutputData outputData = new CreateTaskOutputData(task.getId(), task.getName());
        return outputBoundary.prepareSuccessView(outputData);
    }
    /**
     * @return the output boundary of the use case
     */
    public CreateTaskOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return the taskFactory of the use case. (A specific user's task factory)
     */
    public TaskFactory getTaskFactory() {
        return taskFactory;
    }
}