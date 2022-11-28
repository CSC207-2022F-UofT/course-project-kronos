package use_cases.user.delete_user;

import entities.UserEntity;

/**
 * use case layer
 */

public class DeleteUserDsRequestModel {
    private final UserEntity user;

    public DeleteUserDsRequestModel(UserEntity user) {
        this.user = user;
    }

    public UserEntity getUser() {
        return user;
    }
}
