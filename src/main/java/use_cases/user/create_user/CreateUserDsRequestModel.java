package use_cases.user.create_user;

/**
 * A use case layer that stores the user's information while creating the account
 * This method is used in the interactor to save using the DsGateway.
 */
public class CreateUserDsRequestModel {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private String password;

    /**
     * Constructor method to create the request model
     * @param firstName of the user
     * @param lastName of the user
     * @param email of the user
     * @param password of the user
     */

    public CreateUserDsRequestModel(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = email;
        this.password = password;
    }

    /**
     * returns the user's first name
     * @return first name of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * returns the user's last name
     * @return last name of the user
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * returns the user's email address
     * @return email address of the user
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * returns the user's password
     * @return password of the user
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
