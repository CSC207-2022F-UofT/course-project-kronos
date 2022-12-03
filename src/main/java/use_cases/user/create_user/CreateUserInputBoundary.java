package use_cases.user.create_user;

/**
 * This is an interface that passes the inputData to the CreateUserInteract.
 * @author happynasit
 */
public interface CreateUserInputBoundary {
    CreateUserOutputData create(CreateUserInputData inputData);
}
