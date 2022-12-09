package use_cases.habits.create_habit;
import entities.Habit;
import entities.HabitCollection;

/**
 * Use case class for creating a habit.
 */
public class CreateHabit implements CreateHabitInputBoundary{

    private final CreateHabitOutputBoundary outputBoundary;

    private final CreateHabitDsGateway dsGateway;
    private final HabitCollection habitFactory;

    /**
     * Constructor for this class.
     * @param outputBoundary - The output data
     * @param collection - The habit factory of the user.
     */
    public CreateHabit(CreateHabitOutputBoundary outputBoundary, CreateHabitDsGateway dsGateway,
                       HabitCollection collection) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.habitFactory = collection;
    }

    /**
     * Create a new habit based on input data.
     * @param inputData - the input data which may contain the name and type of habit.
     * @return the output data after creation of new task.
     */
    @Override
    public CreateHabitOutputData create(CreateHabitInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getName().isBlank() || inputData.getType().isBlank()){
            String error = "Habit Creation Failed. Please enter the name of the habit.";
            return outputBoundary.prepareFailView(error);
        }

        Habit habit = new Habit(inputData.getName(), inputData.getType());
        habitFactory.addItem(habit);
        CreateHabitOutputData outputData = new CreateHabitOutputData(habit.getName());
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
    public HabitCollection getHabitFactory() {
        return habitFactory;
    }

}
