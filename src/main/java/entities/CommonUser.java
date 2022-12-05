package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Creates User account if the user's account does not exist.
 * If it does, then it logs the user in and the page directs to the main page.
 *
 */
public class CommonUser implements User{

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private HabitFactory habitCollection;
    private TaskFactory taskCollection;
    private CategoryCollection categoryCollection;
    private Timer tomato;


    /**
     *
     * Creates User account if the user's account does not exist.
     * If it does, then it logs the user in and the page directs to the main page.
     *
     *
     *  The parameters include:
     *  - @param password (user password)
     *  - @param emailAddress(user's email address)
 *      - @param the user's first and last name(both String type)
 *      - @param HabitFactory named habitCollection(a data that has all the habits in it)
 *      - @param TaskFactory named taskCollection(a data that has all the to-do tasks in it)
 *      - @param CategoryCollection named categoryCollection(the categories to categorize the tasks)
 *      - @param Timer named tomato
     */
    public CommonUser(String email_id, String password, String first_name, String last_name){
        this.emailAddress = email_id;
        this.password = password;
        this.firstName = first_name;
        this.lastName = last_name;
        this.habitCollection = new HabitFactory();
        this.taskCollection = new TaskFactory();
        this.categoryCollection = new CategoryCollection();
        this.tomato = new Timer();
    }

    public CommonUser(){}

    public CommonUser(String s, String s1, String harry, String potter, HabitFactory hFactory, TaskFactory tFactory, CategoryCollection cFactory, Timer t) {
    }


    // GETTER METHODS

    @Override
    public String getPassword(){
        // returns the password of the user
        return this.password;
    }

    @Override
    public String getEmailAddress(){
        // returns the user email address
        return this.emailAddress;
    }

    @Override
    public String getFirstName(){
        // returns the user's first name
        return this.firstName;
    }

    @Override
    public String getLastName(){
        // returns the user's first name
        return this.lastName;
    }

    @Override
    public HabitFactory getHabitCollection(){
        // returns the user's habit collection
        return this.habitCollection;
    }

    // SETTER METHODS

    public void setPassword(String password){
        // returns the password of the user
        this.password = password;
    }

    public void setEmailAddress(String emailAddress){
        // returns the password of the user
        this.emailAddress = emailAddress;
    }

    public void setFirstName(String firstName){
        // returns the password of the user
        this.firstName = firstName;
    }

    public void setLastName(String LastName){
        // returns the password of the user
        this.lastName = LastName;
    }

    // Strength of the Password
    public boolean passwordStrength(){
        if(password.length() >=8 && check_upper() && check_digits() && check_characters()){
            return true;
        }
        return false;
    }

    public boolean check_upper(){
        // checks if there is at least one upper case letter
        boolean b = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                b = true;
            }
        }
        return b;
    }

    public boolean check_digits(){
        // checks if there is at least one digit
        boolean b = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                b = true;
            }
        }
        return b;
    }

    public boolean check_characters(){
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
