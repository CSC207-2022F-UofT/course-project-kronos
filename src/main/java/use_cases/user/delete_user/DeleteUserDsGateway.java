package use_cases.user.delete_user;


/**
 * use case layer
 */
public interface DeleteUserDsGateway {
    void removeUser (DeleteUserDsRequestModel requestModel);
}
