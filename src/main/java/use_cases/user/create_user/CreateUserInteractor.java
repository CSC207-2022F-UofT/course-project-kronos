package use_cases.user.create_user;

import entities.CommonUser;

/**
 * The Interactor that is responsible for creating a new user.
 */
public class CreateUserInteractor implements CreateUserInputBoundary{

    private final CreateUserOutputBoundary outputBoundary;
    private final CreateUserDsGateway gateway;

    /**
     * Constructor method for CreateUserInteractor
     *
     * @param outputBoundary obtained
     * @param gateway of the user
     */
    public CreateUserInteractor(CreateUserOutputBoundary outputBoundary, CreateUserDsGateway gateway) {
        this.outputBoundary = outputBoundary;
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
            CreateUserOutputData outputData = new CreateUserOutputData("User email already exists. " +
                    "Please enter a new email address.");
            return outputBoundary.prepareFailView(outputData);
        }else {
            // case when the repeated password does not match the password
            if (!inputData.getPassword().equals(inputData.getRepeatPassword())) {
                CreateUserOutputData outputData = new CreateUserOutputData("Both passwords do not match. " +
                        "Please re enter the password.");
                return outputBoundary.prepareFailView(outputData);
            }
        }

        CommonUser user = new CommonUser(inputData.getFirstName(), inputData.getLastName(),
                inputData.getEmailAddress(), inputData.getPassword());

        if (!user.passwordStrength()){
            // if the given password is not strong enough then it shows fail view
            CreateUserOutputData outputData = new CreateUserOutputData("Password is not strong enough " +
                    "Please re enter the password.");
            return outputBoundary.prepareFailView(outputData);

        }else{

            // When the Account is successfully created.
            // it creates the database request model and the gateway saves the email along with the user object
            CreateUserDsRequestModel userDsRequestModel = new CreateUserDsRequestModel(inputData.getEmailAddress(), user);
            gateway.save(userDsRequestModel);
            CreateUserOutputData outputData = new CreateUserOutputData(user);
            return outputBoundary.prepareSuccessView(outputData);
        }
    }

    /**
     *
     * @return the success view or the fail view
     */
    public CreateUserOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    /**
     * @return the database gateway
     */
    public CreateUserDsGateway getGateway(){return gateway;}
}
