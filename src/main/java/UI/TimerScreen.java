package UI;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class TimerScreen extends JFrame
{
    private JPanel topPanel;
    String number1;
    String number2;
    // Custom Components
    // RGB Codes for Blue. Used as Background.
    private final Color Blue = new Color(0, 50, 200);

    // Used for displaying the timer values.
    private final Font timerStyle = new Font("Good", Font.BOLD, 140);

    // RGB codes for Red. Used as Background for buttons.
    private final Color Red = new Color(190, 30, 50);

    // Used in the buttons in the Pomodoro Timer section.
    private final Font formBTStyles = new Font("formBT", Font.BOLD, 20);

    // Used in the buttons in the Pomodoro Timer section.
    private final Font delayLabelStyles = new Font("delaylabel", Font.ITALIC, 20);

    // RGB code for Green. Used as background when the timer is paused.
    private final Color Green = new Color(20, 140, 30);

    private static final int ORIGINAL_COUNTDOWN_MINUTES = 25;
    private static final int ORIGINAL_COUNTDOWN_SECONDS = 0;

    private int[] workTimeMin = {-1};
    private int[] restTimeMin = {-1};

    private static final int ORIGINAL_SHORTBREAK_MINUTES = 5;
    private static final int ORIGINAL_SHORTBREAK_SECONDS = 0;
    private static final int ORIGINAL_LONGBREAK_MINUTES = 15;
    private static final int ORIGINAL_LONGBREAK_SECONDS = 0;
    private static final int TOTAL_DELAY_TIME = 30;
    private static final int INTERVAL = 1000; // Iteration interval for the Timers.
    private static final int ONE_POMODORO_CYCLE = 8; // No of rounds in a single Pomodoro cycle.

    private JPanel timerPanel;
    private JLabel minuteLabel;
    private JLabel separator;
    private JLabel secondLabel;
    private JLabel delayRemainingLabel;

    JLabel WorkTimerSet;

    JLabel RestTimerSet;

    public void createLabel(String labelText, int boundX, int boundY, int boundWidth, int boundHeight,
                            JPanel panel){
        JLabel Label = new JLabel(labelText);
        Label.setBounds(boundX, boundY, boundWidth, boundHeight);
        panel.add(Label);
    }

    private JButton startPauseBT;
    private JButton stopBT;
    private JButton continueBT;

    private Timer countDown;
    private Timer workTimer;
    private Timer restTimer;

    private int secondsRemaining;
    private int minutesRemaining;
    private int delayRemaining;
    private int roundsCompleted; // No. of Pomodoro rounds completed.


    public TimerScreen()
    {
        setTitle("Tomato Timer");

        // Setting up the Cloud Look and Feel of the GUI application
        try
        {
            for(LookAndFeelInfo info: UIManager.getInstalledLookAndFeels())
            {
                if("Cloud".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            // To disable 'Space' button to act as a click for buttons if it has focus.
            InputMap im = (InputMap)UIManager.get("Button.focusInputMap");
            im.put(KeyStroke.getKeyStroke("pressed SPACE"), "none");
            im.put(KeyStroke.getKeyStroke("released SPACE"), "none");
        }

        catch(ClassNotFoundException | InstantiationException | IllegalAccessException |
              UnsupportedLookAndFeelException e)
        {
            // If Cloud is not available, you can set the GUI to default look and feel.
        }

        topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(900, 600));
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel, BorderLayout.CENTER);
        roundsCompleted = 0;

        topPanel.add(addMainTimer());
    }


    private JPanel addMainTimer()
    {
        timerPanel = new JPanel();
        timerPanel.setBackground(Blue);
        timerPanel.setLayout(new MigLayout("insets 115 0 0 0", "", "[][]0[]"));

        minuteLabel = new JLabel(String.format("%02d", ORIGINAL_COUNTDOWN_MINUTES));
        minuteLabel.setForeground(Color.white);
        minuteLabel.setFont(timerStyle);
        timerPanel.add(minuteLabel, "split 3, gapright 20, gaptop 20, pushx, spanx, alignx center, height 145!");

        separator = new JLabel(":");
        separator.setForeground(Color.white);
        separator.setFont(timerStyle);
        timerPanel.add(separator, "alignx center, gapright 20, height 145!");

        secondLabel = new JLabel(String.format("%02d", ORIGINAL_COUNTDOWN_SECONDS));
        secondLabel.setForeground(Color.white);
        secondLabel.setFont(timerStyle);
        timerPanel.add(secondLabel, "alignx center, height 145!, wrap");

        startPauseBT = new JButton("Start");
        startPauseBT.setContentAreaFilled(true);
        startPauseBT.setBackground(Green);
        startPauseBT.setActionCommand("Begin");
        startPauseBT.setForeground(Color.white);
        startPauseBT.setFont(formBTStyles);
        timerPanel.add(startPauseBT, "gaptop 5, alignx center, split 3, spanx, pushx");

        continueBT = new JButton("Skip");
        continueBT.setBackground(Red);
        continueBT.setContentAreaFilled(true);
        continueBT.setForeground(Color.white);
        continueBT.setFont(formBTStyles);
        continueBT.setVisible(false);
        timerPanel.add(continueBT);

        stopBT = new JButton("Stop");
        stopBT.setContentAreaFilled(true);
        stopBT.setBackground(Red);
        stopBT.setActionCommand("Stop");
        stopBT.setForeground(Color.white);
        stopBT.setFont(formBTStyles);
        timerPanel.add(stopBT);

        delayRemainingLabel = new JLabel("Resumes in " + TOTAL_DELAY_TIME + " seconds");
        delayRemainingLabel.setForeground(Color.white);
        delayRemainingLabel.setVisible(false);
        delayRemainingLabel.setFont(delayLabelStyles);
        timerPanel.add(delayRemainingLabel, "alignx center");

        // Label not shown.
        WorkTimerSet = new JLabel();
        WorkTimerSet.setForeground(Color.white);
        WorkTimerSet.setVisible(true);
        WorkTimerSet.setFont(formBTStyles);
        timerPanel.add(WorkTimerSet);

        JTextField workText = new JTextField(100);
        workText.setPreferredSize(new Dimension(1,50));
        timerPanel.add(workText, "alignx center, split 3");

        //Label not shown.
        RestTimerSet = new JLabel();
        RestTimerSet.setForeground(Color.white);
        RestTimerSet.setVisible(true);
        RestTimerSet.setFont(formBTStyles);
        timerPanel.add(RestTimerSet);

        JTextField restText = new JTextField(100);
        restText.setPreferredSize(new Dimension(1,50));
        timerPanel.add(restText, "alignx center, split 3");
        JButton SettingButton = new JButton("Setting");
        SettingButton.setFont(new Font("", Font.PLAIN, 30));
        timerPanel.add(SettingButton, "alignx center, split 3");


        SettingButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // set time
                number1 = workText.getText();
                number2 = restText.getText();
                int i1 = Integer.parseInt(number1);
                workTimeMin[0] = i1;
                int i2 = Integer.parseInt(number2);
                restTimeMin[0] = i2;
                minuteLabel.setText(String.format("%02d", i1));
                secondLabel.setText(String.format("%02d", i2));
                runMainTimer();
            }

        });

        startPauseBT.addActionListener((ActionEvent event) -> {
            switch (event.getActionCommand()) {
                case "Pause":
                    countDown.stop();
                    countDownPaused();
                    SettingButton.setVisible(false);
                    startPauseBT.setText("Continue");
                    startPauseBT.setActionCommand("Begin");
                    break;
                case "Start": // Fresh Start
                    countDown.start();
                    stopBT.setEnabled(true);
                    //startPauseBT.setIcon(pauseIcon);
                    SettingButton.setVisible(false);
                    startPauseBT.setText("Pause");
                    startPauseBT.setActionCommand("Pause");
                case "Begin": // Continue
                    countDown.start();
                    stopBT.setEnabled(true);
                    //startPauseBT.setIcon(pauseIcon);
                    SettingButton.setVisible(false);
                    startPauseBT.setText("Pause");
                    startPauseBT.setActionCommand("Pause");
                    break;
                default:
                    break;
            }
        });

        continueBT.addActionListener((ActionEvent event) -> {
            if(event.getActionCommand().equals("SkipRestTimer"))
            {
                restTimer.stop();
                roundsCompleted++;
            }
            else if(event.getActionCommand().equals("SkipWorkTimer"))
            {
                workTimer.stop();
                roundsCompleted = 0; // Timer is Reset.
            }

            startPauseBT.setVisible(true);
            continueBT.setVisible(false);
            stopBT.setVisible(true);
            runMainTimer();
        });

        stopBT.addActionListener((ActionEvent event) -> {
            countDown.stop();
            secondsRemaining = ORIGINAL_COUNTDOWN_SECONDS;
            minutesRemaining = workTimeMin[0];
            minuteLabel.setText(String.format("%02d", workTimeMin[0]));
            secondLabel.setText(String.format("%02d", ORIGINAL_COUNTDOWN_SECONDS));
            stopBT.setEnabled(false);
            roundsCompleted = 0; // Timer is Reset.
            SettingButton.setVisible(true);
            startPauseBT.setText("Start");
            startPauseBT.setActionCommand("Start");
        });

        runMainTimer();

        return timerPanel;
    }

    private void runMainTimer()
    {
        //System.out.println("Start Main " + String.format("%d", roundsCompleted));
        minutesRemaining = workTimeMin[0];
        secondsRemaining = ORIGINAL_COUNTDOWN_SECONDS;

        minuteLabel.setText(String.format("%02d", workTimeMin[0]));
        secondLabel.setText(String.format("%02d", ORIGINAL_COUNTDOWN_SECONDS));

        if(roundsCompleted == ONE_POMODORO_CYCLE)
        {
            //System.out.println("Stop Work " + roundsCompleted);
            workTimer.stop();
            roundsCompleted = 0; // Timer is Reset.
        }

        else if(roundsCompleted > 0 && roundsCompleted % 2 == 0)
        {
            //System.out.println("Stop Rest " + roundsCompleted);
            restTimer.stop();
        }
        // else
        {
            System.out.println("Don't Stop Main " + roundsCompleted);
        }

        countDown = new Timer(INTERVAL, (ActionEvent event) -> {
            if(secondsRemaining == ORIGINAL_COUNTDOWN_SECONDS)
            {
                if(minutesRemaining == 0)
                {
                    runRestTimer();
                }
                else
                {
                    minutesRemaining -= 1;
                    secondsRemaining = 59;
                    minuteLabel.setText(String.format("%02d", minutesRemaining));
                    secondLabel.setText(String.format("%02d", secondsRemaining));
                }
            }
            else
            {
                if(secondsRemaining > 0)
                {
                    secondsRemaining -= 1;
                    secondLabel.setText(String.format("%02d", secondsRemaining));
                }
            }
        });

        countDown.stop();
    }

    private void runRestTimer()
    {
        //System.out.println("Start Rest " + String.format("%d", roundsCompleted));
        minutesRemaining = restTimeMin[0];
        secondsRemaining = ORIGINAL_SHORTBREAK_SECONDS;
        stopBT.setVisible(true);
        startPauseBT.setVisible(false);
        continueBT.setVisible(false);
        continueBT.setActionCommand("SkipShortTimer");
        countDown.stop();

        minuteLabel.setText(String.format("%02d", restTimeMin[0]));
        secondLabel.setText(String.format("%02d", ORIGINAL_SHORTBREAK_SECONDS));

        restTimer = new Timer(INTERVAL, (ActionEvent event) -> {
            if(secondsRemaining == ORIGINAL_SHORTBREAK_SECONDS)
            {
                if(minutesRemaining == 0)
                {
                    continueBT.setVisible(false);
                    stopBT.setVisible(true);
                    startPauseBT.setVisible(true);
                    //roundsCompleted++;
                    runMainTimer();
                }
                else
                {
                    minutesRemaining -= 1;
                    secondsRemaining = 59;
                    minuteLabel.setText(String.format("%02d", minutesRemaining));
                    secondLabel.setText(String.format("%02d", secondsRemaining));
                }
            }
            else
            {
                secondsRemaining -= 1;
                secondLabel.setText(String.format("%02d", secondsRemaining));
            }
        });

        restTimer.start();
    }

    private void runWorkTimer()
    {
        //System.out.println("Start Long " + String.format("%d", roundsCompleted));
        minutesRemaining = ORIGINAL_LONGBREAK_MINUTES;
        secondsRemaining = ORIGINAL_LONGBREAK_SECONDS;
        stopBT.setVisible(true);
        startPauseBT.setVisible(true);
        continueBT.setVisible(true);
        continueBT.setActionCommand("SkipWorkTimer");
        countDown.stop();

        minuteLabel.setText(String.format("%02d", ORIGINAL_LONGBREAK_MINUTES));
        secondLabel.setText(String.format("%02d", ORIGINAL_LONGBREAK_SECONDS));

        workTimer = new Timer(INTERVAL, (ActionEvent event) -> {
            if(secondsRemaining == 0)
            {
                if(minutesRemaining == 0)
                {
                    continueBT.setVisible(false);
                    stopBT.setVisible(true);
                    startPauseBT.setVisible(true);
                    //roundsCompleted++;
                    runMainTimer();
                }
                else
                {
                    minutesRemaining -= 1;
                    secondsRemaining = 59;
                    minuteLabel.setText(String.format("%02d", minutesRemaining));
                    secondLabel.setText(String.format("%02d", secondsRemaining));
                }
            }
            else
            {
                secondsRemaining -= 1;
                secondLabel.setText(String.format("%02d", secondsRemaining));
            }
        });

        workTimer.start();
    }

    private void countDownPaused()
    {
        countDown.stop();
    }

    private static void runGUI()
    {
        TimerScreen mainFrame = new TimerScreen();
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(TimerScreen::runGUI);
    }






}