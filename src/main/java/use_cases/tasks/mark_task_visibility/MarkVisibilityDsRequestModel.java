package use_cases.tasks.mark_task_visibility;

import entities.Task;

public class MarkVisibilityDsRequestModel {

    private final Integer id;

    private boolean visibility;
    public MarkVisibilityDsRequestModel(Integer id, boolean visibility){
        this.id = id;
        this.visibility = visibility;
    }

    public Integer getId(){return this.id;}

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public boolean getVisibility(){return this.visibility;}
}
