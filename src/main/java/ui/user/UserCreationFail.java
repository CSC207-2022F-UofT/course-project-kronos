package ui.user;

public class UserCreationFail extends RuntimeException{
    public UserCreationFail(String error) {
        super(error);
    }
}
