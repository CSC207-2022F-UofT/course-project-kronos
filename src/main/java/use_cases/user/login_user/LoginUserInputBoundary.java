package use_cases.user.login_user;

/**
 * This is an interface that passes the inputData to log the user
 */
public interface LoginUserInputBoundary {
    LoginUserOutputData login(LoginUserInputData inputData);
}
