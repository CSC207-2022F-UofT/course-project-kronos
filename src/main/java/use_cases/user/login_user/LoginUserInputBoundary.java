package use_cases.user.login_user;

/**
 * This is an interface that passes the inputData to the interactor of user login.
 */
public interface LoginUserInputBoundary {
    LoginUserOutputData login(LoginUserInputData inputData);
}
