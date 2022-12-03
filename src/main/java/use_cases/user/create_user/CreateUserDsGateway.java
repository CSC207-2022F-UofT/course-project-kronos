package use_cases.user.create_user;


public interface CreateUserDsGateway {

    boolean userExistsByEmail(String email);
    void save(CreateUserDsRequestModel requestModel);



}
