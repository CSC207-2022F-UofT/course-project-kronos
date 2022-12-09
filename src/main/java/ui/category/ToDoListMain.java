package ui.category;

import controllers.category.*;
import controllers.tasks.CreateTaskPresenter;
import controllers.tasks.MarkCompletionPresenter;
import database.DatabaseCategory;
import database.DatabaseTask;
import database.DatabaseUser;
import entities.*;
import use_cases.categories.create_category.*;
import use_cases.categories.delete_category.DeleteCategory;
import use_cases.categories.delete_category.DeleteCategoryDsGateway;
import use_cases.categories.delete_category.DeleteCategoryInputBoundary;
import use_cases.categories.delete_category.DeleteCategoryOutputBoundary;
import use_cases.categories.edit_category.EditCategory;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryInputBoundary;
import use_cases.categories.edit_category.EditCategoryOutputBoundary;
import use_cases.tasks.create_task.*;
import use_cases.tasks.mark_task_completion.MarkCompletionDsGateway;
import use_cases.tasks.mark_task_completion.MarkCompletionOutputBound;

/**
 * -- UI --
 * Responsible for creating all the controllers, input data, output data, presenters, and gateways for
 * different use cases relating to Category and Task
 */
public class ToDoListMain {
    public static CategoryCollection categories = new CategoryCollection();
    public static TaskCollection tasks1 = new TaskCollection();
    public static TaskCollection tasks2 = new TaskCollection();
    public static Task task1 = new Task("task 1");
    public static Task task2 = new Task("new task name");
    public static Task task3 = new Task("task 3");
    public static Category category1 = new Category("Category 1", "green");
    public static Category category2 = new Category("Category 2", "blue");
    public static Category category3 = new Category("Category 3", "pink");
    public static void main(String[] args){
        tasks1.addItem(task1);
        tasks1.addItem(task2);
        tasks2.addItem(task3);
        category1.addTask(task1);
        category1.addTask(task2);
        category3.addTask(task3);
        categories.addItem(category1);
        categories.addItem(category2);
        categories.addItem(category3);

        DatabaseUser database = new DatabaseUser("C:/Users/emily/OneDrive/Documents/UofT/2022 - 2023/CSC207/Project/dataCopy.ser");

        /*
         * Create Category Use Case
         */
        CreateCategoryOutputBoundary createCategoryPresenter = new CreateCategoryPresenter();
        CreateCategoryDsGateway dsGateway = new DatabaseCategory(database);
        CreateCategoryInputBoundary createCategory = new CreateCategory(createCategoryPresenter, dsGateway, categories);
        CreateCategoryController createCategoryController = new CreateCategoryController(createCategory);

        /*
         * Edit Category Use Case
         */
        EditCategoryOutputBoundary editCategoryPresenter = new EditCategoryPresenter();
        EditCategoryDsGateway editDsGateway = new DatabaseCategory(database);

        /*
         * Delete Category Use Case
         */
        DeleteCategoryOutputBoundary deleteCategoryPresenter = new DeleteCategoryPresenter();
        DeleteCategoryDsGateway deleteDsGateway = new DatabaseCategory(database);
        DeleteCategoryInputBoundary deleteCategory = new DeleteCategory(deleteCategoryPresenter, deleteDsGateway, categories);
        DeleteCategoryController deleteCategoryController = new DeleteCategoryController(deleteCategory);

        // testing the CategoryScreen
        EditCategoryInputBoundary inputBound = new EditCategory(editCategoryPresenter, editDsGateway, categories, category3.getId());

        /*
         * Create Task Use Case
         */
        CreateTaskOutputBoundary outputBoundary = new CreateTaskPresenter();
        CreateTaskDsGateway taskDsGateway = new DatabaseTask(database);

        /*
         * Mark Completion Task Use Case
         */
        MarkCompletionDsGateway markTaskGateway = new DatabaseTask(database);
        MarkCompletionOutputBound markOutputBound = new MarkCompletionPresenter();

        /*
         * Calling the ToDoScreen and passing in necessary arguments
         */
        new ToDoScreen(categories, createCategoryController, editCategoryPresenter, editDsGateway,
                deleteCategoryController, outputBoundary, taskDsGateway, markTaskGateway, markOutputBound);
    }
}
