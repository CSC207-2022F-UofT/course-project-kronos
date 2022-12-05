package use_cases.user.login_user;


import entities.User;

/**
 * Use case layer of the login user
 */
public interface LoginUserDsGateway {
    void loginUser(LoginUserDsRequestModel requestModel);
    boolean userExistsByEmail(String email);
    User getUser();

    boolean checkPasswordsMatch(String email, String password);
}
