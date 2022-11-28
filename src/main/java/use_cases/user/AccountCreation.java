package use_cases.user;
import entities.*;

public class AccountCreation {
    public void CreateAccount(String email_id, String password, String first_name, String last_name,
                              UserFactory users){

        // enter the user details that is the email address, firstname lastname and all
        // check whether the email address is in the user collection or not
        // if it is there, then don't allow the account to be created
        // also checking the password strength

        if (users.Users.containsKey(email_id)){
            System.out.println("Email address already exists. Not able to create a new one");
        }else{
            StrengthPassword strength = new StrengthPassword();
            if(strength.passwordStrength(password) && first_name != null && last_name != null) {
                UserEntity user = new UserEntity(first_name, last_name, email_id, password);

                System.out.println("Account Successfully Created");
            }
        }
    }


}
