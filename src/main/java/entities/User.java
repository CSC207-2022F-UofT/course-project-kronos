package entities;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitCollection getHabitCollection();

    CategoryCollection getCategoryCollection();

    TaskCollection getTaskCollection();

    void setTomato(TimerTomato timerTomato);
    boolean passwordStrength();



}
