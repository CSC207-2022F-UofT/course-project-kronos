package use_cases.tasks.mark_task_visibility;

import entities.Task;
import entities.TaskFactory;

/**
 * -- Application Business Layer --
 * The Interactor that is responsible for marking the visibility of a task.
 */
public class MarkVisibility implements MarkVisibilityInputBound {
    private final MarkVisibilityOutputBound outputBound;
    private final MarkVisibilityDsGateway dsGateway;
    private final TaskFactory taskFactory;

    /**
     * Constructor
     * @param outputBound - the output boundary interface.
     * @param dsGateway - the database gateway interface.
     * @param taskFactory - the task factory of a specific user.
     */
    public MarkVisibility(MarkVisibilityOutputBound outputBound, MarkVisibilityDsGateway dsGateway, TaskFactory taskFactory) {
        this.outputBound = outputBound;
        this.dsGateway = dsGateway;
        this.taskFactory = taskFactory;
    }

    /**
     * Mark the visibility of a task. If the task is currently visible, then it will become invisible. On the
     * other hand, if the task is currently invisible, then it will become visible.
     * @param inputData - the input data which contain a task
     * @return the output data after marking.
     */
    @Override
    public MarkVisibilityOutputData mark(MarkVisibilityInputData inputData) {
        int id = inputData.getTaskId();;
        Task task = taskFactory.getTasks().get(id);
        boolean visibility = task.isVisibility();
        task.setVisibility(!visibility);
        MarkVisibilityOutputData outputData = new MarkVisibilityOutputData(id,task.getName(),
                task.getDeadline(), task.isVisibility());
        return outputBound.prepareSuccessView(outputData);
    }

    /**
     * @return the output boundary of the use case.
     */
    public MarkVisibilityOutputBound getOutputBound() {
        return outputBound;
    }

    /**
     * @return the taskFactory of the use case. (A specific user's task factory)
     */
    public TaskFactory getTaskFactory() {
        return taskFactory;
    }

    /**
     * @return the data gateway of the use case.
     */
    public MarkVisibilityDsGateway getDsGateway() {
        return dsGateway;
    }
}
