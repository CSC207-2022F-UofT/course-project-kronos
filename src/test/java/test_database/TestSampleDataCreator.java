package test_database;

import database.DatabaseUser;
import entities.*;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class TestSampleDataCreator {


    @Test
    public void Test(){
        storeData("data.ser");
        DatabaseUser userInfo = new DatabaseUser("data.ser");
        System.out.println(userInfo.filePath);
    }

    static HashMap<String, User> createSampleData(){
        User user1 = new CommonUser("testEmail1@gmail.com", "password1", "firstName1", "lastName1");
        // creating habit 1
        Habit habit1 = new Habit("Running", "completion");

        Calendar calendar = Calendar.getInstance();
        calendar.set(122, 1, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        HashMap<String, Integer> habitMap = habit1.getFrequencyMap();
        Random rand = new Random();
        // create random data for completion of habit in 2022
        for (int i=0;i <= 365; i++){
            Date date = calendar.getTime();
            String date1 = sdf.format(date);
            habitMap.put(date1, rand.nextInt(2));
            calendar.set(calendar.YEAR + 1, 01, 01);
        }
        // putting habit into habit collection
        user1.getHabitCollection().habitCollection.put(habit1.getName(), habit1);

        Habit habit2 = new Habit("Reading", "completion");
        HashMap<String, Integer> habitMap2 = habit2.getFrequencyMap();

        calendar.set(122, 1, 1);
        // create random data for completion of habit in 2022
        for (int i=0;i <= 365; i++){
            Date date = calendar.getTime();
            String date1 = sdf.format(date);
            habitMap2.put(date1, rand.nextInt(2));
            calendar.set(calendar.YEAR + 1, 01, 01);
        }
        user1.getHabitCollection().habitCollection.put(habit2.getName(), habit2);

        Habit habit3 = new Habit("Meditating", "completion");
        calendar.set(122, 1, 1);
        HashMap<String, Integer> habitMap3 = habit3.getFrequencyMap();
        // create random data for completion of habit in 2022
        for (int i=0;i <= 365; i++){
            Date date = calendar.getTime();
            String date1 = sdf.format(date);
            habitMap3.put(date1, rand.nextInt(2));
            calendar.set(calendar.YEAR + 1, 01, 01);
        }
        user1.getHabitCollection().habitCollection.put(habit3.getName(), habit3);



        // creating 4 tasks
        HashMap<Integer, Task> taskMap = new HashMap<>();


        Task task1 = new Task("Get Paperwork done");
        taskMap.put(task1.getId(), task1);

        Task task2 = new Task("Study for csc207 test");
        taskMap.put(task2.getId(), task2);

        Task task3 = new Task("Submit csc207 project");
        taskMap.put(task3.getId(), task3);

        Task task4 = new Task("Final Exam");
        taskMap.put(task4.getId(), task4);



        // creating 2 categories for tasks
        HashMap<Integer, Category> categoryMap = new HashMap<>();

        Category cat1 = new Category("School", "red");
        Category cat2 = new Category("Work", "pink");

        cat2.addTask(task1);
        cat1.addTask(task2);
        cat1.addTask(task3);
        cat1.addTask(task4);

        user1.getCategoryCollection().addItem(cat1);
        user1.getCategoryCollection().addItem(cat2);


        // Create a timer object for user
        TimerTomato timerTomato = new TimerTomato(25, 5, 2);
        user1.setTomato(timerTomato);

        HashMap<String, User> userMap= new HashMap<>();

        userMap.put(user1.getEmailAddress(), user1);
        return userMap;
    }

    static public void storeData(String filePath) {
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    (filePath);
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(TestSampleDataCreator.createSampleData());

            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
