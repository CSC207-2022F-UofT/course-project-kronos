package use_cases.user.create_user;

/**
 * This is an interface that passes the inputData to the interactor of Account creation.
 */

public interface CreateUserInputBoundary {
    CreateUserOutputData create(CreateUserInputData inputData);
}
