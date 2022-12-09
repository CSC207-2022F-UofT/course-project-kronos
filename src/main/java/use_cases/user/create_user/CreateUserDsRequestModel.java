package use_cases.user.create_user;

import entities.User;

/**
 * Use case database request model
 * It is a use case layer
 *
 * @author happynasit
 */
public class CreateUserDsRequestModel {

    private final String emailAddress;

    private User user;

    /**
     * Constructor method for User database request model
     * @param email - user's email address
     * @param user - user's user object
     */
    public CreateUserDsRequestModel(String email, User user) {
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
     *
     */
    public User getUser() {
        return this.user;
    }

    /**
     * @param user -  the user's user object
     */
    public void setUser(User user) {
        this.user = user;
    }

}
