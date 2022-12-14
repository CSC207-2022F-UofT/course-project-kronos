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

import java.util.HashMap;

public class DatabaseTask implements CreateTaskDsGateway, EditTaskDsGateway, DeleteTaskDsGateway, MarkCompletionDsGateway {

    private final HashMap<Integer, Task> taskCollection;

    /**
     * Constructor
     * @param database - DatabaseUser object
     */
    public DatabaseTask(DatabaseUser database){
        this.taskCollection = database.getTasks();
    }

    /**
     * Saves the data in the request model to the database.
     *
     * @param requestModel - a data structure that contains data about the new task that should be saved in the database.
     */
    @Override
    public void saveTask(CreateTaskDsRequestModel requestModel) {
        this.taskCollection.put(requestModel.getId(), requestModel.getTask());
    }

    /**
     * Delete the task from database
     * @param requestModel - DsRequest model for task deletion
     */
    @Override
    public void deleteTask(DeleteTaskDsRequestModel requestModel) {
        this.taskCollection.remove(requestModel.getId());
    }


    /**
     * Save the edited task to database
     * @param requestModel - Ds request model for task edition
     */
   @Override
    public void saveTask(EditTaskDsRequestModel requestModel) {
        this.taskCollection.replace(requestModel.getId(), requestModel.getTask());
    }

    /**
     * Update the completion status of task to database
     * @param requestModel - Ds request model for marking task completion
     */
    @Override
    public void saveTask(MarkCompletionDsRequestModel requestModel) {
        Task task = this.taskCollection.get(requestModel.getId());
        if (requestModel.isCompleteStatus()){
            task.markAsComplete();
        } else {
            task.markAsIncomplete();
        }
    }

}