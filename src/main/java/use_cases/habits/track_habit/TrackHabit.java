package use_cases.habits.track_habit;

import entities.Habit;
import entities.HabitCollection;

/**
 * Use case class for tracking a habit.
 */
public class TrackHabit implements TrackHabitInputBoundary {
    private final TrackHabitOutputBoundary outputBoundary;
    private final TrackHabitDsGateway dsGateway;
    private final HabitCollection habitCollection;

    /**
     * Constructor for this class.
     * @param outputBoundary - the output boundary interface.
     * @param dsGateway - the database gateway interface.
     * @param hFactory - factory of the habit to be tracked.
     */
    public TrackHabit(TrackHabitOutputBoundary outputBoundary, TrackHabitDsGateway dsGateway, HabitCollection hFactory) {
        this.outputBoundary = outputBoundary;
        this.dsGateway = dsGateway;
        this.habitCollection = hFactory;
    }

    /**
     * Track the frequency of a habit.
     * @param inputData - the input data which contain a habit.
     * @return the output data after tracking.
     */
    @Override
    public TrackHabitOutputData track(TrackHabitInputData inputData) {
        if (inputData.getInputName().isBlank()){
            String error = "Changes not saved. Please fill all required fields.";
            return outputBoundary.prepareFailView(error);
        }

        String id = inputData.getInputName();
        Habit habitBeTracked = habitCollection.getCollection().get(id);
        habitBeTracked.markFrequency();

        TrackHabitOutputData outputData = new TrackHabitOutputData(habitBeTracked.getName(),
                habitBeTracked.getFrequency());
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

}
