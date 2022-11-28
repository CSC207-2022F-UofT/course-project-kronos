package use_cases.habits.track_habit;

import entities.Habit;

public class TrackHabitDsRequestModel {

    private Habit h;

    public TrackHabitDsRequestModel(Habit h){
        this.h = h;
    }

    public Habit getHabit() {
        return h;
    }

    public void setHabit(Habit h) {
        this.h = h;
    }
}
