package Habit_use_case;
import entities.Habit;
import entities.User;
import ui.TestFile;


public class CreateHabit {

    //input bound will have to check that the input is valid (colour should have static FINAL options, no repeat names)
    public static void createHabit(User userA, String title, String t, boolean v) {
        Habit h = new Habit(title, t, v);

        userA.getHabitCollection().addItem(h);


    }

}
