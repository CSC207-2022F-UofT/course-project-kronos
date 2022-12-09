package use_cases.tasks.mark_task_completion;

/**
 * -- Application Business Layer --
 * A data structure that stores data about the marked task that should be updated in the database. It passes data to the
 * data gateway.
 */
public class MarkCompletionDsRequestModel {
    private int id;
    private boolean completeStatus;

    /**
     * Constructor
     * @param id - the id of the task being marked.
     * @param completeStatus - the completion status of the task after marking.
     */
    public MarkCompletionDsRequestModel(int id, boolean completeStatus){
        this.id = id;
        this.completeStatus = completeStatus;
    }

    /**
     * @return the id of the task being marked.
     */
    public int getId() {
        return id;
    }

    /**
     * @return return the completion status of the task after marking.
     */
    public boolean isCompleteStatus() {
        return completeStatus;
    }

    /**
     * @param taskId - id of the task to be marked complete/incomplete
     */
    public void setId(Integer taskId){this.id = taskId;}

}
