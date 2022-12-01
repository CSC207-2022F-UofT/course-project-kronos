package use_cases.user.login_user;

import entities.UserFactory;

/**
 * The Interactor that is responsible for logging a user into its account.
 */
public class LoginUserInteractor implements LoginUserInputBoundary{
    private final LoginUserOutputBoundary outputBoundary;
    private final UserFactory userFactory;

    public LoginUserInteractor(LoginUserOutputBoundary outputBoundary, UserFactory users) {
        this.outputBoundary = outputBoundary;
        this.userFactory = users;
    }

    /**
     * Logging an existing user based on input data.
     * @param inputData  - the input data which contain a user object that will be checked to log in.
     * @return the output data after logging in.
     */
    @Override
    public LoginUserOutputData login(LoginUserInputData inputData){
        if (userFactory.Users.containsKey(inputData.getEmailaddress())){
            // case if the email and the password matches the information in the hash map
            if (inputData.getPassword().equals(userFactory.Users.get(inputData.getEmailaddress()).getPassword())){
                LoginUserOutputData outputData = new LoginUserOutputData(inputData.getEmailaddress(),
                        inputData.getUser());
                return outputBoundary.prepareSuccessView(outputData);
            }else{
                // case when the email exists but the password does not match the User object's password
                LoginUserOutputData outputData = new LoginUserOutputData("Error, try again!",
                        inputData.getEmailaddress(), inputData.getUser());
                return outputBoundary.prepareFailView(outputData);
            }
        }else{
            // case when the email does not exist in the collection
            LoginUserOutputData outputData = new LoginUserOutputData("Email does not exist, try again!",
                    inputData.getEmailaddress(), inputData.getUser());
            return outputBoundary.prepareFailView(outputData);
        }
    }

    public LoginUserOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public UserFactory getUserFactory() {
        return userFactory;
    }
}