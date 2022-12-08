package controllers.users;

import use_cases.user.create_user.CreateUserInputBoundary;
import use_cases.user.create_user.CreateUserInputData;
import use_cases.user.create_user.CreateUserOutputData;

/**
 * Controller that is used in CreateUser UI to create the user account.
 * @author happynasit
 */
public class CreateUserController {

    final CreateUserInputBoundary userInputBoundary;

    /**
     * Constructor method for controller
     * @param accountGateway - use case layer
     */
    public CreateUserController(CreateUserInputBoundary accountGateway) {
        this.userInputBoundary = accountGateway;
    }

    /**
     * it calls the interactor of the creation of user
     * @param userInputData - input data of the user
     * @return the output data and shows if the creation was successful or not
     */
    public CreateUserOutputData create(CreateUserInputData userInputData) {
        return userInputBoundary.create(userInputData);
    }
}
