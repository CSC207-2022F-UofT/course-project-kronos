package use_cases.user;

import entities.UserEntity;
import entities.UserFactory;

public class ChangePassword {
    public void change(UserEntity user, UserFactory factory, String password) {
        // To change the password of the user, considering its strength
        StrengthPassword strength = new StrengthPassword();
        if(strength.passwordStrength(password)){

        }
    }
}
