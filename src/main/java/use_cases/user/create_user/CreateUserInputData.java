package use_cases.user.create_user;


public class CreateUserInputData {

    private final String emailaddress;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String repeatpassword;

    /**
     * Constructor for a CreateUserInputData object.
     * @param emailaddress - the input email address
     * @param password - the input password
     * @param firstname - the input first name
     * @param lastname - the input last name
     * @param repeatpassword - repeat the password
     */
    public CreateUserInputData(String emailaddress, String password, String firstname, String lastname, String repeatpassword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailaddress = emailaddress;
        this.password = password;
        this.repeatpassword = repeatpassword;
    }

    /**
     * @return the email address attribute of a CreateUserInputData object.
     */
    public String getEmailaddress() {
        return emailaddress;
    }


    /**
     * @return the firstname attribute of a CreateUserInputData object.
     */
    public String getFirstname() {
        return firstname;
    }


    /**
     * @return the lastname attribute of a CreateUserInputData object.
     */
    public String getLastname() {
        return lastname;
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
    public String getRepeatpassword() {return repeatpassword;}
}
