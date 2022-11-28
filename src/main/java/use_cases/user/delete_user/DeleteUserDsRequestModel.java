package use_cases.user.delete_user;

import entities.CommonUser;

/**
 * use case layer
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
