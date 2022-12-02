package use_cases.user.login_user;

/**
 * Use case layer that stores the user's login detail
 */
public class LoginUserDsRequestModel {

    private final String emailAddress;
    private final String password;

    /**
     * Constructor method for LoginUserDsRequestModel
     * @param emailAddress of the user
     * @param password of the user
     */
    public LoginUserDsRequestModel(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    /**
     * @return the user's email address
     */
    public String getEmailAddress(){return emailAddress;}

    /**
     * @return the user's password that was entered
     */
    public String getPassword(){return password;}
}
