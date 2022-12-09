package use_cases.timer.edit_timer;

import database.DatabaseTimer;

public class EditTimerInteractor implements EditTimerInputBoundary {
    public EditTimerInteractor(DatabaseTimer databaseTimer1, EditTimerDsGateway databaseTimer) {
    }

    /**
     * Create a new work timer based on the input data.
     *
     * @param inputData - input data of the new timer.
     */
    @Override
    public EditTimerOutputData edit(EditTimerInputData inputData) {
        return null;
    }
}
