package use_cases.tasks.mark_task_visibility;

import entities.Task;

/**
 * The Interactor that is responsible for marking the visibility of a task.
 */
public class MarkVisibility implements MarkVisibilityInputBound {
    private final MarkVisibilityOutputBound outputBound;

    public MarkVisibility(MarkVisibilityOutputBound outputBound) {
        this.outputBound = outputBound;
    }

    /**
     * Mark the visibility of a task. If the task is currently visible, then it will become invisible. On the
     * other hand, if the task is currently invisible, then it will become visible.
     * @param inputData - the input data which contain a task
     */
    @Override
    public void mark(MarkVisibilityInputData inputData) {
        boolean visibility = inputData.getTask().isVisibility();
        Task task  = inputData.getTask();
        task.setVisibility(!visibility);
        prepareOutput(task);
    }

    /**
     * An extracted method to solve code smell. This method prepares the output data and executes prepare view calls.
     * @param task - the output task after marking.
     */
    public void prepareOutput(Task task){
        MarkVisibilityOutputData outputData = new MarkVisibilityOutputData(task);
        // How can we know which successView should be prepared? To-do or Calendar?
        outputBound.prepareCalendarSuccessView(outputData);
        outputBound.prepareTodoSuccessView(outputData);

    }

    public MarkVisibilityOutputBound getOutputBound() {
        return outputBound;
    }


}
