package test_use_cases;

import database.DatabaseUser;
import org.junit.jupiter.api.Test;
import use_cases.user.create_user.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestUserUserCases {
    /**
     * Test for CreateUserUseCase
     */

    @Test()
    public void create() {
        CreateUserOutputBoundary outputBoundary = new CreateUserOutputBoundary() {
            @Override
            public CreateUserOutputData prepareSuccessView(CreateUserOutputData outputData){
                assertEquals("paul", outputData.getUser().getEmailAddress());
                assertNull(outputData.getMessage()); // any creation time is fine.
                assertTrue(outputData.getIsSuccessful());
                return null;
            }

            @Override
            public CreateUserOutputData prepareFailView(CreateUserOutputData outputData){
                return null;
            }
        };
        CreateUserDsGateway databaseUser = new DatabaseUser("test.ser");

        CreateUserInputBoundary inputBoundary = new CreateUserInteractor(databaseUser);
        CreateUserInputData inputData = new CreateUserInputData("tester@gmail.com", "Tester1234",
                "test", "testagain", "Tester1234");

        CreateUserOutputData outputData = inputBoundary.create(inputData);

    }
}
