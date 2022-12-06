//package ui.habits;
//
//import ui.habits.CreateHabitScreen;
//import entities.*;
//
//public class UserExample {
//
//    public static HabitFactory hFactory = new HabitFactory();
//
//    static TaskFactory tFactory = new TaskFactory();
//
//    static CategoryFactory cFactory =  new CategoryFactory();
//
//    static Timer t = new Timer();
//
//    static CommonUser person = new CommonUser("hello123@gmail.com", "12345678", "Harry", "Potter",
//            hFactory, tFactory, cFactory, t);
//
//
//
//
//    public static CreateHabitScreen sendUser(){
//
//        CreateHabitScreen chs = new CreateHabitScreen();
//        System.out.println(chs.title);
//        return chs;
//    }
//
//    public static void send(){
//        System.out.println(person.getHabitCollection().getCollection().toString());
//    }
//
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(UserExample::sendUser);
//    }
//
//}
