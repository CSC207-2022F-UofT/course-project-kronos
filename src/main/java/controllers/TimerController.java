package controllers;

import use_cases.timer_use_cases.TimerOutputBoundary;

public class TimerController {

    /**
     * Check whether the input fields are correct.
     * @param w - The minutes need of work timer
     * @param r - The minutes need of work timer
     //* @param i - The amount of the cycle
     * success is true if no fields are empty and a Habit is created.
     */
    public static boolean createTimer(String w, String r){
        //boolean t = w.equals("Start");
        TimerOutputBoundary TimerOutput = new TimerOutputBoundary(w, r);
        return TimerOutput.getSuccess();
    }
}
