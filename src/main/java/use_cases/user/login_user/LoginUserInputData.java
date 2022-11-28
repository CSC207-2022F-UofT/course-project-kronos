package use_cases.user.login_user;

import entities.UserEntity;

/**
 * This class is a container for the input data related to user login
 */
public class LoginUserInputData {
    private final UserEntity user;
    private final String emailaddress;
    private final String password;

    /**
     * Constructor for a DeleteTaskInputData object.
     * @param user - the input user which will be used and checked to log in. The input user may or may not exist in the database.
     * @param emailaddress - the input emailaddres which will be checked to log in.
     * @param password - the input password which will be checked to log into the user account.
     */
    public LoginUserInputData(UserEntity user, String emailaddress, String password) {
        this.user = user;
        this.emailaddress = emailaddress;
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
    public String getEmailaddress() {
        return emailaddress;
    }


    /**
     * @return the user attribute of a LoginUserInputData object.
     */
    public UserEntity getUser() {
        return user;
    }
}
