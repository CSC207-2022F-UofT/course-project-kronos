package controllers.users;
import use_cases.user.login_user.LoginUserOutputBoundary;
import use_cases.user.login_user.LoginUserOutputData;

public class LoginUserPresenter implements LoginUserOutputBoundary {

    /**
     * If the system is not able to log the account successfully
     * @param outputData of the user
     * @return the output data and a fail view
     */
    @Override
    public LoginUserOutputData prepareFailView(LoginUserOutputData outputData) {
        return outputData;
    }

    /**
     * If the system is able to log the account successfully
     * @param outputData of the user
     * @return the output data and a success view
     */
    @Override
    public LoginUserOutputData prepareSuccessView(LoginUserOutputData outputData) {
        return outputData;
    }
}
