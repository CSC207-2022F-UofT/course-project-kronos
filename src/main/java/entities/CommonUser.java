package entities;

import java.io.Serializable;
import java.util.Timer;

/**
 *
 * Creates User account if the user's account does not exist.
 * If it does, then it logs the user in and the page directs to the main page.
 *
 */
public class CommonUser implements User, Serializable{

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private HabitFactory habitCollection;
    private CategoryCollection categoryCollection;
    private TimerTomato tomato;


    /**
     *
     * Creates User account if the user's account does not exist.
     * If it does, then it logs the user in and the page directs to the main page.
     *  The parameters include:
     *  @param password - the user's password
     *  @param email_id - of the user
     *  @param first_name of the user
     *  @param last_name of the user
     */
    public CommonUser(String email_id, String password, String first_name, String last_name){
        this.emailAddress = email_id;
        this.password = password;
        this.firstName = first_name;
        this.lastName = last_name;
        this.habitCollection = new HabitFactory();
        this.categoryCollection = new CategoryCollection();
        this.tomato = new TimerTomato();
    }

    public CommonUser(){}


    // GETTER METHODS

    /**
     * @return the user's password
     */
    @Override
    public String getPassword(){
        // returns the password of the user
        return this.password;
    }

    /**
     * @return the user's email address
     */
    @Override
    public String getEmailAddress(){
        // returns the user email address
        return this.emailAddress;
    }

    /**
     * @return the user's first name
     */
    @Override
    public String getFirstName(){
        // returns the user's first name
        return this.firstName;
    }

    /**
     * @return the user's last name
     */
    @Override
    public String getLastName(){
        // returns the user's first name
        return this.lastName;
    }

    /**
     * @return the user's collection of habits
     */
    @Override
    public HabitFactory getHabitCollection(){
        // returns the user's habit collection
        return this.habitCollection;
    }

    /**
     * @return the user's collection of categories
     */
    @Override
    public CategoryCollection getCategoryCollection() {
        return this.categoryCollection;
    }

    /**
     * @return the user's timer object
     */
    @Override
    public TimerTomato getTomato() {
        return this.tomato;
    }

    @Override
    public void setTomato(TimerTomato tomato) {
        this.tomato = tomato;
    }

    // SETTER METHODS

    /**
     * sets the password in the object
     * @param password that the user wants to set
     */
    public void setPassword(String password){
        // returns the password of the user
        this.password = password;
    }

    /**
     * sets the email address in the object
     * @param emailAddress that the user wants to set
     */
    public void setEmailAddress(String emailAddress){
        // returns the password of the user
        this.emailAddress = emailAddress;
    }

    /**
     * sets the password in the object
     * @param firstName that the user wants to set
     */
    public void setFirstName(String firstName){
        // returns the password of the user
        this.firstName = firstName;
    }

    /**
     * setter method that sets the last name
     * @param lastname of the user
     */
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    /**
     * A password is a strong password when it has at least one uppercase character, one digit and the password's
     * length is more than or equal to 5
     * @return the boolean value of whether the password is valid or not
     */
    // Strength of the Password
    public boolean passwordStrength(){
        return password.length() >= 5 && check_upper() && check_digits();
    }

    /**
     * @return if the password has at least one upper case
     */
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

    /**
     * @return if the password has at least one digit
     */
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
}
