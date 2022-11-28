package use_cases.user.delete_user;
import entities.UserEntity;

/**
 *  This class is a container for the output data related to deletion of user, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class DeleteUserOutputData {
    private final String message;
    private final UserEntity user;

    /**
     * Constructor
     * @param message - the message of the result of deletion.
     * @param user - the user that is deleted.
     */
    public DeleteUserOutputData(String message, UserEntity user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public UserEntity getUser(){return user;}

}
