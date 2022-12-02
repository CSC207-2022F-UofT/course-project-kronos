package use_cases.user.create_user;


public interface CreateUserDsGateway {

    boolean userExistByEmail(String email);
    void save(CreateUserDsRequestModel requestModel);



}
