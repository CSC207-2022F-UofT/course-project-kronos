package database;

import entities.User;
import use_cases.user.UserDataAccessInterface;

import java.io.*;

import java.util.HashMap;

public class Database implements UserDataAccessInterface {

    HashMap<String, User> collections;
    String filePath;

    public Database(String filepath){
        this.filePath = filepath;
        try {
            FileInputStream file = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(file);

            this.collections = (HashMap<String, User>) ois.readObject();
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
        return this.collections.containsKey(emailAddress);
    }

    @Override
    public User LoginUser(String emailAddress, String password) {
        // User Login
        if (emailAddress.equals(collections.get(emailAddress).getEmailAddress()) &&
                password.equals(collections.get(emailAddress).getPassword())){
            System.out.println("login successful");
            return collections.get(emailAddress);
        }
        return null;
    }

    @Override
    public void UpdateUser(User user) {
        this.collections.replace(user.getEmailAddress(), user);
    }

    @Override
    public void DeleteUser(String emailAddress) {
        this.collections.remove(emailAddress);
    }

    @Override
    public void AddUser(User user) {
        this.collections.put(user.getEmailAddress(), user);
    }
}

