package entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public class User implements Serializable {
    /**
     *
     * Creates User account if the user's account does not exist.
     * If it does, then it logs the user in and the page directs to the main page.
     *
     *
     *  The parameters include:
     *      - @param password (user password)
     *      - @param emailAddress(user's email address)
     *      - @param the user's first and last name(both String type)
     *      - @param HabitFactory named habitCollection(a data that has all the habits in it)
     *      - @param TaskFactory named taskCollection(a data that has all the to-do tasks in it)
     *      - @param CategoryFactory named categoryCollection(the categories to categorize the tasks)
     *      - @param Timer named tomato
     */
    private String emailAddress;
    private String password;
    private String firstName;
    private String lastName;
    private HabitFactory habitCollection;
    private TaskFactory taskCollection;
    private CategoryFactory categoryCollection;
    private Timer tomato;


    public User(String email_id, String password, String first_name, String last_name,
                HabitFactory habits, TaskFactory tasks, CategoryFactory categories, Timer timer){
        this.emailAddress = email_id;
        this.password = password;
        this.firstName = first_name;
        this.lastName = last_name;
        this.habitCollection = habits;
        this.taskCollection = tasks;
        this.categoryCollection = categories;
        this.tomato = timer;
    }

    public User() {}

    // GETTER METHODS

    public String getPassword(){
        // returns the password of the user
        return this.password;
    }

    public String getEmailAddress(){
        // returns the user email address
        return this.emailAddress;
    }

    public String getFirstName(){
        // returns the user's first name
        return this.firstName;
    }

    public String getLastName(){
        // returns the user's first name
        return this.lastName;
    }

    public HabitFactory getHabitCollection(){
        // returns the users habits
        return this.habitCollection;
    }

    public CategoryFactory getCategoryCollection(){
        // returns the users tasks
        return this.categoryCollection;
    }

    public TaskFactory getTaskCollection(){
        // returns the users tasks
        return this.taskCollection;
    }

    public Timer getTomato(){
        // returns the users tasks
        return this.tomato;
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

}
