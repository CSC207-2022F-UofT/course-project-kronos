package use_cases.user.delete_user;

/**
 * The Interactor that is responsible for deleting a user from the collections.
 */
public class DeleteUserInteractor implements DeleteUserInputBoundary{
    private final DeleteUserOutputBoundary outputBoundary;
    private final DeleteUserDsGateway gateway;
    /**
     * Constructor method for the Delete User interactor
     *
     * @param outputBoundary obtained
     * @param gateway of the user
     */
    public DeleteUserInteractor(DeleteUserOutputBoundary outputBoundary, DeleteUserDsGateway gateway){
        this.outputBoundary = outputBoundary;
        this.gateway = gateway;
    }

    /**
     * Delete an existing user based on input data.
     * @param inputData  - the input data which contain a user object that will be deleted.
     * @return the output data after deletion.
     */
    public DeleteUserOutputData delete(DeleteUserInputData inputData) {
        String email = inputData.getUser().getEmailAddress();

        DeleteUserDsRequestModel requestModel = new DeleteUserDsRequestModel(inputData.getUser().getEmailAddress());
        gateway.removeUser(requestModel);

        DeleteUserOutputData outputData = new DeleteUserOutputData("User " + email +
                " is deleted from the collection.", inputData.getUser());
        return outputBoundary.prepareSuccessView(outputData);
    }
    public DeleteUserOutputBoundary getOutputBoundary() {
        return outputBoundary;
    }
}
