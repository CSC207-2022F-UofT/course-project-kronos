package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitCollection getHabitCollection();

    CategoryCollection getCategoryCollection();

    TaskCollection getTaskCollection();

    TimerTomato getTomato();

    void setTomato(TimerTomato timerTomato);
    boolean passwordStrength();



}
