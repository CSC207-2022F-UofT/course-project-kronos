package use_cases.user.login_user;


import entities.User;

public interface LoginUserDsGateway {
    void loginUser(LoginUserDsRequestModel requestModel);
    boolean userExistsByEmail(String email);
    User getLoggedInUser();

    boolean checkPasswordsMatch(String email, String password);

    User getUserByEmail(String email);
}
