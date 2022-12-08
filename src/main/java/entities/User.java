package entities;

import java.util.Timer;

public interface User {
    String getEmailAddress();
    String getPassword();
    String getFirstName();
    String getLastName();
    HabitCollection getHabitCollection();

    CategoryCollection getCategoryCollection();

    TimerTomato getTomato();

    void setTomato(TimerTomato tomato);

    boolean passwordStrength();


}
