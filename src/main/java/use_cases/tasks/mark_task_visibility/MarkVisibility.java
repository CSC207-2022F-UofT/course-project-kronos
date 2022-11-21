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
     * @return the output data after marking.
     */
    @Override
    public MarkVisibilityOutputData mark(MarkVisibilityInputData inputData) {
        boolean visibility = inputData.getTask().isVisibility();
        Task task  = inputData.getTask();
        task.setVisibility(!visibility);
        MarkVisibilityOutputData outputData = new MarkVisibilityOutputData(task);
        return outputBound.prepareSuccessView(outputData);
    }


    public MarkVisibilityOutputBound getOutputBound() {
        return outputBound;
    }


}
