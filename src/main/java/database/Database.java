package database;

import entities.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONValue;
import org.json.simple.JSONObject;


public class Database {
    private JSONObject collections;



    public Database(String filepath) {
        try {
            this.collections = (JSONObject) JSONValue
                    .parse(new FileReader(filepath));
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public JSONObject getCollections(){return this.collections;}

    private static void addUser(User person){
        // add user to database

    }

    private static void removeUser(String userName){
        //
    }

    private static void updateUser(String person){
        // update the user in the database
    }
}
