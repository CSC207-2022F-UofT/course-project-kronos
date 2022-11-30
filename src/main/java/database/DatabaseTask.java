package database;

import use_cases.tasks.create_task.CreateTaskDsGateway;
import use_cases.tasks.create_task.CreateTaskDsRequestModel;
import use_cases.tasks.delete_task.DeleteTaskDsGateway;
import use_cases.tasks.delete_task.DeleteTaskDsRequestModel;
import use_cases.tasks.edit_task.EditTaskDsGateway;
import use_cases.tasks.edit_task.EditTaskDsRequestModel;
import use_cases.tasks.mark_task_completion.MarkCompletionDsGateway;
import use_cases.tasks.mark_task_completion.MarkCompletionDsRequestModel;
import use_cases.tasks.mark_task_visibility.MarkVisibilityDsGateway;
import use_cases.tasks.mark_task_visibility.MarkVisibilityDsRequestModel;

public class DatabaseTask implements CreateTaskDsGateway, DeleteTaskDsGateway, EditTaskDsGateway, MarkVisibilityDsGateway, MarkCompletionDsGateway {


    /**
     * Saves the data in the request model to the database.
     *
     * @param requestModel - a data structure that contains data about the new task that should be saved in the database.
     */
    @Override
    public void saveTask(CreateTaskDsRequestModel requestModel) {

    }

    @Override
    public void deleteTask(DeleteTaskDsRequestModel requestModel) {

    }

    @Override
    public void saveTask(EditTaskDsRequestModel requestModel) {

    }

    @Override
    public void saveTask(MarkCompletionDsRequestModel requestModel) {

    }

    @Override
    public void saveTask(MarkVisibilityDsRequestModel requestModel) {

    }
}
