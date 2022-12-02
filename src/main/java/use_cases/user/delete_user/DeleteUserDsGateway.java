package use_cases.user.delete_user;


/**
 * Use case layer that stores the user details
 */
public interface DeleteUserDsGateway {
    void removeUser (DeleteUserDsRequestModel requestModel);
}
