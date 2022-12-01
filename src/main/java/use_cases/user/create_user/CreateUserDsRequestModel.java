package use_cases.user.create_user;

public class CreateUserDsRequestModel {

    private final String emailaddress;
    private String password;


    public CreateUserDsRequestModel(String email, String password) {
        this.emailaddress = email;
        this.password = password;

    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
