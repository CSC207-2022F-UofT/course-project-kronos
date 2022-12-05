package use_cases.user.create_user;
import entities.CommonUser;

/**
 *  This class is a container for the output data related to creation of user
 * @author happynasit
 */
public class CreateUserOutputData {
    private final String message;
    private final CommonUser user;

    /**
     * A constructor that is used when there is a failure to create account.
     * @param message - the failure message.
     */
    public CreateUserOutputData(String message){
        this.message = message;
        this.user = new CommonUser();
    }

    /**
     * A constructor that is used only when a user's account is successfully created.
     * @param user - user object created by the Interactor
     */
    public CreateUserOutputData(CommonUser user) {
        this.user = user;
        this.message = null;
    }

    /**
     * @return the message that it shows based on the conditions
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the user's user object
     */
    public CommonUser getUser() {
        return user;
    }
}
