package use_cases.user.delete_user;
import entities.UserFactory;

/**
 * The Interactor that is responsible for deleting a user from the collections.
 */
public class DeleteUserInteractor implements DeleteUserInputBoundary{
    private final DeleteUserOutputBoundary outputBoundary;
    private final UserFactory userFactory;

    /**
     * Constructor method for the Delete User interactor
     * @param outputBoundary obtained
     * @param users collection of the users
     */
    public DeleteUserInteractor(DeleteUserOutputBoundary outputBoundary, UserFactory users) {
        this.outputBoundary = outputBoundary;
        this.userFactory = users;
    }

    /**
     * Delete an existing user based on input data.
     * @param inputData  - the input data which contain a user object that will be deleted.
     * @return the output data after deletion.
     */
    public DeleteUserOutputData delete(DeleteUserInputData inputData) {
        String email = inputData.getUser().getEmailAddress();
        userFactory.removeItem(inputData.getUser());

        DeleteUserOutputData outputData = new DeleteUserOutputData("User " + email +
                " is deleted from the collection.", inputData.getUser());
        return outputBoundary.prepareSuccessView(outputData);


    }
    public DeleteUserOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }

    public UserFactory getUserFactory() {
        return userFactory;
    }
}
