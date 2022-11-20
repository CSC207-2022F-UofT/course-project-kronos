package input_boundary;

import Habit_use_case.CreateHabit;
import entities.User;


public class CreateHabitInput {

    public static void HabitCreateInput(User u, String s, String t, Boolean r){

        if(s.equals("") && t.equals("")){CreateHabit.createHabit(u, s, t, r);}

    }


}
