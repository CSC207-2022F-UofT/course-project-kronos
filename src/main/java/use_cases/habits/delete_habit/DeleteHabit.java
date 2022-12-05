package use_cases.habits.delete_habit;
import entities.Habit;
import entities.HabitFactory;

/**
 * Use case class for deleting a habit.
 */
public class DeleteHabit {

    private final DeleteHabitOutputBoundary outputBoundary;
    private final DeleteHabitDsGateway dsGateway;
    private final HabitFactory habitFactory;

    /**
     * Constructor for this class.
     * @param outputBoundary - The output data
     * @param dsGateway -
     * @param hFactory - the factory of the habit to be deleted.
     */
    public DeleteHabit(DeleteHabitOutputBoundary outputBoundary, DeleteHabitDsGateway dsGateway, HabitFactory hFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.habitFactory = hFactory;
    }

    /**
     * Delete an existing habit based on input data.
     * @param inputData  - the input data which contain a habit object that will be deleted.
     * @return the output data after deletion.
     */
    //@Override
    public DeleteHabitOutputData delete(DeleteHabitInputData inputData) {
        String id = inputData.getHabitId();
        Habit habitToDelete = habitFactory.getCollection().get(id);
        habitFactory.removeItem(habitToDelete);
        DeleteHabitOutputData outputData = new DeleteHabitOutputData("Habit \"" + id + "\" is successfully deleted.");

        return outputBoundary.prepareSuccessView(outputData);

    }

    /**
     * @return the output boundary
     */
    public DeleteHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return the habit factory
     */
    public HabitFactory getHabitFactory() {
        return habitFactory;
    }

    /**
     * @return the dsGateway
     */
    public DeleteHabitDsGateway getDsGateway() {
        return dsGateway;
    }

}
