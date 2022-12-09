package test_use_cases;

import database.DatabaseUser;
import org.junit.jupiter.api.Test;
import use_cases.user.create_user.*;
import use_cases.user.login_user.*;

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
                assertFalse(outputData.getIsSuccessful());
                return null;
            }
        };
        CreateUserDsGateway databaseUser = new DatabaseUser("test.ser");

        CreateUserInputBoundary inputBoundary = new CreateUserInteractor(databaseUser);
        CreateUserInputData inputData = new CreateUserInputData("tester@gmail.com", "Tester1234",
                "test", "testagain", "Tester1234");

        CreateUserOutputData outputData = inputBoundary.create(inputData);
        outputBoundary.prepareFailView(outputData);

    }

    @Test()
    public void login() {
        LoginUserOutputBoundary outputBoundary = new LoginUserOutputBoundary() {
            @Override
            public LoginUserOutputData prepareSuccessView(LoginUserOutputData outputData){
                assertEquals("tester@gmail.com", outputData.getUser().getEmailAddress());
                assertNull(outputData.getMessage()); // any creation time is fine.
                assertTrue(outputData.getIsLoginSuccessful());
                return null;
            }

            @Override
            public LoginUserOutputData prepareFailView(LoginUserOutputData outputData){
                assertFalse(outputData.getIsLoginSuccessful());
                return null;
            }
        };
        LoginUserDsGateway databaseUser = new DatabaseUser("data.ser");
        DatabaseUser databaseUser1 = new DatabaseUser("data.ser");

        LoginUserInputBoundary inputBoundary = new LoginUserInteractor(databaseUser1, databaseUser);
        LoginUserInputData inputData = new LoginUserInputData("tester@gmail.com", "Tester1234");

        LoginUserOutputData outputData = inputBoundary.login(inputData);
        outputBoundary.prepareSuccessView(outputData);

    }

}
