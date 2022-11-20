package use_cases.tasks.mark_task_completion;

import entities.Task;

import static java.lang.Boolean.FALSE;

/**
 * The Interactor that is responsible for creating a new task.
 */
public class MarkCompletion implements MarkCompletionInputBound {
    private final MarkCompletionOutputBound outputBound;

    public MarkCompletion(MarkCompletionOutputBound outputBound) {
        this.outputBound = outputBound;
    }

    /**
     * Mark the completionStatus of a task. If the task's completionStatus is currently "completed", then the status
     * will be changed to "incomplete". On the other hand, if the task's completionStatus is currently "incomplete",
     * then the status will be changed to "completed".
     * @param inputData - the input data which contain a task.
     */
    @Override
    public void mark(MarkCompletionInputData inputData) {
        boolean complete = inputData.getTask().isCompleteStatus();
        Task task = inputData.getTask();
        // if complete is TRUE
        if (complete){
            task.markAsIncomplete(); // the completionStatus of task is marked as incomplete (FALSE)
           prepareOutput(task);
        }else{//complete is FALSE
            task.markAsComplete(); // the completionStatus of the task is marked as complete (TRUE)
            // When a task is marked as completed, it becomes invisible.
            task.setVisibility(FALSE);
            prepareOutput(task);
        }
    }

    /**
     * An extracted method to solve code smell. This method prepares the output data and executes prepare view calls.
     * @param task - the output task after marking.
     */
    public void prepareOutput(Task task){
        MarkCompletionOutputData outputData = new MarkCompletionOutputData(task);
        // How can we know which successView should be prepared? To-do or Calendar?
        outputBound.prepareCalendarSuccessView(outputData);
        outputBound.prepareTodoSuccessView(outputData);

    }

}
