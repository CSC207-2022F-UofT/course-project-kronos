package test_database;


import database.Database;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDatabase{

    @Test
    public void Test1Database{
        Database users = new Database("test.json");

        Assertions.assertEquals((JSONObject)(users.getCollections().get("test@gmail.com")).get("emailAddress"), "test@gmail.com");
    }

}
