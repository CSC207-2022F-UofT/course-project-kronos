package Habit_use_case;
import entities.Habit;
import entities.HabitFactory;

public class EditHabit {

    public void editName(Habit h, HabitFactory factory, String title){
        String oldKey = h.getName();
        factory.updateKey(oldKey, title);
    }

    public void editType(Habit h, String t){
        h.setType(t);
    }

    public void editReminder(Habit h, Boolean v){
        h.setReminder(v);
    }

    public void edit(Habit h, String t){
        h.setType(t);
    }
}
