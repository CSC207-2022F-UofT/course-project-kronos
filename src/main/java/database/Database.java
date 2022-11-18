package database;

import entities.User;

import java.io.*;

//import org.json.simple.JSONValue;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.util.HashMap;

public class Database {
    private HashMap collections;

    public Database(String filepath) throws FileNotFoundException {
        
    }

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

    public JSONObject getCollections(){return this.collections;}

    private static void addUser(User person){
        // add user to database
        JSONObject obj = new JSONObject();

    }

    private static void removeUser(String userName){
        //
    }

    private static void updateUser(String person){
        // update the user in the database
    }
}
