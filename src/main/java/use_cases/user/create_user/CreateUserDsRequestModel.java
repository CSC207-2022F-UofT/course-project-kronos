package use_cases.user.create_user;

import entities.User;

public class CreateUserDsRequestModel {

    private final String emailaddress;

    private User user;


    public CreateUserDsRequestModel(String email, User user) {
        this.emailaddress = email;
        this.user = user;

    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public User getUser() {
        return this.user;
    }

    public void setPassword(User user) {
        this.user = user;
    }
}
