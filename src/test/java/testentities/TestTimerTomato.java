package testentities;

import entities.TimerTomato;
import org.junit.Test;

import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static junit.framework.TestCase.assertEquals;

public class TestTimerTomato {

    static TimerTomato timer1 = new TimerTomato(10);
    TimerTomato timer2 = new TimerTomato(2,4,3);

    @Test(timeout = 500)
    public void testSetWorkTime() {
        int workTime = 25;
        timer1.setWorkTime(25);
        //assertion
        assertEquals(workTime, TimerTomato.getWorkTime());

    }

    @Test
    public void testGetWorkTime() {
        int workTime = 25;
        TimerTomato timer2 = new TimerTomato(25,5,3);
        //assertion
        assertEquals(workTime, TimerTomato.getWorkTime());

    }

    @Test(timeout = 500)
    public void testSetRestTime() {
        int restTime = 5;
        timer1.setRestTime(5);
        //assertion
        assertEquals(restTime, TimerTomato.getRestTime());

    }

    @Test
    public void testGetRestTime() {
        int restTime = 5;
        TimerTomato timer2 = new TimerTomato(25,5,3);
        //assertion
        assertEquals(restTime, TimerTomato.getRestTime());

    }

    @Test(timeout = 500)
    public void testSetRestTime2() {
        int restTime = 5;
        timer1.setRestTime(5);
        //assertion
        assertEquals(restTime, TimerTomato.getRestTime());

    }

    @Test(timeout = 500)
    public void testSetTimerCycle() {
        int timerCycle = 2;
        timer1.setTimerCycle(2);
        //assertion
        assertEquals(timerCycle, TimerTomato.getTimerCycle());

    }

    @Test(timeout = 500)
    public void testGetTimerCycle() {
        int timerCycle = 3;
        TimerTomato timer2 = new TimerTomato(2,4,3);
        //assertion
        assertEquals(timerCycle, TimerTomato.getTimerCycle());

    }

    @Test
    public void testGetWorkTimeLeft() {
        int workTime = 25;
        TimerTomato timer2 = new TimerTomato(25,5,3);
        //assertion
        assertEquals(workTime, TimerTomato.getWorkTimeLeft());

    }

    @Test
    public void testGetRestTimeLeft() {
        int restTime = 5;
        TimerTomato timer2 = new TimerTomato(25,5,3);
        //assertion
        assertEquals(restTime, TimerTomato.getRestTimeLeft());

    }

    @Test
    public void testGetTimerStatus() {
        int status = 0;
        final int[] second = {0};
        final int[] minute = {0};
        Timer timer3 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // What happen set the timer

                second[0]++;

                if(second[0] ==60){
                    second[0] = 0;
                    minute[0]++;
                }
            }
        });
        //assertion
        assertEquals(status, timer2.getTimeStatus(timer3));


    }







}
