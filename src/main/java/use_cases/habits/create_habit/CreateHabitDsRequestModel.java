package use_cases.habits.create_habit;

import entities.Habit;

public class CreateHabitDsRequestModel {

    private Habit habit;

    public CreateHabitDsRequestModel(Habit h) {
        this.habit = h;
    }

    public Habit getHabit() {
        return habit;
    }

    public void setHabit(Habit h) {
        this.habit = h;
    }
}
