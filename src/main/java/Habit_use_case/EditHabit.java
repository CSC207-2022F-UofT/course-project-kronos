package Habit_use_case;
import entities.Habit;
import entities.HabitFactory;

public class EditHabit {

    public static void editName(Habit h, HabitFactory factory, String title){
        String oldKey = h.getName();
        factory.updateKey(oldKey, title);
    }

    public static void editType(Habit h, String t){
        h.setType(t);
    }

    public static void editReminder(Habit h, Boolean v){
        h.setReminder(v);
    }
}
