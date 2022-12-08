package use_cases.habits.edit_habit;
import entities.Habit;
import entities.HabitCollection;

/**
 * Use case class for editing a habit.
 */
public class EditHabit implements EditHabitInputBoundary {
    private final EditHabitOutputBoundary outputBoundary;
    private final EditHabitDsGateway dsGateway;
    private final HabitCollection habitFactory;

    /**
     * Constructor for this class.
     * @param outputBoundary - the output boundary interface.
     * @param dsGateway - the database gateway interface.
     * @param hFactory - factory of the habit to be edited.
     */
    public EditHabit(EditHabitOutputBoundary outputBoundary, EditHabitDsGateway dsGateway, HabitCollection hFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.habitFactory = hFactory;
    }

    /**
     * Edit the properties of a habit. The edible properties are name, type, and frequency for a habit object.
     * @param inputData - the input data which contain a habit, an input name, an input type, and an input
     *                  frequency.
     * @return the output data after editing.
     */
    @Override
    public EditHabitOutputData edit(EditHabitInputData inputData) {
        if (inputData.getInputName().isBlank()){
            String error = "Changes not saved. Please fill all required fields.";
            return outputBoundary.prepareFailView(error);
        }

        String id = inputData.getInputName();
        Habit habitBeEdited = habitFactory.getCollection().get(id);
        habitBeEdited.setName(inputData.getInputName());
        habitBeEdited.setType(inputData.getInputType());
        EditHabitOutputData outputData = new EditHabitOutputData(habitBeEdited.getName(), habitBeEdited.getType());
        return outputBoundary.prepareSuccessView(outputData);

    }

    /**
     * @return the output boundary
     */
    public EditHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return the dsGateway
     */
    public EditHabitDsGateway getDsGateway() {
        return dsGateway;
    }

    /**
     * @return the habit factory
     */
    public HabitCollection getHabitFactory() {
        return habitFactory;
    }

}
