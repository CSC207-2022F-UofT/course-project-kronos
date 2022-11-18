package controller;

import input_boundary.EditHabitInput;
import entities.HabitFactory;


public class EditHabitController {

    public static void HabitEdit(HabitFactory h, String s, String a, String t, String b){

        boolean r = b.equals("ON");

        // need user

        EditHabitInput.HabitEditInput(h, s, a, t, r);

    }
}
