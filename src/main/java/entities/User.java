package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitFactory getHabitCollection();

    CategoryFactory getCategoryCollection();

    TaskFactory getTaskCollection();

    Timer getTomato();

    boolean passwordStrength();
    boolean check_characters();


}
