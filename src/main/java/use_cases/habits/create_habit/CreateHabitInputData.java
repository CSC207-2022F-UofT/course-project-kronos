package use_cases.habits.create_habit;


/**
 *  This class is a container for the input data related to creation of habit, it is created by the controller and sent
 *  to the interactor/use case.
 */
public class CreateHabitInputData {

    private final String name;
    private final String type;


    /**
     * Constructor for a CreateTaskInputData object.
     * @param name - the input name
     * @param t - the input type
     */
    public CreateHabitInputData(String name, String t) {
        this.name = name;
        this.type = t;
    }

    /**
     * @return the name attribute of a CreateHabitInputData object.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the deadline attribute of a CreateTaskInputData object.
     */
    public String getType() {
        return type;
    }

}
