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
    private CategoryFactory categoryCollection;
    private Timer tomato;


    /**
     *
     * Creates User account if the user's account does not exist.
     * If it does, then it logs the user in and the page directs to the main page.
     *
     *  The parameters include:
     *  @param password - user password
     *  @param email_id - users email address
     *  @param first_name - user's first name
     *  @param last_name - user's last name
     */
    public CommonUser(String email_id, String password, String first_name, String last_name){
        this.emailAddress = email_id;
        this.password = password;
        this.firstName = first_name;
        this.lastName = last_name;
        this.habitCollection = new HabitFactory();
        this.taskCollection = new TaskFactory();
        this.categoryCollection = new CategoryFactory();
        this.tomato = new Timer();
    }

    /**
     * Constructor to create an empty CommonUser Object
     */

    public CommonUser(){}

    // GETTER METHODS


    /**
     * Returns the user's password
     * @return password
     */
    @Override
    public String getPassword(){
        // returns the password of the user
        return this.password;
    }

    /**
     * Returns the user's email address
     * @return email address
     */
    @Override
    public String getEmailAddress(){
        // returns the user email address
        return this.emailAddress;
    }


    /**
     * Returns the user's first name
     * @return first name
     */
    @Override
    public String getFirstName(){
        // returns the user's first name
        return this.firstName;
    }


    /**
     * Returns the user's last name
     * @return last name
     */
    @Override
    public String getLastName(){
        // returns the user's first name
        return this.lastName;
    }


    /**
     * Returns the user's collection of habits
     * @return habit_collection
     */
    @Override
    public HabitFactory getHabitCollection(){
        // returns the user's habit collection
        return this.habitCollection;
    }


    /**
     * Returns the user's collection of its categories
     * @return category_collection
     */
    @Override
    public CategoryFactory getCategoryCollection(){
        // returns the user's habit collection
        return this.categoryCollection;
    }

    /**
     * Returns the user's tasks that the user has entered
     * @return task_collection
     */
    @Override
    public TaskFactory getTaskCollection() {
        return this.taskCollection;
    }

    /**
     * Returns the user's timer object for the user's schedule
     * @return timer object
     */
    @Override
    public Timer getTomato(){
        return this.tomato;
    }


    // SETTER METHODS

    /**
     * Stores the password parameter in the User Object
     * @param password that the user stores
     */
    public void setPassword(String password){
        // returns the password of the user
        this.password = password;
    }

    /**
     * Stores the email id in the User Object
     * @param emailAddress address of the user
     */
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
        return password.length() >= 8 && check_upper() && check_digits() && check_characters();
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
