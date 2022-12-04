package ui.category;

import controllers.category.*;
import database.DatabaseCategory;
import entities.*;
import use_cases.categories.create_category.*;
import use_cases.categories.delete_category.DeleteCategory;
import use_cases.categories.delete_category.DeleteCategoryDsGateway;
import use_cases.categories.delete_category.DeleteCategoryInputBound;
import use_cases.categories.delete_category.DeleteCategoryOutputBoundary;
import use_cases.categories.edit_category.EditCategoryDsGateway;
import use_cases.categories.edit_category.EditCategoryOutputBoundary;

import java.util.Calendar;

public class Main {
    public static String first = "Bob";
    public static String last = "Smith";
    public static String email = "example@gmail.com";
    public static String password = "password";
    public static HabitFactory habits = new HabitFactory();
    public static CategoryCollection categories = new CategoryCollection();
    public static TaskFactory tasks = new TaskFactory();
    public static Calendar deadline1 = Calendar.getInstance();
    public static Calendar deadline2 = Calendar.getInstance();
    public static Task task1 = new Task("task 1", deadline1);
    public static Task task2 = new Task("task 1", deadline2);
    public static Category category1 = new Category("Category 1", "Red");
    public static Category category2 = new Category("Category 2", "Blue");
    public static TimerTomato timer = new TimerTomato();

    public static void main(String[] args){
        task1.setTaskCategory("Category 1");
        task2.setTaskCategory("Category 1");
        tasks.addItem(task1);
        tasks.addItem(task2);
        category1.addTask(task1);
        category1.addTask(task2);
        categories.addItem(category1);
        categories.addItem(category2);


        // Create Category Use Case
        CreateCategoryOutputBound createCategoryPresenter = new CreateCategoryPresenter();
        CreateCategoryDsGateway dsGateway = new DatabaseCategory();
        CreateCategoryInputBound createCategory = new CreateCategory(createCategoryPresenter, dsGateway, categories);
        CreateCategoryController createCategoryController = new CreateCategoryController(createCategory);

        // Edit Category Use Case
        EditCategoryOutputBoundary editCategoryPresenter = new EditCategoryPresenter();
        EditCategoryDsGateway editDsGateway = new DatabaseCategory();

        // Delete Category Use Case
        DeleteCategoryOutputBoundary deleteCategoryPresenter = new DeleteCategoryPresenter();
        DeleteCategoryDsGateway deleteDsGateway = new DatabaseCategory();
        DeleteCategoryInputBound deleteCategory = new DeleteCategory(deleteCategoryPresenter, deleteDsGateway, categories);
        DeleteCategoryController deleteCategoryController = new DeleteCategoryController(deleteCategory);

        new ToDoScreen(categories, createCategoryController, editCategoryPresenter, editDsGateway, deleteCategoryController);
    }
}
