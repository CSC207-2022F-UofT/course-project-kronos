package use_cases.user.create_user;


/**
 * It has the user's information when the user first creates account.
 */
public class CreateUserInputData {

    private final String emailAddress;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String repeatPassword;

    /**
     * Constructor for a CreateUserInputData object.
     * @param emailAddress - the input email address
     * @param password - the input password
     * @param firstName - the input first name
     * @param lastName - the input last name
     * @param repeatPassword - repeat the password
     */
    public CreateUserInputData(String emailAddress, String password, String firstName, String lastName, String repeatPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    /**
     * @return the email address attribute of a CreateUserInputData object.
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * @return the firstname attribute of a CreateUserInputData object.
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * @return the lastname attribute of a CreateUserInputData object.
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * @return the password attribute of a CreateUserInputData object.
     *
     */
    public String getPassword() {return password;}


    /**
     * @return the repeated password attribute of a CreateUserInputData object. The repeated password is the password
     * that is entered again.
     *
     */
    public String getRepeatPassword() {return repeatPassword;}
}
