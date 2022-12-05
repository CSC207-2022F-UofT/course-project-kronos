package use_cases.user.login_user;

import entities.CommonUser;

/**
 *  This class is a container for the output data related to user login.
 */
public class LoginUserOutputData {
    private final String message;
    private final CommonUser user;
    private final String emailAddress;


    /**
     * A constructor that is used when there is a failure to log into the account.
     * @param message - the failure message.
     * @param emailAddress - the email address of the user
     * @param user - the User object of the user.
     */
    public LoginUserOutputData(String message, String emailAddress, CommonUser user) {
        this.message = message;
        this.emailAddress = emailAddress;
        this.user = user;
    }

    /**
     * A constructor that is used when there is NO failure to log into the account.
     * @param emailAddress - the emailAddress of the user
     * @param user - the User object of the user.
     */
    public LoginUserOutputData(String emailAddress, CommonUser user) {
        this.message = null;
        this.emailAddress = emailAddress;
        this.user = user;
    }

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
