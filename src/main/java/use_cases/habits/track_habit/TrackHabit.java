package use_cases.habits.track_habit;

import entities.Habit;
import entities.HabitFactory;
import use_cases.habits.edit_habit.*;

public class TrackHabit implements TrackHabitInputBoundary {
    private final TrackHabitOutputBoundary outputBoundary;
    private final TrackHabitDsGateway dsGateway;
    private final HabitFactory habitFactory;

    public TrackHabit(TrackHabitOutputBoundary outputBoundary, TrackHabitDsGateway dsGateway, HabitFactory hFactory) {
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
    public TrackHabitOutputData track(TrackHabitInputData inputData) {
        // If the input name is empty or containing only white spaces
        if (inputData.getInputName().isBlank()){
            TrackHabitOutputData outputData = new TrackHabitOutputData("Changes not saved. " +
                    "Please fill all required fields.");
            return outputBoundary.prepareFailView(outputData);
        }

        String id = inputData.getInputName();
        Habit habitBeTracked = habitFactory.getCollection().get(id);
        habitBeTracked.markFrequency();

        TrackHabitOutputData outputData = new TrackHabitOutputData(
                "Changes have been saved.", habitBeTracked.getName(), habitBeTracked.getFrequency());
        return outputBoundary.prepareSuccessView(outputData);

    }

    public TrackHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public TrackHabitDsGateway getDsGateway() {
        return dsGateway;
    }

    public HabitFactory getHabitFactory() {
        return habitFactory;
    }
}
