package entities;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

public class UserFactory extends Factory implements Serializable {
    public HashMap<String,User> Users;


    public UserFactory(User user){
        super();
        Users.put(user.getEmailAddress(), user);
    }

    public void addItem(User user) {
        Users.put(user.getEmailAddress(), user);
    }
    public HashMap<String, User> getUsers(){
        // getter method to return
        return this.Users;
    }

    public Set<String> getkeys(){
        // getter method to return
        return this.getUsers().keySet();
    }


}