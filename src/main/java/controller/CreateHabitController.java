package controller;
import entities.User;
import input_boundary.CreateHabitInput;


public class CreateHabitController {

    public static void HabitCreation(User u, String s, String t, String b){

        boolean r = b.equals("ON");
        new CreateHabitInput(u, s, t, r);

    }
}
