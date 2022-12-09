package controllers.users;
import use_cases.user.create_user.CreateUserOutputBoundary;
import use_cases.user.create_user.CreateUserOutputData;

/**
 * Use case layer
 * @author happynasit
 */
public class CreateUserPresenter implements CreateUserOutputBoundary {

    /**
     * If the system is not able to create the account successfully
     * @param outputData of the user
     * @return the output data and a fail view
     */
    @Override
    public CreateUserOutputData prepareFailView(CreateUserOutputData outputData) {
        return outputData;
    }

    /**
     * If the system is able to create the account successfully
     * @param outputData of the user
     * @return the output data and a success view
     */
    @Override
    public CreateUserOutputData prepareSuccessView(CreateUserOutputData outputData) {
        return outputData;
    }
}
