package example_user;

import entities.*;
import ui.habits.CreateHabitScreen;
import ui.tasks.CreateTaskScreen;
import use_cases.habits.create_habit.CreateHabitInputData;

public class UserExample {

    public static HabitCollection hFactory = new HabitCollection();

    static TaskFactory tFactory = new TaskFactory();

    static CategoryCollection cFactory =  new CategoryCollection();

    //static Timer t = new Timer();

    //static CommonUser person = new CommonUser("hello123@gmail.com", "12345678", "Harry", "Potter",
            //hFactory, tFactory, cFactory, t);

    public static void sendUser(){
        // System.out.println(t.title);
        //System.out.println("Click" + evt.getActionCommand());
        CreateHabitScreen cr = new CreateHabitScreen();
    }

    //public static void send(){
       // System.out.println(person.getHabitCollection().habitCollection.toString());
    //}

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(UserExample::sendUser);
    }

}
