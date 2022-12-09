package test_database;


import entities.*;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestDatabaseReadWrite {

    @Test
    public void TestReadWriteLoginUser(){

        HabitCollection testHabit = new HabitCollection();
        TaskFactory testTask = new TaskFactory();
        CategoryFactory testCat = new CategoryFactory();
        Timer testTimer = new Timer();
        CommonUser user = new CommonUser("test@gmail.com", "test123", "testFirstName", "testLastName", testHabit, testTask, testCat, testTimer);
        HashMap<String, CommonUser> testHashMap = new HashMap();
        testHashMap.put("test@gmail.com", user);
        Database.WriteData(testHashMap, "test.ser");
        Database database = new Database("test.ser");
        String expected = user.getEmailAddress();
        String actual = database.LoginUser("test@gmail.com", "test123").getEmailAddress();
        assertNotEquals(actual, null);
        assertEquals(actual, expected);
    }

}



