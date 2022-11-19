package user_use_cases;
import entities.User;
import entities.UserFactory;
import java.util.Objects;

public class LoginAccount {

    public void main(UserFactory users, String email, String password){
        // logs into the account
        if (users.Users.containsKey(email)){
            User info_user = users.Users.get(email);
            // then checks if the password matches the value

            if(Objects.equals(password, info_user.getPassword())){
                System.out.println("Login Successful");
            }else{
                System.out.println("Wrong Password, try again");
            }


        }else{
            System.out.println("email address does not exist.");
        }

    }


}
