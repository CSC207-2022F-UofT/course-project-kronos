package database;

import java.util.HashMap;

public class DatabaseHabit{

    private HashMap habitCollection;

    public DatabaseHabit(DatabaseUser database){
        this.habitCollection = database.getHabits();
    }
}
