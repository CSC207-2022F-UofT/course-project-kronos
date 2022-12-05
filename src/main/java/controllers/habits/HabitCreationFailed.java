package controllers.habits;

/**
 * Exception deals with failure of creating habit.
 */
public class HabitCreationFailed extends RuntimeException{

    /**
     *
     * @param error - Message to be displayed when creation of habit failed.
     */
  public HabitCreationFailed(String error){
            super(error);
  }

}

