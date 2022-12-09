package use_cases.user.delete_user;


/**
 * This is an interface that passes the output to the Presenter of user account deletion.
 * Since the use case is only deleting an account, it will always be successful. So it will not have a fail view.
 * @author happynasit
 */
public interface DeleteUserOutputBoundary {
    DeleteUserOutputData prepareSuccessView(DeleteUserOutputData outputData);
}
