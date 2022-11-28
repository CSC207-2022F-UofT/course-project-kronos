package use_cases.habits.edit_habit;

import entities.Habit;

public class EditHabitDsRequestModel {

    private Habit h;

    public EditHabitDsRequestModel(Habit h){
        this.h = h;
    }

    public Habit getHabit() {
        return h;
    }

    public void setHabit(Habit h) {
        this.h = h;
    }
}
