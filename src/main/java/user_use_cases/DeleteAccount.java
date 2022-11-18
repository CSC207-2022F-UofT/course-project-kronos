package user_use_cases;
import entities.User;
import entities.UserFactory;

public class DeleteAccount {
    public void delete(User user, UserFactory factory) {
        // To delete the user's account from the app
        factory.Users.remove(user.getEmailAddress());
    }
}
