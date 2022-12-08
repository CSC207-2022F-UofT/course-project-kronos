package ui.habits;

import entities.*;

public class ExampleHabit {


    public static HabitCollection send(){

        Habit h1 = new Habit("Run 5 Kms", "weekly");
        Habit h2 = new Habit("Read a book", "daily");
        Habit h3 = new Habit("Drink Water", "daily");
        HabitCollection hFactory = new HabitCollection();
        hFactory.addItem(h1);
        hFactory.addItem(h2);
        hFactory.addItem(h3);
        return hFactory;
    }

}
