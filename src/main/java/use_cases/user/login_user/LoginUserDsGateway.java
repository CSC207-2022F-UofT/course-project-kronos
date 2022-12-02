package use_cases.user.login_user;

/**
 * Interface used to store the user details
 */
public interface LoginUserDsGateway {
    void save(LoginUserDsRequestModel requestModel);
}
