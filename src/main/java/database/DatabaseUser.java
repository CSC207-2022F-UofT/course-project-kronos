/*
package database;

import entities.User;
import use_cases.user.UserDataAccessInterface;

import java.io.*;

import java.util.HashMap;

public class DatabaseUser implements UserDataAccessInterface {

    private HashMap<String, User> userCollection;
    private HashMap taskCollection;
    private HashMap categoryCollection;
    private HashMap habitCollection;
    public String filePath;


    public User currUser;

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

    public static void WriteData(HashMap<String, User> data, String filePath) {
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    (filePath);
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(data);

            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean CheckUserExists(String emailAddress) {
        return this.userCollection.containsKey(emailAddress);
    }

    @Override
    public User LoginUser(String emailAddress, String password) {
        if (emailAddress.equals(userCollection.get(emailAddress).getEmailAddress())){
            this.currUser = userCollection.get(emailAddress);
            return this.currUser;
        }
        return null;
    }

    @Override
    public User GetUser() {
        return this.currUser;
    }

    @Override
    public void UpdateUser(User user) {
        this.userCollection.replace(user.getEmailAddress(), user);

    }

    @Override
    public void DeleteUser(String emailAddress) {
        this.userCollection.remove(emailAddress);
    }

    @Override
    public void AddUser(User user) {
        this.userCollection.put(user.getEmailAddress(), user);
    }
}

*/
