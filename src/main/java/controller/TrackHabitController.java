package controller;
import entities.Habit;
import input_boundary.TrackHabitInput;

import static ui.TestFile.hFactory;

public class TrackHabitController {

    public static void TrackHabitC (String s) {

        Habit h = hFactory.h_items.get(s);


        TrackHabitInput.TrackAHabit(h);
    }
}
