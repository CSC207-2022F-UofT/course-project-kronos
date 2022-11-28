package controllers.task;

import use_cases.categories.delete_category.DeleteCategoryOutputData;
import use_cases.tasks.delete_task.DeleteTaskOutputBoundary;
import use_cases.tasks.delete_task.DeleteTaskOutputData;

public class DeleteTaskResponseFormatter implements DeleteTaskOutputBoundary {


    @Override
    public DeleteTaskOutputData prepareSuccessView(DeleteTaskOutputData outputData) {
        return outputData;
    }
}
