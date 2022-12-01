package use_cases.user.delete_user;


/**
 * This is an interface that passes the output to the Presenter of user account deletion.
 */
public interface DeleteUserOutputBoundary {
    DeleteUserOutputData prepareSuccessView(DeleteUserOutputData outputData);
}
