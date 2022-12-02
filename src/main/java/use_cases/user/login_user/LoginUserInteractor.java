package use_cases.user.login_user;

import database.Database;
import entities.UserFactory;

/**
 * The Interactor that is responsible for logging a user into its account.
 */
public class LoginUserInteractor implements LoginUserInputBoundary{
    private final LoginUserOutputBoundary outputBoundary;
    private final Database database;

    /**
     * Constructor method for the LoginUserInteractor
     * @param outputBoundary obtained
     * @param database of the user
     */
    public LoginUserInteractor(LoginUserOutputBoundary outputBoundary, Database database) {
        this.outputBoundary = outputBoundary;
        this.database = database;
    }

    /**
     * Logging an existing user based on input data.
     * @param inputData  - the input data which contain a user object that will be checked to log in.
     * @return the output data after logging in.
     */
    @Override
    public LoginUserOutputData login(LoginUserInputData inputData){
        if (database.CheckUserExists(inputData.getEmailaddress())){
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
