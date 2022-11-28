package controllers.habits;

public class HabitEditFailed extends RuntimeException{
    public HabitEditFailed(String error){
        super(error);
    }
}
