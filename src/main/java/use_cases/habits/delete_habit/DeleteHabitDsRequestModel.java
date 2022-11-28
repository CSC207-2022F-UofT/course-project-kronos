package use_cases.habits.delete_habit;

import entities.Habit;

public class DeleteHabitDsRequestModel {

    private final Habit habit;


    public DeleteHabitDsRequestModel(Habit h) {
        this.habit = h;
    }

    public Habit getHabit() {
        return habit;
    }
}
