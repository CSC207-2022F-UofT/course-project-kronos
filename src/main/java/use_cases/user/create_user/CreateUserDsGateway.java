package use_cases.user.create_user;


/**
 * Use case layer of the creation of user account
 */
public interface CreateUserDsGateway {

    boolean userExistsByEmail(String email);
    void save(CreateUserDsRequestModel requestModel);



}
