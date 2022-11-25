package use_cases.timer_needed_use_cases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Timer_countdown {

    JFrame window;
    JLabel counterLabel;
    Font font1 = new Font("Arial", Font.PLAIN, 70);

    Timer timer;
    int second;
    int minute;

    String ddSecond, ddMinute;

    DecimalFormat dFormat = new DecimalFormat("00");

    public static void main(String[] args){

        new Timer_countdown();
    }

    public Timer_countdown() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        counterLabel = new JLabel("Work Time");
        counterLabel.setBounds(300, 230, 200, 100);
        counterLabel.setHorizontalAlignment(JLabel.CENTER);

        window.add(counterLabel);
        window.setVisible(true);

//        second = 0;
//        simpleTimer();
//        timer.start();

        // Normal Timer
        counterLabel.setText("03:00");
        second = 0;
        minute = 3;
        countdownTimer();
        timer.start();
    }

//    public void simpleTimer(){
//
//        timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
                // What happen set the timer

//                second++;

//                counterLabel.setText(""+ second);
//            }
//        });

//    }


    public void countdownTimer() {

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // What happen set the timer

                second--;
                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);

                counterLabel.setText(ddMinute+ ":" + ddSecond);

                if(second == -1){
                    second = 59;
                    minute = - minute++;

                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    counterLabel.setText(ddMinute + ":" + ddSecond);
                }

                if(minute == 0 && second == 0){
                    timer.stop();
                }
            }
        });


    }
}
