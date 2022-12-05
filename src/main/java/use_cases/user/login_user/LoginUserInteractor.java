package use_cases.user.login_user;


import database.DatabaseUser;

/**
 * The Interactor that is responsible for logging a user into its account.
 */
public class LoginUserInteractor implements LoginUserInputBoundary{
    private final LoginUserOutputBoundary outputBoundary;
    private final DatabaseUser databaseUser;
    private final LoginUserDsGateway gateway;

    /**
     * Constructor method for the LoginUserInteractor
     *
     * @param outputBoundary obtained
     * @param databaseUser of the user
     * @param gateway of the user
     */
    public LoginUserInteractor(LoginUserOutputBoundary outputBoundary, DatabaseUser databaseUser,
                               LoginUserDsGateway gateway) {
        this.outputBoundary = outputBoundary;
        this.databaseUser = databaseUser;
        this.gateway = gateway;
    }

    /**
     * Logging an existing user based on input data.
     * @param inputData  - the input data which contain a user object that will be checked to log in.
     * @return the output data after logging in.
     */
    @Override
    public LoginUserOutputData login(LoginUserInputData inputData){
        if (gateway.userExistsByEmail(inputData.getEmailAddress())){
            // case if the email and the password matches the information in the hash map
            if (databaseUser.checkPasswordsMatch(inputData.getEmailAddress(), inputData.getPassword())){

                LoginUserDsRequestModel requestModel = new LoginUserDsRequestModel(inputData.getEmailAddress(),
                        inputData.getPassword());
                gateway.loginUser(requestModel);

                LoginUserOutputData outputData = new LoginUserOutputData(inputData.getEmailAddress(),
                        inputData.getUser());
                return outputBoundary.prepareSuccessView(outputData);
            }else{
                // case when the email exists but the password does not match the User object's password
                LoginUserOutputData outputData = new LoginUserOutputData("Error, try again!",
                        inputData.getEmailAddress(), inputData.getUser());
                return outputBoundary.prepareFailView(outputData);
            }
        }else{
            // case when the email does not exist in the collection
            LoginUserOutputData outputData = new LoginUserOutputData("Email does not exist, try again!",
                    inputData.getEmailAddress(), inputData.getUser());
            return outputBoundary.prepareFailView(outputData);
        }
    }

    /**
     *
     * @return the success view or fail view
     */
    public LoginUserOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }


    /**
     * @return the database gateway
     */
    public LoginUserDsGateway getGateway(){return gateway;}
}
