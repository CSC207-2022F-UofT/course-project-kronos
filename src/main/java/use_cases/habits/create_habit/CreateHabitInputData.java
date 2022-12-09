package use_cases.habits.create_habit;


/**
 * Application Business Layer
 *  This class is a container for the input data related to creation of habit, it is created by the controller and sent
 *  to the interactor/use case.
 */
public class CreateHabitInputData {

    private final String name;
    private final String type;


    /**
     * Constructor for this class.
     * @param name - the input name
     * @param type - the input type
     */
    public CreateHabitInputData(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * @return the name attribute of a CreateHabitInputData object.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the type attribute of a CreateHabitInputData object.
     */
    public String getType() {
        return type;
    }

}
