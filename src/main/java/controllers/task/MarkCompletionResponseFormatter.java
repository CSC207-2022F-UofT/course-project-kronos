package controllers.task;

import use_cases.tasks.mark_task_completion.MarkCompletionOutputBound;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputData;

public class MarkCompletionResponseFormatter implements MarkCompletionOutputBound {

    @Override
    public MarkCompletionOutputData prepareSuccessView(MarkCompletionOutputData outputData) {
        return outputData;
    }
}
