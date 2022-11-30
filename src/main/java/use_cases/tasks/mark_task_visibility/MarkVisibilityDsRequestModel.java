package use_cases.tasks.mark_task_visibility;

import entities.Task;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the marked task that should be updated in the database. It passes data to the
 * data gateway.
 */
public class MarkVisibilityDsRequestModel {
    private final int id ;
    private final boolean visibility;

    /**
     * Constructor
     * @param id - the id of the task being marked.
     * @param visibility - the visibility of the task after marking.
     */
    public MarkVisibilityDsRequestModel(int id, boolean visibility){
        this.id = id;
        this.visibility = visibility;
    }

    /**
     * @return the id of the task being marked.
     */
    public int getId() {
        return id;
    }

    /**
     * @return return the visibility of the task after marking.
     */
    public boolean isVisibility() {
        return visibility;
    }
}
