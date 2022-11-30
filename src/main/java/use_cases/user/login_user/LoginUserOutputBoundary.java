package use_cases.user.login_user;

/**
 * Interface that passes the output to the Presenter of User account login.
 */

public interface LoginUserOutputBoundary {
    // The Login User will have both success and failure view
    LoginUserOutputData prepareSuccessView(LoginUserOutputData outputData);
    LoginUserOutputData prepareFailView(LoginUserOutputData outputData);
}
