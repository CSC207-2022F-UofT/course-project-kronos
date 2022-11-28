package controllers.habits;

/**
 * Exception deals with failure of creating habit.
 */
public class HabitCreationFailed extends RuntimeException{

  public HabitCreationFailed(String error){
            super(error);
  }

}

