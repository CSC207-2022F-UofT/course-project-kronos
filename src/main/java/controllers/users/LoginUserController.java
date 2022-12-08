package controllers.users;
import use_cases.user.login_user.LoginUserInputBoundary;
import use_cases.user.login_user.LoginUserInputData;
import use_cases.user.login_user.LoginUserOutputData;

/**
 * Controller that is used in LoginUser UI to log in the user account.
 * @author happynasit
 */
public class LoginUserController {
    final LoginUserInputBoundary userInputBoundary;

    /**
     * Constructor method for controller
     * @param inputBoundary - input boundary
     */
    public LoginUserController(LoginUserInputBoundary inputBoundary) {
        this.userInputBoundary = inputBoundary;
    }

    /**
     * it calls the interactor of the login of user
     * @param userInputData - input data of the user
     * @return the output data and shows if the login was successful or not
     */
    public LoginUserOutputData login(LoginUserInputData userInputData) {
        return userInputBoundary.login(userInputData);
    }
}
