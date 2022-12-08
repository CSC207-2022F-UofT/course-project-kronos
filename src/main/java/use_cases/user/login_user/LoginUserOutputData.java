package use_cases.user.login_user;

import entities.CommonUser;

/**
 *  This class is a container for the output data related to user login.
 * @author happynasit
 */
public class LoginUserOutputData {
    boolean isLoginSuccessful;
    private final String message;
    private final CommonUser user;
    private final String emailAddress;


    /**
     * A constructor that is used when there is a failure to log into the account.
     * @param message - the failure message.
     * @param isLoginSuccessful - the boolean value to show if the user is logged in or not
     */
    public LoginUserOutputData(boolean isLoginSuccessful, String message ) {
        this.isLoginSuccessful = isLoginSuccessful;
        this.message = message;
        this.emailAddress = null;
        this.user = null;
    }

    /**
     * A constructor that is used when there is NO failure to log into the account.
     * @param isLoginSuccessful - the boolean value to show if the user is logged in or not
     * @param emailAddress - the emailAddress of the user
     * @param user - the User object of the user.
     */
    public LoginUserOutputData(boolean isLoginSuccessful, String emailAddress, CommonUser user) {
        this.isLoginSuccessful = isLoginSuccessful;
        this.message = null;
        this.emailAddress = emailAddress;
        this.user = user;
    }

    /**
     * @return if the login is successful or not
     */
    public boolean getIsLoginSuccessful(){return isLoginSuccessful;}

    /**
     * @return the message based on the output
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
