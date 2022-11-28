package controllers.tasks;

import use_cases.tasks.mark_task_completion.MarkCompletionOutputBound;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputData;

public class MarkCompletionPresenter implements MarkCompletionOutputBound {

    @Override
    public MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData) {
        return outputData;
    }
}
