package use_cases.user.create_user;
import entities.CommonUser;

/**
 *  This class is a container for the output data related to creation of user
 * @author happynasit
 */
public class CreateUserOutputData {
    boolean isSuccessful;
    private final String message;
    private final CommonUser user;

    /**
     * A constructor that is used when there is a failure to create account.
     * @param message - the failure message.
     * @param isSuccessful - checks if the view returned is success view or not
     */
    public CreateUserOutputData(boolean isSuccessful, String message){
        this.isSuccessful = isSuccessful;
        this.message = message;
        this.user = new CommonUser();
    }

    /**
     * A constructor that is used only when a user's account is successfully created.
     * This does not return any error message if it is successfully done.
     * @param isSuccessful - the boolean value that is returned once it checks if the creation is successful or not
     * @param user - user object created by the Interactor
     */
    public CreateUserOutputData(boolean isSuccessful, CommonUser user) {
        this.isSuccessful = isSuccessful;
        this.user = user;
        this.message = null;
    }
    /**
     * @return if the creation was successful or not and the interactor will return true if it was
     */
    public boolean getIsSuccessful(){
        return isSuccessful;
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
