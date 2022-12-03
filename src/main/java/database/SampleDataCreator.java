package database;

import entities.CommonUser;
import entities.Habit;
import entities.Task;
import entities.User;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class SampleDataCreator {

    public String filePath;

    public SampleDataCreator(String filepath){
        this.filePath = filepath;
    }

    void createSampleData(){
        User user1 = new CommonUser("testEmail1@gmail.com", "password1", "firstName1", "lastName1");
        // creating habit 1
        Habit habit1 = new Habit("Running", "completion");
        Calendar calendar = Calendar.getInstance();
        calendar.set(122, 1, 1);
        HashMap<String, Integer> habitMap = habit1.getFrequencyMap();
        Random rand = new Random();
        // create random data for completion of habit in 2022
        for (int i=0;i <= 365; i++){
            habitMap.put(calendar.toString(), rand.nextInt(2));
            calendar.set(calendar.YEAR + 1, 01, 01);
        }
        // putting habit into habit collection
        user1.getHabitCollection().habitCollection.put(habit1.getName(), habit1);

        Habit habit2 = new Habit("Reading", "completion");
        HashMap<String, Integer> habitMap2 = habit2.getFrequencyMap();
        calendar.set(122, 1, 1);
        // create random data for completion of habit in 2022
        for (int i=0;i <= 365; i++){
            habitMap2.put(calendar.toString(), rand.nextInt(2));
            calendar.set(calendar.YEAR + 1, 01, 01);
        }
        user1.getHabitCollection().habitCollection.put(habit2.getName(), habit2);

        Habit habit3 = new Habit("Meditating", "completion");
        calendar.set(122, 1, 1);
        HashMap<String, Integer> habitMap3 = habit3.getFrequencyMap();
        // create random data for completion of habit in 2022
        for (int i=0;i <= 365; i++){
            habitMap3.put(calendar.toString(), rand.nextInt(2));
            calendar.set(calendar.YEAR + 1, 01, 01);
        }
        user1.getHabitCollection().habitCollection.put(habit3.getName(), habit3);

        // creating 4 tasks
        HashMap<Integer, Task> taskMap = new HashMap<>();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(122, 12, 12);
        Task task1 = new Task("Do HomeWork", calendar1);
        taskMap.put(task1.getId(), task1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(122, 12, 14);
        Task task2 = new Task("Study for csc207 test", calendar2);
        taskMap.put(task2.getId(), task2);

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(122, 12, 8);
        Task task3 = new Task("Submit csc207 project", calendar3);
        taskMap.put(task3.getId(), task3);

        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(122, 12, 16);
        Task task4 = new Task("Final Exam", calendar4);
        taskMap.put(task4.getId(), task4);

        user1.getTaskCollection().getTasks().putAll(taskMap);

        // creating categories for tasks

    }
}
