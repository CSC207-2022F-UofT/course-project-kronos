//package controllers.habits;
//
//import use_cases.habits.delete_habit.DeleteHabitInputBoundary;
//import use_cases.habits.delete_habit.DeleteHabitInputData;
//import use_cases.habits.delete_habit.DeleteHabitOutputData;
//
///**
// Controller class for deleting a habit.
// */
//public class DeleteHabitController {
//
//    final DeleteHabitInputBoundary userInput;
//
//    /**
//     * Constructor for this class.
//     * @param habitGateway - The input from the user.
//     */
//    public DeleteHabitController(DeleteHabitInputBoundary habitGateway) {
//        this.userInput = habitGateway;
//    }
//
//    /**
//     * @param habitID - The name (ID) of the habit to be deleted.
//     * @return returns the output data after deletion.
//     */
//    DeleteHabitOutputData delete(String habitID){
//        DeleteHabitInputData inputData = new DeleteHabitInputData(habitID);
//        return userInput.delete(inputData);
//    }
//}
