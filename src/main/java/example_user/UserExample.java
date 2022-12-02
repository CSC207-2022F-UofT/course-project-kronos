package example_user;

import entities.*;

public class UserExample {

    public static HabitFactory hFactory = new HabitFactory();

    static TaskFactory tFactory = new TaskFactory();

    static CategoryFactory cFactory =  new CategoryFactory();

    static TimerTomato t = new TimerTomato();

    static CommonUser person = new CommonUser("hello123@gmail.com", "12345678", "Harry", "Potter",
            hFactory, tFactory, cFactory, t);

    public static CommonUser sendUser(){
        return person;
    }

    public static void send(){
        System.out.println(person.getHabitCollection().habitCollection.toString());
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(UserExample::send);
    }

}
