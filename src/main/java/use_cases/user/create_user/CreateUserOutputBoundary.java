package use_cases.user.create_user;

/**
 * Interface that passes the output to the Presenter of User account creation.
 * @author happynasit
 */
public interface CreateUserOutputBoundary {
    CreateUserOutputData prepareSuccessView(CreateUserOutputData outputData);
    CreateUserOutputData prepareFailView(CreateUserOutputData outputData);
}
