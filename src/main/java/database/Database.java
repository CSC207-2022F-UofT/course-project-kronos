package database;

import entities.User;
import user_use_cases.UserDataAccessInterface;

import java.io.*;

import java.util.HashMap;

public class Database implements UserDataAccessInterface {

    private HashMap<String, User> collections;
    public String filePath;

    public User currUser;

    public Database(String filepath){
        this.filePath = filepath;
        this.currUser = null;
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
        if (emailAddress.equals(collections.get(emailAddress).getEmailAddress())){
            this.currUser = collections.get(emailAddress);
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

