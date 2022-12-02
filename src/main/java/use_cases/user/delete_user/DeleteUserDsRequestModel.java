package use_cases.user.delete_user;

import entities.CommonUser;

/**
 * A use case layer that requires only the user class since this use case deletes the user from the database.
 */

public class DeleteUserDsRequestModel {
    private final CommonUser user;

    public DeleteUserDsRequestModel(CommonUser user) {
        this.user = user;
    }

    public CommonUser getUser() {
        return user;
    }
}
