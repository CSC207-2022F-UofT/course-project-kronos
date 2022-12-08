package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitFactory getHabitCollection();

    CategoryCollection getCategoryCollection();

    TaskFactory getTaskCollection();

    TimerTomato getTomato();

    void setTomato(TimerTomato timerTomato);
    boolean passwordStrength();



}
