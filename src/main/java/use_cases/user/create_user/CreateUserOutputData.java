package use_cases.user.create_user;
import entities.UserEntity;

/**
 *  This class is a container for the output data related to creation of user
 */
public class CreateUserOutputData {
    private final String message;
    private final UserEntity user;

    /**
     * A constructor that is used when there is a failure to create account.
     * @param message - the failure message.
     */
    public CreateUserOutputData(String message){
        this.message = message;
        this.user = new UserEntity();
    }

    /**
     * A constructor that is used only when a user's account is successfully created.
     * @param user - user object created by the interactor
     */
    public CreateUserOutputData(UserEntity user) {
        this.user = user;
        this.message = null;
    }

    public String getMessage() {
        return message;
    }

    public UserEntity getUser() {
        return user;
    }
}
