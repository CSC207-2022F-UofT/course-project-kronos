package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitCollection getHabitCollection();

    boolean passwordStrength();
    boolean check_characters();


}
