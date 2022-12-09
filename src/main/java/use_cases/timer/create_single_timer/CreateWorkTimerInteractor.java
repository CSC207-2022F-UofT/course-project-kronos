package use_cases.timer.create_single_timer;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateWorkTimerInteractor extends CreateWorkTimerInputData {
    final int[] second = {0};
    final int[] minute = {0};
    Timer timer3 = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            second[0]++;

            if(second[0] ==60){
                second[0] = 0;
                minute[0]++;
            }
        }
    });
    public CreateWorkTimerInteractor(CreateWorkTimerDsGateway databaseTimer) {
        super(databaseTimer);
    }
}
