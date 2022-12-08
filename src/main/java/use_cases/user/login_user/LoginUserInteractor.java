package use_cases.user.login_user;


import database.DatabaseUser;
import entities.CommonUser;

/**
 * The Interactor that is responsible for logging a user into its account.
 */
public class LoginUserInteractor implements LoginUserInputBoundary{
    private final DatabaseUser databaseUser;
    private final LoginUserDsGateway gateway;

    /**
     * Constructor method for the LoginUserInteractor

     * @param databaseUser of the user
     * @param gateway of the user
     */
    public LoginUserInteractor(DatabaseUser databaseUser, LoginUserDsGateway gateway) {
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
        if(inputData.getEmailAddress().equals("")){
            return new LoginUserOutputData(false, "Invalid Email Address");
        }
        if (!gateway.userExistsByEmail(inputData.getEmailAddress())){
            // case when the email does not exist in the collection
            return new LoginUserOutputData(false, "Email Address does not exist");
        }

        // case when the passwords do not match
        if (!databaseUser.checkPasswordsMatch(inputData.getEmailAddress(), inputData.getPassword())){
            return new LoginUserOutputData(false, "Password does not match");
        }

        // case if the email and the password matches the information in the hash map
        if(gateway.userExistsByEmail(inputData.getEmailAddress())){
            if (databaseUser.checkPasswordsMatch(inputData.getEmailAddress(), inputData.getPassword())){

                CommonUser loggedInUser = gateway.getUserByEmail(inputData.getEmailAddress());
                return new LoginUserOutputData(true, inputData.getEmailAddress(), loggedInUser);
            }
        }
        return null;
    }

    /**
     * @return the database gateway
     */
    public LoginUserDsGateway getGateway(){return gateway;}
}
