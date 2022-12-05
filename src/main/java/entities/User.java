package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitFactory getHabitCollection();
    CategoryCollection getCategoryCollection();

    CategoryCollection getCategoryCollection();

    TaskFactory getTaskCollection();

    Timer getTomato();

    boolean passwordStrength();


}
