package use_cases.user.delete_user;
import entities.CommonUser;

/**
 *  This class is a container for the output data related to deletion of user, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class DeleteUserOutputData {
    private final String message;
    private final CommonUser user;

    /**
     * Constructor
     * @param message - the message of the result of deletion.
     * @param user - the user that is deleted.
     */
    public DeleteUserOutputData(String message, CommonUser user) {
        this.message = message;
        this.user = user;
    }

    /**
     * @return the message based on the condition
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the user object
     */
    public CommonUser getUser(){return user;}

}
