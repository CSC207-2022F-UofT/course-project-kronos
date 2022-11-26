package use_cases.user;

import entities.User;
import entities.UserFactory;

public class ChangePassword {
    public void change(User user, UserFactory factory, String password) {
        // To change the password of the user, considering its strength
        StrengthPassword strength = new StrengthPassword();
        if(strength.passwordStrength(password)){

        }
    }
}
