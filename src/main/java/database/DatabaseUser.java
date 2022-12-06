package database;

import entities.*;
import use_cases.user.create_user.CreateUserDsGateway;
import use_cases.user.create_user.CreateUserDsRequestModel;
import use_cases.user.delete_user.DeleteUserDsGateway;
import use_cases.user.delete_user.DeleteUserDsRequestModel;
import use_cases.user.login_user.LoginUserDsGateway;
import use_cases.user.login_user.LoginUserDsRequestModel;

import java.io.*;

import java.util.HashMap;

public class DatabaseUser implements CreateUserDsGateway, DeleteUserDsGateway, LoginUserDsGateway {

    private HashMap<String, User> userCollection;
    private HashMap<Integer, Task> taskCollection;
    private HashMap<Integer, Category> categoryCollection;
    private HashMap<String, Habit> habitCollection;
    public String filePath;


    public User currUser;

    /**
     * Constructor for DatabaseUser
     * @param filepath - path of .ser file where all the user data is stored
     */
    @SuppressWarnings("unchecked") // When reading the file, the file stored is always going to be a HashMap of Email: User
    public DatabaseUser(String filepath){

        this.filePath = filepath;

        // by default all other parameters are set to null, they are only assigned values after reading stored data, and loggin in
        this.taskCollection = null;
        this.categoryCollection = null;
        this.habitCollection = null;

        try {
            FileInputStream file = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(file);

            this.userCollection = (HashMap<String, User>) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * - Used to store the data modified in all collections under Database object into the .ser file, at the filepath
     * - Intended to be called at the end of one session with the app. All changes to user data will get updated to
     * .ser file to ensure effective data persistence, and correct data on next use.
     */
    public void storeData() {
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    (this.filePath);
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(this.userCollection);

            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param email - email of user used to register
     * @return if email exists in the userCollection HashMap
     */
    @Override
    public boolean userExistsByEmail(String email) {
        return userCollection.containsKey(email);
    }

    /**
     * Used to save the created user to the database
     * @param requestModel - contains user information
     */
    @Override
    public void save(CreateUserDsRequestModel requestModel) {
        this.userCollection.put(requestModel.getEmailAddress(), requestModel.getUser());
    }

    /**
     * Used to remove the selected user from database
     * @param requestModel - contains user information
     */
    @Override
    public void removeUser(DeleteUserDsRequestModel requestModel) {
        this.userCollection.remove(requestModel.getEmail());
    }

    /**
     * Used to login User, and obtain information
     * @param requestModel - Ds Request Model used ot provide information to database for login use case
     */
    @Override
    public void loginUser(LoginUserDsRequestModel requestModel) {
        if (userCollection.get(requestModel.getEmailAddress()).getPassword().equals(requestModel.getPassword())){
            this.currUser = userCollection.get(requestModel.getEmailAddress());
            this.habitCollection = this.currUser.getHabitCollection().getCollection();
            this.taskCollection = this.currUser.getTaskCollection().getTasks();
            this.categoryCollection = this.currUser.getCategoryCollection().categories;
        }
    }

    /**
     * @return current user. If not logged in, return null
     */
    @Override
    public User getLoggedInUser() {
        return this.currUser;
    }

    /**
     * @param email - email of registered user
     * @param password - password of registered user
     * @return if password matches for given email and password
     */
    @Override
    public boolean checkPasswordsMatch(String email, String password) {
        return userCollection.get(email).getPassword().equals(password);
    }

    // getter methods for Category, Task, and Habit Collections.
    public HashMap<Integer, Category> getCategories() {
        return categoryCollection;
    }

    public HashMap<Integer, Task> getTasks(){
        return  taskCollection;
    }

    public HashMap<String, Habit> getHabits() {
        return habitCollection;
    }

    @Override
    public User getUserByEmail(String email){
        return this.userCollection.get(email);
    }
}

