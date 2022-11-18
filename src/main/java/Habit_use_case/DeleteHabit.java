package Habit_use_case;
import entities.Habit;
import entities.HabitFactory;

public class DeleteHabit {

    public void deleteHabit(Habit h, HabitFactory factory) {
        // need to go into factory and delete the category's data
        factory.removeItem(h);
        // this method name might change}
    }


}
