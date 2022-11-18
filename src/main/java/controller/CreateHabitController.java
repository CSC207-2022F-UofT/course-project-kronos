package controller;
import input_boundary.CreateHabitInput;


public class CreateHabitController {

    public static void HabitCreation(String s, String t, String b){

        boolean r = b.equals("ON");
        CreateHabitInput.HabitCreateInput(s, t, r);

    }
}
