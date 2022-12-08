package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitFactory getHabitCollection();

    CategoryCollection getCategoryCollection();

    TimerTomato getTomato();

    void setTomato(TimerTomato tomato);

    boolean passwordStrength();


}
