package use_cases.habits.create_habit;
import entities.Habit;
import entities.HabitFactory;

/**
 * Use case class for creating a habit.
 */
public class CreateHabit implements CreateHabitInputBoundary{

    private final CreateHabitOutputBoundary outputBoundary;
    private final HabitFactory habitFactory;

    /**
     * Constructor for this class.
     * @param outputBoundary - The output data
     * @param h - The habit factory of the user.
     */
    public CreateHabit(CreateHabitOutputBoundary outputBoundary, HabitFactory h) {
        this.outputBoundary = outputBoundary;
        this.habitFactory = h;
    }

    /**
     * Create a new habit based on input data.
     * @param inputData - the input data which may contain the name and type of habit.
     * @return the output data after creation of new task.
     */
    @Override
    public CreateHabitOutputData create(CreateHabitInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getName().isBlank()){
            CreateHabitOutputData outputData = new CreateHabitOutputData("Habit Creation Failed. " +
                    "Please enter the name of the habit.");
            return outputBoundary.prepareFailView(outputData.getMessage());
        } else if (inputData.getType().isBlank()) {
            CreateHabitOutputData outputData = new CreateHabitOutputData("Habit Creation Failed. " +
                    "Please enter the type of the habit.");
            return outputBoundary.prepareFailView(outputData.getMessage());
        }

        Habit h = new Habit(inputData.getName(), inputData.getType());
        habitFactory.addItem(h);
        CreateHabitOutputData outputData = new CreateHabitOutputData(h);
        return outputBoundary.prepareSuccessView(outputData);
    }

    /**
     * @return returns the output data after creation of new habit.
     */
    public CreateHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return returns the habit factory after creation of new habit.
     */
    public HabitFactory getHabitFactory() {
        return habitFactory;
    }

}
