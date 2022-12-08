package ui.category;

import controllers.category.*;
import database.DatabaseCategory;
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

import java.util.Calendar;

public class Main {
    public static String first = "Bob";
    public static String last = "Smith";
    public static String email = "example@gmail.com";
    public static String password = "password";
    public static HabitFactory habits = new HabitFactory();
    public static CategoryCollection categories = new CategoryCollection();
    public static TaskFactory tasks1 = new TaskFactory();
    public static TaskFactory tasks2 = new TaskFactory();
    public static Calendar deadline1 = Calendar.getInstance();
    public static Calendar deadline2 = Calendar.getInstance();
    public static Task task1 = new Task("task 1", deadline1);
    public static Task task2 = new Task("task 2", deadline2);
    public static Task task3 = new Task("task 3", deadline2);
    public static Category category1 = new Category("Category 1", "green");
    public static Category category2 = new Category("Category 2", "blue");
    //public static Category category3 = new Category("new name", "red");
    public static Category category3 = new Category("Category 3", "pink");
    public static Category category4 = new Category("Category 4", "orange");
    public static TimerTomato timer = new TimerTomato();

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
        //categories.addItem(category4);

        DatabaseUser database = new DatabaseUser("C:/Users/emily/OneDrive/Documents/UofT/2022 - 2023/CSC207/Project/databaseCategory.txt");

        // Create Category Use Case
        CreateCategoryOutputBoundary createCategoryPresenter = new CreateCategoryPresenter();
        CreateCategoryDsGateway dsGateway = new DatabaseCategory(database);
        CreateCategoryInputBoundary createCategory = new CreateCategory(createCategoryPresenter, dsGateway, categories);
        CreateCategoryController createCategoryController = new CreateCategoryController(createCategory);

        // Edit Category Use Case
        EditCategoryOutputBoundary editCategoryPresenter = new EditCategoryPresenter();
        EditCategoryDsGateway editDsGateway = new DatabaseCategory(database);

        // Delete Category Use Case
        DeleteCategoryOutputBoundary deleteCategoryPresenter = new DeleteCategoryPresenter();
        DeleteCategoryDsGateway deleteDsGateway = new DatabaseCategory(database);
        DeleteCategoryInputBoundary deleteCategory = new DeleteCategory(deleteCategoryPresenter, deleteDsGateway, categories);
        DeleteCategoryController deleteCategoryController = new DeleteCategoryController(deleteCategory);

        //new ToDoScreen(categories, createCategoryController, editCategoryPresenter, editDsGateway, deleteCategoryController);
        new CreateCategoryScreen(createCategoryController);


        // testing the CategoryScreen
        Category editCat = new Category("edit this", "orange");
        categories.addItem(editCat);
        String newName = "new name";
        String newColour = "grey";
        EditCategoryInputBoundary inputBound = new EditCategory(editCategoryPresenter, editDsGateway, categories, category4.getId());
        EditCategoryController editController = new EditCategoryController(inputBound);
        //new CategoryScreen(editController,deleteCategoryController, category4.getId(), category4.getName(), category4.getColour());
        //new CategoryScreen(editController,deleteCategoryController, category3.getId(), category3.getName(), category3.getColour());
    }
}
