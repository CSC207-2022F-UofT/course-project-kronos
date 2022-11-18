package input_boundary;

import Habit_use_case.CreateHabit;

import java.util.Objects;

public class CreateHabitInput {

    public static void HabitCreateInput(String s, String t, Boolean r){

        if(s.equals("") && t.equals("")){CreateHabit.createHabit(s, t, r);}

    }


}
