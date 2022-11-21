import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Timer_countdown_hour {

    JFrame window;
    JLabel counterLabel;
    Font font1 = new Font("Arial", Font.PLAIN, 70);

    Timer timer;
    int hour;
    int minute;

    String ddHour, ddMinute;

    DecimalFormat dFormat = new DecimalFormat("00");

    public static void main(String[] args){

        new Timer_countdown_hour();
    }

    public Timer_countdown_hour() {

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
        counterLabel.setText("00:00");
        hour = 0;
        minute = 0;
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

        timer = new Timer(60 * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // What happen set the timer

                minute--;
                ddMinute = dFormat.format(minute);
                ddHour = dFormat.format(hour);

                counterLabel.setText(ddHour+ ":" + ddMinute);

                if(minute == -1){
                    minute = 59;
                    hour = hour++;

                    ddMinute = dFormat.format(minute);
                    ddHour = dFormat.format(hour);
                    counterLabel.setText(ddHour + ":" + ddMinute);
                }

                if(hour == 0 && minute == 0){
                    timer.stop();
                }
            }
        });


    }
}

