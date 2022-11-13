package Habit_use_case;
import entities.Habit;

public class CreateHabit {

    //input bound will have to check that the input is valid (colour should have static FINAL options, no repeat names)
    public void createHabit(String title, String t, boolean v) {
        Habit h = new Habit(title, t, v);
    }

}
