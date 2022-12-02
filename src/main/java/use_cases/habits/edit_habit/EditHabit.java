package use_cases.habits.edit_habit;
import entities.Habit;
import entities.HabitFactory;
import entities.User;

/**
 * Use case class for editing a habit.
 */
public class EditHabit implements EditHabitInputBoundary {
    private final EditHabitOutputBoundary outputBoundary;
    private final EditHabitDsGateway dsGateway;
    private final HabitFactory habitFactory;

    /**
     * Constructor for this class.
     * @param outputBoundary -
     * @param dsGateway -
     * @param hFactory - factory of the habit to be edited.
     */
    public EditHabit(EditHabitOutputBoundary outputBoundary, EditHabitDsGateway dsGateway, HabitFactory hFactory) {
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
            EditHabitOutputData outputData = new EditHabitOutputData("Changes not saved. " +
                    "Please fill all required fields.");
            return outputBoundary.prepareFailView(outputData);
        }

        String id = inputData.getInputName();
        Habit habitBeEdited = habitFactory.getCollection().get(id);
        habitBeEdited.setName(inputData.getInputName());
        habitBeEdited.setType(inputData.getInputType());
        EditHabitOutputData outputData = new EditHabitOutputData(
                "Changes have been saved.", habitBeEdited.getName(), habitBeEdited.getType());
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
    public HabitFactory getHabitFactory() {
        return habitFactory;
    }

}
