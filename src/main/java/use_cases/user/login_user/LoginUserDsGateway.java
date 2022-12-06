package use_cases.user.login_user;


import entities.CommonUser;

/**
 * Use case layer of the login user
 */
public interface LoginUserDsGateway {
    void loginUser(LoginUserDsRequestModel requestModel);
    boolean userExistsByEmail(String email);
    CommonUser getUser();
    CommonUser getCurrUser(String email);

    boolean checkPasswordsMatch(String email, String password);
}
