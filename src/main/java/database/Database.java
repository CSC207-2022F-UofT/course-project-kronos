package database;

import entities.User;

import java.io.*;

import java.util.HashMap;

public class Database {
    private HashMap collections;
    private String currUserEmail;

    private String fileName;
    public static void main(){

    }
    public Database(String filepath) {
        this.fileName = filepath;
        try {
            FileInputStream file = new FileInputStream(filepath);
            ObjectInputStream in = new ObjectInputStream(file);


            HashMap object1 = (HashMap) in.readObject();
            this.collections = object1;
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private void writeUser(User user, String filePath) {
        this.collections.replace(this.currUserEmail, user);
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    (filePath);
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(this.collections);

            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void addUser(User user){

        }



    private HashMap getCollections(){return this.collections;}


    public void removeUser(String userName){
        this.collections.remove(userName);
    }

    public boolean checkEmailExists(String email){
        return this.collections.containsKey(email);
    }

    private User getUser(String email){
        return (User)this.collections.get(email);
    }
    public HashMap manageLogin(String email, String password){
        if (this.collections.get(email).get(password).equals(password))
    }

    private static void updateUser(String person){
        // update the user in the database
    }
}

//import org.json.simple.JSONValue;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//    public Database(String filepath) throws FileNotFoundException {
//        JSONParser parser = new JSONParser();
//
//        try (Reader reader = new FileReader(filepath)) {
//
//            JSONObject jsonObject = (JSONObject) parser.parse(reader);
//
//            this.collections = jsonObject;
//        } catch (IOException e) {
//            System.out.println(e);
//        } catch (ParseException e) {
//            System.out.println(e);
//        }
//    }