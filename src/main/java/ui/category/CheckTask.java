package ui.category;

import controllers.category.CategoryCreationFailed;
import controllers.tasks.MarkCompletionController;
import entities.TaskCollection;
import use_cases.tasks.mark_task_completion.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;

/**
 * -- UI --
 * Responsible for saving the task as checked off by invoking MarkCompletionTask controller
 */
public class CheckTask extends AbstractAction{

    /** Constructor
     * @param markTaskGateway - the gateway for Mark Task Complete
     * @param markOutputBound - the output boundary for Mark Task Complete
     * @param completedTasks - a HashMap where each key is the Task Collection that the completed task belongs to and
     *                       the value as the id of the completed task
    */
    public CheckTask(MarkCompletionDsGateway markTaskGateway, MarkCompletionOutputBound markOutputBound, HashMap<TaskCollection, Integer> completedTasks) {
        for (TaskCollection taskCollection: completedTasks.keySet()) {
            // call on markCompletion controller for each task, need category reference to get TaskCollection
            Integer taskId = completedTasks.get(taskCollection);
            try {
                MarkCompletionInputBound markCompletionInputBound = new MarkCompletion(markOutputBound, markTaskGateway, taskCollection);
                MarkCompletionController markCompletionController = new MarkCompletionController(markCompletionInputBound);
                markCompletionController.mark(taskId);
            } catch (CategoryCreationFailed error){
                System.out.println("ERROR");
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) { }
}
