import entities.Timertomato;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class hour_and_second {

    JFrame window;
    JLabel counterLabel;
    Font font1 = new Font("Arial", Font.PLAIN, 100);

    Timer workTimer;
    int second;
    int minute;
    int hour;

    String ddSecond, ddMinute, ddHour;

    DecimalFormat dFormat = new DecimalFormat("00");


    public static void main(String[] args){

        new hour_and_second(Timertomato.getWorkTime());
    }

    public hour_and_second(String timer) {

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
        counterLabel.setText(timer);
        String[] numbers = timer.split("\\:");

        second = Integer.parseInt(numbers[0]);
        minute = Integer.parseInt(numbers[1]);
        hour = Integer.parseInt(numbers[2]);
        countdownTimer();
        workTimer.start();
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

        workTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // What happen set the timer

                second--;
                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);
                ddHour = dFormat.format(hour);

                counterLabel.setText(ddHour +":"+ ddMinute+ ":" + ddSecond);

                if(second == -1){
                    second = 59;
                    minute = - minute++;

                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    ddHour = dFormat.format(hour);
                    counterLabel.setText(ddHour +":"+ ddMinute+ ":" + ddSecond);

                    if(minute == -1){
                        minute = 59;
                        hour = - hour++;

                        ddSecond = dFormat.format(second);
                        ddMinute = dFormat.format(minute);
                        ddHour = dFormat.format(hour);
                        counterLabel.setText(ddHour +":"+ ddMinute+ ":" + ddSecond);
                    }
                }

                if(hour == 0 && minute == 0 && second == 0){
                    workTimer.stop();
                }
            }
        });


    }
}
