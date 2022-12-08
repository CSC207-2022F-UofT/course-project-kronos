package use_cases.tasks.mark_task_completion;

import entities.Task;
import entities.TaskFactory;

import static java.lang.Boolean.FALSE;

/**
 * -- Application Business Layer --
 * The Interactor that is responsible for marking the completion status of a task.
 */
public class MarkCompletion implements MarkCompletionInputBound {
    private final MarkCompletionOutputBound outputBound;
    private final MarkCompletionDsGateway dsGateway;
    private final TaskFactory taskFactory;

    /**
     * Constructor
     * @param outputBound - the output boundary interface.
     * @param dsGateway - the database gateway interface.
     * @param taskFactory - the task factory of a specific user.
     */
    public MarkCompletion(MarkCompletionOutputBound outputBound, MarkCompletionDsGateway dsGateway,
                          TaskFactory taskFactory) {
        this.outputBound = outputBound;
        this.dsGateway = dsGateway;
        this.taskFactory = taskFactory;
    }

    /**
     * Mark the completionStatus of a task. If the task's completionStatus is currently "completed", then the status
     * will be changed to "incomplete". On the other hand, if the task's completionStatus is currently "incomplete",
     * then the status will be changed to "completed".
     * @param inputData - the input data which contain a task.
     * @return the output data after marking.
     */
    @Override
    public MarkCompletionOutputData mark(MarkCompletionInputData inputData) {
        int id = inputData.getTaskId();
        Task task = taskFactory.getTasks().get(id);
        boolean complete = task.isCompleteStatus();
        // if complete is TRUE
        if (complete){
            task.markAsIncomplete(); // the completionStatus of task is marked as incomplete (FALSE)
        }else{//complete is FALSE
            task.markAsComplete(); // the completionStatus of the task is marked as complete (TRUE)
        }
        MarkCompletionOutputData outputData = new MarkCompletionOutputData(id, task.getName(),task.isCompleteStatus());
        return outputBound.prepareSuccessView(outputData);
    }

    /**
     * @return the output boundary of the use case.
     */
    public MarkCompletionOutputBound getOutputBound() {
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
    public MarkCompletionDsGateway getDsGateway() {
        return dsGateway;
    }
}
