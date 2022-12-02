package database;

import entities.User;

import java.io.*;

import java.util.HashMap;

public class Database {

    protected HashMap<String, User> userCollection;
    public String filePath;

    public User currUser;

    public Database(String filepath){
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
}

