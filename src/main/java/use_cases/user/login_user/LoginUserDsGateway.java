package use_cases.user.login_user;


import entities.User;

public interface LoginUserDsGateway {
    void loginUser(LoginUserDsRequestModel requestModel);

    User getUser();
}
