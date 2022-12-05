package use_cases.habits.create_habit;
import entities.Habit;

/**
 *  This class is a container for the output data related to creation of habit, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class CreateHabitOutputData {
    private final String message;
    private final Habit habit;

    /**
     * A constructor that is used when there is a failure to create task habit.
     * @param message - the failure message.
     */
    public CreateHabitOutputData(String message){
        this.message = message;
        this.habit = new Habit(null, null);
    }

    /**
     * A constructor that is used only when a habit is successfully created.
     * @param h - habit object created by the interactor.
     */
    public CreateHabitOutputData(Habit h) {
        this.message = null;
        this.habit = h;
    }

    public String getMessage() {
        return message;
    }

    public  Habit getHabit() {
        return habit;}
}
