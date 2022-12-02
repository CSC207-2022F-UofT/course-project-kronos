package use_cases.habits.track_habit;

import entities.Habit;

/**
 * Request Model class for creating a habit.
 */
public class TrackHabitDsRequestModel {

    private Habit habit;

    /**
     * Constructor for this class.
     * @param habit - habit to be tracked.
     */
    public TrackHabitDsRequestModel(Habit habit){
        this.habit = habit;
    }

    /**
     * @return habit to be tracked
     */
    public Habit getHabit() {
        return habit;
    }

    /**
     * Set the attribute habit of this class to the given habit.
     * @param habit - given habit
     */
    public void setHabit(Habit habit) {
        this.habit = habit;
    }
}
