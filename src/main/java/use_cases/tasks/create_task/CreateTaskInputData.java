package use_cases.tasks.create_task;

import java.util.Calendar;

/**
 *  This class is a container for the input data related to creation of task, it is created by the controller and sent
 *  to the interactor/use case.
 */
public class CreateTaskInputData{
    private final String name;
    private final Calendar deadline;

    /**
     * Constructor for a CreateTaskInputData object.
     * @param name - the input name
     * @param deadline - the input deadline
     */
    public CreateTaskInputData(String name, Calendar deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    /**
     * @return the name attribute of a CreateTaskInputData object.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the deadline attribute of a CreateTaskInputData object.
     */
    public Calendar getDeadline() {
        return deadline;
    }

}
