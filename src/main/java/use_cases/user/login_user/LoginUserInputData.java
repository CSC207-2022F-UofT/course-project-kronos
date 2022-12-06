package use_cases.user.login_user;

import entities.CommonUser;

/**
 * This class is a container for the input data related to user login.
 */
public class LoginUserInputData {
    private final String emailAddress;
    private final String password;

    /**
     * Constructor for a DeleteTaskInputData object.
     * @param emailAddress - the input email address which will be checked to log in.
     * @param password - the input password which will be checked to log into the user account.
     */
    public LoginUserInputData(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    /**
     * @return the password attribute of a LoginUserInputData object.
     */
    public String getPassword() {
        return password;
    }


    /**
     * @return the email address attribute of a LoginUserInputData object.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

}
