package use_cases.user.create_user;

import entities.CommonUser;
import entities.UserFactory;

/**
 * The Interactor that is responsible for creating a new user.
 */
public class CreateUserInteractor implements CreateUserInputBoundary{

    private final CreateUserOutputBoundary outputBoundary;
    private final UserFactory userFactory;


    public CreateUserInteractor(CreateUserOutputBoundary outputBoundary, UserFactory userfactory) {
        this.outputBoundary = outputBoundary;
        this.userFactory = userfactory;
    }

    /**
     * Create a new task based on input data.
     * @param inputData - the input data which may contain the email address and password of the user.
     * @return the output data after creation of new user.
     */

    @Override
    public CreateUserOutputData create(CreateUserInputData inputData) {
        if (userFactory.Users.containsKey(inputData.getEmailaddress())){
            CreateUserOutputData outputData = new CreateUserOutputData("User email already exists. " +
                    "Please enter a new email address.");
            return outputBoundary.prepareFailView(outputData);
        }else {
            // case when the repeated password does not match the password
            if (!inputData.getPassword().equals(inputData.getRepeatpassword())) {
                CreateUserOutputData outputData = new CreateUserOutputData("Both passwords do not match. " +
                        "Please re enter the password.");
                return outputBoundary.prepareFailView(outputData);
            }
        }

        CommonUser user = new CommonUser(inputData.getFirstname(), inputData.getLastname(),
                inputData.getEmailaddress(), inputData.getPassword());

        if (!user.passwordStrength()){
            // if the given password is not strong enough then it shows fail view
            CreateUserOutputData outputData = new CreateUserOutputData("Password is not strong enough " +
                    "Please re enter the password.");
            return outputBoundary.prepareFailView(outputData);

        }else{

            // When the Account is successfully created.
            // The new User object above is not assigned with any Categories, Tasks or Habits
            // the attributes for Categories, Habits, Tasks and Timer is null currently
            userFactory.addItem(user);
            CreateUserOutputData outputData = new CreateUserOutputData(user);
            return outputBoundary.prepareSuccessView(outputData);
        }
    }

    public CreateUserOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public UserFactory getUserFactory() {
        return userFactory;
    }
}
