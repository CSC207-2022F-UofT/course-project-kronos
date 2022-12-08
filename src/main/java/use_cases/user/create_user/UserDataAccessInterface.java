package use_cases.user.create_user;

import entities.CommonUser;
import entities.User;

public interface UserDataAccessInterface {
    // Check that user exists in Database
    public abstract boolean CheckUserExists(String emailAddress);

    // Login the user, all factories available if user is logged in
    public abstract CommonUser LoginUser(String emailAddress, String password);

    // Update the database with new user object if
    public abstract void UpdateUser(CommonUser user);

    User GetUser();

    void UpdateUser(User user);

    // Delete user from database
    public abstract void DeleteUser(String emailAddress);

    // Add user to database
    public abstract void AddUser(CommonUser user);

    void AddUser(User user);
}
