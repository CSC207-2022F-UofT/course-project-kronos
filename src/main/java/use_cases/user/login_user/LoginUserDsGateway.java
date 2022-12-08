package use_cases.user.login_user;


import entities.CommonUser;

/**
 * Use case layer of the login user
 */
public interface LoginUserDsGateway {
    void loginUser(LoginUserDsRequestModel requestModel);
    boolean userExistsByEmail(String email);
    CommonUser getUser();

    CommonUser getLoggedInUser();

    boolean checkPasswordsMatch(String email, String password);

    CommonUser getUserByEmail(String email);
}
