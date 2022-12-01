package use_cases.user.login_user;

import entities.CommonUser;

/**
 *  This class is a container for the output data related to user login
 */
public class LoginUserOutputData {
    private final String message;
    private final CommonUser user;
    private final String emailaddress;



    /**
     * A constructor that is used when there is a failure to log into the account.
     * @param message - the failure message.
     * @param emailaddress - the emailaddress of the user
     * @param user - the User object of the user.
     */
    public LoginUserOutputData(String message, String emailaddress, CommonUser user) {
        this.message = message;
        this.emailaddress = emailaddress;
        this.user = user;
    }

    /**
     * A constructor that is used when there is NO failure to log into the account.
     * @param emailaddress - the emailaddress of the user
     * @param user - the User object of the user.
     */
    public LoginUserOutputData(String emailaddress, CommonUser user) {
        this.message = null;
        this.emailaddress = emailaddress;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public CommonUser getUser() {
        return user;
    }

}