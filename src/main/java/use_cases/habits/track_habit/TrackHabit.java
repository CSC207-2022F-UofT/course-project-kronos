package use_cases.habits.track_habit;

import entities.Habit;
import entities.HabitFactory;

/**
 * Use case class for tracking a habit.
 */
public class TrackHabit implements TrackHabitInputBoundary {
    private final TrackHabitOutputBoundary outputBoundary;
    private final TrackHabitDsGateway dsGateway;
    private final HabitFactory habitFactory;

    /**
     * Constructor for this class.
     * @param outputBoundary -
     * @param dsGateway -
     * @param hFactory -
     */
    public TrackHabit(TrackHabitOutputBoundary outputBoundary, TrackHabitDsGateway dsGateway, HabitFactory hFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.habitFactory = hFactory;
    }

    /**
     * Track the frequency of a habit.
     * @param inputData - the input data which contain a habit.
     * @return the output data after tracking.
     */
    @Override
    public TrackHabitOutputData track(TrackHabitInputData inputData) {
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

    /**
     * @return output boundary
     */
    public TrackHabitOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return dsGateway
     */
    public TrackHabitDsGateway getDsGateway() {
        return dsGateway;
    }

    /**
     * @return habit factory
     */
    public HabitFactory getHabitFactory() {
        return habitFactory;
    }
}
