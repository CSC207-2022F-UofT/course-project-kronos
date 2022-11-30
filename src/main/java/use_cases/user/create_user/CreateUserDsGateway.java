package use_cases.user.create_user;


public interface CreateUserDsGateway {

    boolean existByName(String identifier);
    void save(CreateUserDsRequestModel requestModel);

}
