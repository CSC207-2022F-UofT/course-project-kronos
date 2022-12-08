package use_cases.tasks.create_task;

import java.util.Calendar;

/**
 * -- Application Business Layer --
 *  This class is a container for the input data related to creation of task, it is created by the controller and sent
 *  to the interactor/use case.
 */
public class CreateTaskInputData{
    private final String name;

    /**
     * Constructor for a CreateTaskInputData object.
     * @param name - the input name
     */
    public CreateTaskInputData(String name) {
        this.name = name;
    }

    /**
     * @return the name attribute of a CreateTaskInputData object.
     */
    public String getName() {
        return name;
    }


}
