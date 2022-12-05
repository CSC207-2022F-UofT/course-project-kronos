package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitFactory getHabitCollection();
    CategoryCollection getCategoryCollection();

    boolean passwordStrength();
    boolean check_characters();


}
