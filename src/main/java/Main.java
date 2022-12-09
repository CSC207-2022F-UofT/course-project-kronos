import controllers.users.CreateUserController;
import controllers.users.LoginUserController;
import database.DatabaseUser;
import ui.users.LoginUserUI;
import use_cases.user.create_user.CreateUserInputBoundary;
import use_cases.user.create_user.CreateUserInteractor;
import use_cases.user.login_user.LoginUserInputBoundary;
import use_cases.user.login_user.LoginUserInteractor;

import javax.swing.*;

/**
 * Main program
 */
public class Main extends JFrame{

    public Main(){

        String fileName = "data.ser";

        DatabaseUser databaseUser;
        databaseUser = new DatabaseUser(fileName);
        LoginUserInputBoundary loginUserInteractor = new LoginUserInteractor(databaseUser, databaseUser);
        CreateUserInputBoundary createUserInteractor = new CreateUserInteractor(databaseUser);

        CreateUserController createUserController = new CreateUserController(createUserInteractor);
        LoginUserController loginUserController = new LoginUserController(loginUserInteractor);

        LoginUserUI loginPageUI = new LoginUserUI(loginUserController, databaseUser, createUserController);
        loginPageUI.main();
        loginPageUI.setVisible(true);

    }
    public static void main(String[] args){
        Main mainFile = new Main();
        mainFile.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFile.setVisible(true);
    }

}
