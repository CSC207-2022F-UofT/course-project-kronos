//package controllers.habits;
//
//import controllers.habits.HabitCreationFailed;
//import use_cases.habits.create_habit.CreateHabitOutputBoundary;
//import use_cases.habits.create_habit.CreateHabitOutputData;
//
///**
// Presenter class for creating a habit.
// */
//public class CreateHabitPresenter implements CreateHabitOutputBoundary {
//
//    /**
//     * @param output - The output to be presented on the screen
//     * @return returns the output data
//     */
//
//    @Override
//    public CreateHabitOutputData prepareSuccessView(CreateHabitOutputData output) {
//
//        return output;
//    }
//
//    /**
//     * @param error - The message to be displayed on screen
//     */
//    @Override
//    public CreateHabitOutputData prepareFailView(String error) {
//        throw new HabitCreationFailed(error);
//    }
//}
