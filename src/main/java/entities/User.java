package entities;

import java.util.Timer;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitFactory getHabitCollection();

    CategoryCollection getCategoryCollection();

    TaskFactory getTaskCollection();

    TimerTomato getTomato();

    void setTomato(TimerTomato tomato);

    boolean passwordStrength();


}
