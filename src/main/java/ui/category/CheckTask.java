package ui.category;

import controllers.category.CategoryCreationFailed;
import controllers.tasks.MarkCompletionController;
import entities.Task;
import entities.TaskFactory;
import use_cases.categories.create_category.CreateCategoryOutputData;
import use_cases.tasks.mark_task_completion.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;

public class CheckTask extends AbstractAction{
    private HashMap<TaskFactory, Integer> completedTasks;
    private int id;

   /* public CheckTask(MarkCompletionController controller, int id) {
        this.markCompletionController = controller;
        this.id = id;
    }*/
    public CheckTask(MarkCompletionDsGateway markTaskGateway, MarkCompletionOutputBound markOutputBound, HashMap<TaskFactory, Integer> completedTasks) {
        this.completedTasks = completedTasks;

        for (TaskFactory taskfactory: completedTasks.keySet()) {
            // call on markCompletion controller for each task, need category reference to get TaskCollection
            Integer taskId = completedTasks.get(taskfactory);
            try {
                MarkCompletionInputBound markCompletionInputBound = new MarkCompletion(markOutputBound, markTaskGateway, taskfactory);
                MarkCompletionController markCompletionController = new MarkCompletionController(markCompletionInputBound);
                markCompletionController.mark(taskId);
            } catch (CategoryCreationFailed error){
                System.out.println("ERROR");
            }

            }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBox log = (JCheckBox) e.getSource();
        if (log.isSelected()) {
            // call completion task controller
            // MarkCompletionOutputData outputData = MarkCompletionController.mark(this.id);
        }
    }

}
