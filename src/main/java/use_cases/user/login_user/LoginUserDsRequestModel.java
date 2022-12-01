package use_cases.user.login_user;

/**
 * use case layer
 */
public class LoginUserDsRequestModel {

    private final String emailaddress;
    private final String password;

    public LoginUserDsRequestModel(String emailaddress, String password) {
        this.emailaddress = emailaddress;
        this.password = password;
    }

    public String getEmailaddress(){return emailaddress;}
    public String getPassword(){return password;}
}
