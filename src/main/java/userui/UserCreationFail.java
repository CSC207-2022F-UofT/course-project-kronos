package userui;

public class UserCreationFail extends RuntimeException{
    public UserCreationFail(String error) {
        super(error);
    }
}
