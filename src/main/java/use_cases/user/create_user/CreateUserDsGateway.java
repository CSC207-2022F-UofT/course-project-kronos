package use_cases.user.create_user;

/**
 * interface used to store the user details
 */
public interface CreateUserDsGateway {
    void save(CreateUserDsRequestModel requestModel);

}
