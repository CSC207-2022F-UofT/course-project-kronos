package use_cases.habits.track_habit;
import entities.Habit;
import use_cases.habits.edit_habit.EditHabitInputData;
import use_cases.habits.edit_habit.EditHabitOutputData;

public interface TrackHabitInputBoundary {
    TrackHabitOutputData track(TrackHabitInputData inputData);
}
