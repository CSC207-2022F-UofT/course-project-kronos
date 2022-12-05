package use_cases.user.create_user;

import entities.CommonUser;
import entities.User;

/**
 * Use case database request model
 * It is a use case layer
 *
 * @author happynasit
 */
public class CreateUserDsRequestModel {

    private final String emailAddress;

    private CommonUser user;

    /**
     * Constructor method for User database request model
     * @param email - user's email address
     * @param user - user's user object
     */
    public CreateUserDsRequestModel(String email, CommonUser user) {
        this.emailAddress = email;
        this.user = user;

    }

    /**
     * @return the user's email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @return the user's user object
     */
    public User getUser() {
        return this.user;
    }

    /**
     * @param user -  the user's user object
     */
    public void setPassword(CommonUser user) {
        this.user = user;
    }
}
