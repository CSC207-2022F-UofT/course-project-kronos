package use_cases.habits.create_habit;
import entities.Habit;
import entities.HabitFactory;

public class CreateHabit implements CreateHabitInputBoundary{

    private final CreateHabitOutputBoundary outputBoundary;
    private final HabitFactory habitFactory;


    public CreateHabit(CreateHabitOutputBoundary outputBoundary, HabitFactory h) {
        this.outputBoundary = outputBoundary;
        this.habitFactory = h;
    }

    /**
     * Create a new task based on input data.
     * @param inputData - the input data which may contain the name and deadline of a task.
     * @return the output data after creation of new task.
     */
    @Override
    public CreateHabitOutputData create(CreateHabitInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getName().isBlank()){
            CreateHabitOutputData outputData = new CreateHabitOutputData("Habit Creation Failed. " +
                    "Please enter the name of the habit.");
            return outputBoundary.prepareFailView(outputData);
        } else if (inputData.getType().isBlank()) {
            CreateHabitOutputData outputData = new CreateHabitOutputData("Habit Creation Failed. " +
                    "Please enter the type of the habit.");
            return outputBoundary.prepareFailView(outputData);
        }

        Habit h = new Habit(inputData.getName(), inputData.getType());
        // The new Task object above is not assigned to any category.
        // So we do not need to update the Category/CategoryFactory.
        habitFactory.addItem(h);
        CreateHabitOutputData outputData = new CreateHabitOutputData(h);
        return outputBoundary.prepareSuccessView(outputData);
    }

    public CreateHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public HabitFactory getHabitFactory() {
        return habitFactory;
    }

}
