package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitFactory getHabitCollection();

    CategoryCollection getCategoryCollection();

    TaskFactory getTaskCollection();

    Timer getTomato();

    boolean passwordStrength();
    boolean check_characters();


}
