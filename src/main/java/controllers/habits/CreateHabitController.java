//package controllers.habits;
//
//import use_cases.habits.create_habit.CreateHabitInputBoundary;
//import use_cases.habits.create_habit.CreateHabitInputData;
//import use_cases.habits.create_habit.CreateHabitOutputData;
//
//
///**
// Controller class for creating a habit.
// */
//public class CreateHabitController {
//    final CreateHabitInputBoundary userInput;
//
//    /**
//     * Constructor for this class.
//     * @param habitGateway - The input from the user.
//     */
//
//    public CreateHabitController(CreateHabitInputBoundary habitGateway) {
//        this.userInput = habitGateway;
//    }
//
//    /**
//     * @param name - The name of habit.
//     * @param type - The type of habit.
//     * @return returns the output data after creation.
//     */
//    public CreateHabitOutputData create(String name, String type){
//        CreateHabitInputData inputData = new CreateHabitInputData(name, type);
//        return userInput.create(inputData);
//    }
//}
