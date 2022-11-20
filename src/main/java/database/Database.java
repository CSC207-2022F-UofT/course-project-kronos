package database;

import entities.User;
import user_use_cases.UserDataAccessInterface;

import java.io.*;

import java.util.HashMap;

public class Database implements UserDataAccessInterface {

    HashMap<String, User> collections;

    public void Database(String filepath){
        try {
            FileInputStream file = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(file);
            ois.defaultReadObject();
            this.collections = (HashMap<String, User>) ois.readObject();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private void writeUser(User user, String filePath, HashMap collections) {

        collections.replace(user.getEmailAddress(), user);
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    (filePath);
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(collections);

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
        if (emailAddress.equals(collections.get(emailAddress).getPassword())){
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

