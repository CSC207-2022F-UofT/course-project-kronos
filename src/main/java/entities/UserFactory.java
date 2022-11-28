package entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

public class UserFactory extends Factory<UserEntity> implements Serializable {
    public HashMap<String, UserEntity> Users;


    public UserFactory(UserEntity user){
        super();
        Users.put(user.getEmailAddress(), user);
    }

    @Override
    public void addItem(UserEntity user) {
        Users.put(user.getEmailAddress(), user);
    }

    @Override
    public void removeItem(UserEntity user) {
        Users.remove(user.getEmailAddress());
    }

    public HashMap<String, UserEntity> getUsers(){
        // getter method to return
        return this.Users;
    }

    public Set<String> getkeys(){
        // getter method to return
        return this.getUsers().keySet();
    }

}
