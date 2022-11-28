package entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

public class UserFactory extends Factory<CommonUser> implements Serializable {
    public HashMap<String, CommonUser> Users;


    public UserFactory(CommonUser user){
        super();
        Users.put(user.getEmailAddress(), user);
    }

    @Override
    public void addItem(CommonUser user) {
        Users.put(user.getEmailAddress(), user);
    }

    @Override
    public void removeItem(CommonUser user) {
        Users.remove(user.getEmailAddress());
    }

    public HashMap<String, CommonUser> getUsers(){
        // getter method to return
        return this.Users;
    }

    public Set<String> getkeys(){
        // getter method to return
        return this.getUsers().keySet();
    }

}
