package use_cases.user;

import entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Checks the password strength
 * A password is a strong password if it:
 * - has minimum 8 letters
 * - the alphabet must be between a-z
 * - At least 1 should be UPPER CASE LETTER (A-Z)
 * - At least 1 should be DIGITS(0-9)
 * - At least 1 character from [ _ , @ , $ ]
 *
 *
 */
public class StrengthPassword {
    public boolean passwordStrength(String password){

        if(password.length() >=8 && check_upper(password) && check_digits(password) && check_characters(password)){
            System.out.println("Password valid");
            return true;
        }

        return false;
    }

    public boolean check_upper(String password){
        // checks if there is at least one upper case letter
        boolean b = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                b = true;
            }
        }
        return b;
    }

    public boolean check_digits(String password){
        // checks if there is at least one digit
        boolean b = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                b = true;
            }
        }
        return b;
    }

    public boolean check_characters(String password){
        // checks if there is at least one character from [ _ , @ , $ ]
        List<Character> arr = new ArrayList<Character>();
        arr.add('_');
        arr.add('@');
        arr.add('$');
        boolean b = false;
        for (int i = 0; i < password.length(); i++){
            if (arr.contains(password.charAt(i))) {
                b = true;
                break;
            }
        }
        return b;
    }
}
