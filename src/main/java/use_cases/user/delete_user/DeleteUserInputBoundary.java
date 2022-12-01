package use_cases.user.delete_user;


/**
 * Interface that passes the inputData to the interactor of user account deletion.
 */
public interface DeleteUserInputBoundary {
    DeleteUserOutputData delete(DeleteUserInputData inputData);
}
