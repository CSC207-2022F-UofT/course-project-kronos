package use_cases.user.delete_user;

/**
 * Request model used to pass information onto the database for delete user use case.
 */

public class DeleteUserDsRequestModel {
    private String email;

    /**
     * Constructor of Request Model
     * @param email
     */
    public DeleteUserDsRequestModel(String email) {
        this.email = email;
    }

    /**
     *
     * @return email address of user to be deleted
     */
    public String getEmail(){return this.email;}

    /**
     *
     * @param email email address of user to be deleted
     */
    public void setEmail(String email){this.email = email;}
}
