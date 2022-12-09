package use_cases.user.login_user;

/**
 * This is an interface that passes the inputData to log the user.
 * @author happynasit
 */
public interface LoginUserInputBoundary {
    LoginUserOutputData login(LoginUserInputData inputData);
}
