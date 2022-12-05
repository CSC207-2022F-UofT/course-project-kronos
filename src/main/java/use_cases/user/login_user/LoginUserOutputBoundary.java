package use_cases.user.login_user;

/**
 * Interface that passes the output to the Presenter of User account login.
 */
public interface LoginUserOutputBoundary {
    LoginUserOutputData prepareSuccessView(LoginUserOutputData outputData);
    LoginUserOutputData prepareFailView(LoginUserOutputData outputData);
}
