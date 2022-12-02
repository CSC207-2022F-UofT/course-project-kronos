package use_cases.user.delete_user;

import entities.CommonUser;

/**
 * Request model used to pass information onto the database for delete user use case.
 */

public class DeleteUserDsRequestModel {
    private final String email;

    /**
     * Constructor of Request Model
     * @param email
     */
    public DeleteUserDsRequestModel(String email) {
        this.email = email;
    }


    public String getEmail(){return this.email;}
}
