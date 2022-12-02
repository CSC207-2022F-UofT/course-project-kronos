package controllers;

import use_cases.user.create_user.CreateUserInputBoundary;
import use_cases.user.create_user.CreateUserInputData;
import use_cases.user.create_user.CreateUserOutputData;

/**
 * Controller that is used in CreateUser UI to create the user account.
 */
public class CreateUserController {

    final CreateUserInputBoundary userInput;

    /**
     * Constructor method for controller
     * @param accountGateway - use case layer
     */
    public CreateUserController(CreateUserInputBoundary accountGateway) {
        this.userInput = accountGateway;
    }

    CreateUserOutputData create(String firstName, String lastName, String emailAddress, String password, String repPassword) {
        CreateUserInputData inputData = new CreateUserInputData(emailAddress, password, firstName, lastName, repPassword);

        return userInput.create(inputData);
    }
}
