package use_cases.user.create_user;

import entities.CommonUser;

/**
 * The Interactor that is responsible for creating a new user.
 * @author happynasit
 */
public class CreateUserInteractor implements CreateUserInputBoundary{
    private final CreateUserDsGateway gateway;

    /**
     * Constructor method for CreateUserInteractor
     * @param gateway of the user
     */
    public CreateUserInteractor(CreateUserDsGateway gateway) {
        this.gateway = gateway;
    }

    /**
     * Create a new task based on input data.
     * @param inputData - the input data which may contain the email address and password of the user.
     * @return the output data after creation of new user.
     */

    @Override
    public CreateUserOutputData create(CreateUserInputData inputData) {
        if (gateway.userExistsByEmail(inputData.getEmailAddress())){
            return new CreateUserOutputData(false, "Username already exists!");
        }
        // case when the repeated password does not match the password
        if (!inputData.getPassword().equals(inputData.getRepeatPassword())) {
            return new CreateUserOutputData(false, "Both passwords do not match");
        }

        CommonUser user = new CommonUser(inputData.getFirstName(), inputData.getLastName(),
                inputData.getEmailAddress(), inputData.getPassword());

        if (!user.passwordStrength()){
            // if the given password is not strong enough then it shows fail view
            return new CreateUserOutputData(false, "The password is not strong enough");

        }else{

            // When the Account is successfully created.
            // it creates the database request model and the gateway saves the email along with the user object
            CreateUserDsRequestModel userDsRequestModel = new CreateUserDsRequestModel(inputData.getEmailAddress(), user);
            gateway.save(userDsRequestModel);
            return new CreateUserOutputData(true, user);
        }
    }


    /**
     * @return the database gateway
     */
    public CreateUserDsGateway getGateway(){return gateway;}
}
