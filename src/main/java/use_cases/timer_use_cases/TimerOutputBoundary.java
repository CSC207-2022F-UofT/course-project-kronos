package use_cases.timer_use_cases;

public class TimerOutputBoundary {

    private Boolean success;

    /**
     * Check whether the input fields are correct.
     *
     * @param w - The minutes need of work timer
     * @param r - The minutes need of work timer
     */
    public TimerOutputBoundary(String w, String r){
        if(!(w.equals("") && r.equals(""))){
            //CreateTimer.createHabit(w, r, i);
            this.success = true;
        }
    }

    /**
     * @return - Returns whether timer was created successfully.
     */
    public Boolean getSuccess() {
        return this.success;
    }
}
