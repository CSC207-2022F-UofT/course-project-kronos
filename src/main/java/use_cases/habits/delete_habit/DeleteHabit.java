package use_cases.habits.delete_habit;
import entities.Habit;
import entities.HabitFactory;
import entities.User;

public class DeleteHabit {

    private final DeleteHabitOutputBoundary outputBoundary;
    private final DeleteHabitDsGateway dsGateway;
    private final HabitFactory habitFactory;

    public DeleteHabit(DeleteHabitOutputBoundary outputBoundary, DeleteHabitDsGateway dsGateway, HabitFactory hFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.habitFactory = hFactory;
    }

    /**
     * Delete an existing task based on input data.
     * @param inputData  - the input data which contain a task object that will be deleted.
     * @return the output data after deletion.
     */
    @Override
    public DeleteHabitOutputData delete(DeleteHabitInputData inputData) {
        String id = inputData.getName();
        Habit habitToDelete = habitFactory.getCollection().get(id);
        habitFactory.removeItem(habitToDelete);
        DeleteHabitOutputData outputData = new DeleteHabitOutputData("Task \"" + id + "\" is successfully deleted.");
        // How can we know which successView should be prepared? To-do or Calendar?
        return outputBoundary.prepareSuccessView(outputData);
        // The above 2 lines will be refactored by extracting method and pulling up field after the above question is
        // solved.
    }

    public DeleteHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public HabitFactory getHabitFactory() {
        return habitFactory;
    }

    public DeleteHabitDsGateway getDsGateway() {
        return dsGateway;
    }

}
