package use_cases.habits.edit_habit;
import entities.Habit;
import entities.HabitFactory;
import entities.User;

public class EditHabit implements EditHabitInputBoundary {
    private final EditHabitOutputBoundary outputBoundary;
    private final EditHabitDsGateway dsGateway;
    private final HabitFactory habitFactory;

    public EditHabit(EditHabitOutputBoundary outputBoundary, EditHabitDsGateway dsGateway, HabitFactory hFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.habitFactory = hFactory;
    }

    /**
     * Edit the properties of a task. The edible properties are name, category, and deadline for a task object.
     * @param inputData - the input data which contain a task, an input name, an input category name, and an input
     *                  deadline.
     * @return the output data after editing.
     */
    @Override
    public EditHabitOutputData edit(EditHabitInputData inputData) {
        // If the input name is empty or containing only white spaces
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

    public EditHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public EditHabitDsGateway getDsGateway() {
        return dsGateway;
    }

    public HabitFactory getHabitFactory() {
        return habitFactory;
    }

}
