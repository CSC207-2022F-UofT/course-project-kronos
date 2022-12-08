package use_cases.timer_use_cases.create_single_timer;

public class CreateWorkTimerOutputBoundary {

    private Boolean success;

    /**
     * Check whether the input fields are correct.
     *
     * @param w - The minutes need of work timer
     * @param r - The minutes need of work timer
     */
    public CreateWorkTimerOutputBoundary(String w, String r){
        if(!(w.equals("") && r.equals(""))){
            //CreateTimer.createHabit(w, r, i);
            this.success = true;
        }
    }

    /**
     * @return - Returns whether habit was created successfully.
     */
    public Boolean getSuccess() {
        return this.success;
    }
}
