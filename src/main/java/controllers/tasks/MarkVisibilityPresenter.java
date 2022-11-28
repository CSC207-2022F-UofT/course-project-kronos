package controllers.tasks;

import use_cases.tasks.mark_task_visibility.MarkVisibilityOutputBound;
import use_cases.tasks.mark_task_visibility.MarkVisibilityOutputData;

public class MarkVisibilityPresenter implements MarkVisibilityOutputBound{

    @Override
    public MarkVisibilityOutputData prepareSuccessView(MarkVisibilityOutputData outputData) {
        return outputData;
    }

}
