package use_cases.habits.create_habit;

/**
 *  This class is a container for the output data related to creation of habit, it is created by the Interactor and sent
 *  to the Presenter.
 */
public class CreateHabitOutputData {

    private final String name;

    /**
     * A constructor that is used only when a habit is successfully created.
     *
     * @param name - name of habit object created by the interactor.
     */
    public CreateHabitOutputData(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
