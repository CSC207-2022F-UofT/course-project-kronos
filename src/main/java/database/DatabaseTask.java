package database;

import entities.Task;
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

import java.util.HashMap;

public class DatabaseTask implements CreateTaskDsGateway, DeleteTaskDsGateway, EditTaskDsGateway, MarkVisibilityDsGateway, MarkCompletionDsGateway {

    private HashMap taskCollection;

    /**
     * Saves the data in the request model to the database.
     *
     * @param requestModel - a data structure that contains data about the new task that should be saved in the database.
     */
    @Override
    public void saveTask(CreateTaskDsRequestModel requestModel) {
        this.taskCollection.put(requestModel.getId(), requestModel.getTask());
    }

    @Override
    public void deleteTask(DeleteTaskDsRequestModel requestModel) {
        this.taskCollection.remove(requestModel.getId());
    }

    @Override
    public void saveTask(EditTaskDsRequestModel requestModel) {
        this.taskCollection.replace(requestModel.getId(), requestModel.getTask());
    }

    @Override
    public void saveTask(MarkCompletionDsRequestModel requestModel) {
        Task newTask = (Task) this.taskCollection.get(requestModel.getId());
        newTask.setCompleteStatus(requestModel.isCompleteStatus());
    }

    @Override
    public void saveTask(MarkVisibilityDsRequestModel requestModel) {
        Task newTask = (Task) this.taskCollection.get(requestModel.getId());
        newTask.setVisibility(requestModel.getVisibility());
    }
}
