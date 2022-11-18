package input_boundary;

import Habit_use_case.EditHabit;

import entities.Habit;
import entities.HabitFactory;

public class EditHabitInput {

    public static void HabitEditInput(HabitFactory hF, String s, String a, String t, Boolean r){

        Habit h = hF.h_items.get(s);



        if(s.equals("") && t.equals("")){
           EditHabit.editName(h , hF, a);
           EditHabit.editType(h, t);
           EditHabit.editReminder(h, r);
        }

    }
}
