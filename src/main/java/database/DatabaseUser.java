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

    @SuppressWarnings("unchecked") // When reading the file, the file stored is always going to be a HashMap of Email: User
    public DatabaseUser(String filepath){
        this.filePath = filepath;

        // by default all other parameters are set to null

        try {
            FileInputStream file = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(file);

            this.userCollection = (HashMap<String, User>) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

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

    @Override
    public boolean userExistsByEmail(String email) {
        return userCollection.containsKey(email);
    }

    @Override
    public void save(CreateUserDsRequestModel requestModel) {
        this.userCollection.put(requestModel.getEmailaddress(), requestModel.getUser());
    }

    @Override
    public void removeUser(DeleteUserDsRequestModel requestModel) {
        this.userCollection.remove(requestModel.getEmail());
    }

    @Override
    public void loginUser(LoginUserDsRequestModel requestModel) {
        if (userCollection.get(requestModel.getEmailAddress()).getPassword().equals(requestModel.getPassword())){
            this.currUser = userCollection.get(requestModel.getEmailAddress());
        }
    }

    @Override
    public User getUser() {
        return this.currUser;
    }
    public HashMap<Integer, Category> getCategories() {
        return categoryCollection;
    }

    public HashMap<Integer, Task> getTasks(){
        return  taskCollection;
    }

    public HashMap<String, Habit> getHabits() {
        return habitCollection;
    }
}

