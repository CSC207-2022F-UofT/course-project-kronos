package controllers;

import entities.CommonUser;
import use_cases.user.login_user.LoginUserInputBoundary;
import use_cases.user.login_user.LoginUserInputData;
import use_cases.user.login_user.LoginUserOutputData;

/**
 * Controller that is used in LoginUser UI to create the user account and direct to the homepage.
 */
public class LoginUserController {
    final LoginUserInputBoundary userInput;

    /**
     * Constructor method for controller
     * @param accountGateway - use case layer
     */
    public LoginUserController(LoginUserInputBoundary accountGateway) {
        this.userInput = accountGateway;
    }

    /**
     * This method is used in the ui to log into the account
     * @param user - user object
     * @param emailAddress - of the user
     * @param password - that the user enters
     * @return the output data based on the email address and the password entered
     */
    LoginUserOutputData login(CommonUser user, String emailAddress, String password) {
        LoginUserInputData inputData = new LoginUserInputData(user, emailAddress, password);

        return userInput.login(inputData);
    }
}
