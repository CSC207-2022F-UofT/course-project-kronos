package use_cases.user.delete_user;


/**
 * Use case layer that removes the user
 */
public interface DeleteUserDsGateway {
    void removeUser(DeleteUserDsRequestModel requestModel);
}
