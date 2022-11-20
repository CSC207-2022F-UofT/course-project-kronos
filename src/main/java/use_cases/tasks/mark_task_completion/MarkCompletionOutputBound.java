package use_cases.tasks.mark_task_completion;

import use_cases.tasks.create_task.CreateTaskOutputData;

public interface MarkCompletionOutputBound {
    // the following codes might be extracted to class afterwards.
    void prepareCalendarSuccessView(MarkCompletionOutputData outputData);
    void prepareTodoSuccessView(MarkCompletionOutputData outputData);
}
