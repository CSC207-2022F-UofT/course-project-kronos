package testentities;

import java.util.Calendar;

import entities.Task;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.*;

public class TestTask {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testTaskConstructor() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);

        assertEquals("The name of the task should be \"example\"!", "example", task.name);
        assertFalse("The reminder status of the task should be \"FALSE\"!", task.reminders);
        assertTrue("The visibility of the task should be \"TRUE\"!", task.visibility);
        assertEquals("The deadline of the task should be \"FFFFFF\"!", deadline, task.deadline);
        assertNull("The task should not be assigned to any category", task.taskCategory);
        assertFalse("The completion status of the task should be \"FALSE\"!", task.completeStatus);
    }

    @Test(timeout = 500)
    public void testSetNameRename() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.setName("testName");

        assertEquals("The name of the task should be set to \"testName\"!", "testName", task.name);
    }

    @Test(timeout = 500)
        public void testSetNameEmpty() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.setName("");

        assertEquals("The name of the task should be set to \" \"!", "", task.name);
    }

    @Test(timeout = 500)
    public void testMarkAsComplete() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.markAsComplete();

        assertTrue("The status of the task should be marked as complete (TRUE).", task.completeStatus);
    }

    @Test(timeout = 500)
    public void testMarkAsIncomplete() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.markAsIncomplete();

        assertTrue("The status of the task should be marked as incomplete (FALSE).", task.completeStatus);
    }

    @Test(timeout = 500)
    public void testSetReminderOn(){
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.setReminders(TRUE);
        //Test set reminders on.
        assertTrue("The reminder should be turned on (TRUE)", task.reminders);
    }

    @Test(timeout = 500)
    public void testSetReminderOff(){
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.setReminders(FALSE);
        //Test set reminders off.
        assertFalse("The reminder should be turned off (FALSE)", task.reminders);
    }

    @Test(timeout = 500)
    public void testSetCategory() {
        // Waiting for the implementation of Category Class.
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        // Category csc207 = new Category("csc207", "000000", tasks, TRUE);
        // assertEquals("The category of the task should be set to ...", csc207, task.category);
    }

    @Test(timeout = 500)
    public void testSetColour() {
        // Conflicting part
    }

    @Test(timeout = 500)
    public void testSetVisible(){
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.setVisibility(TRUE);

        assertTrue("The visibility of the task is set to visible (TRUE)", task.visibility);
    }

    @Test(timeout = 500)
    public void testSetInvisible(){
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        task.setVisibility(FALSE);

        assertTrue("The visibility of the task is set to invisible (FALSE)", task.visibility);
    }

    @Test(timeout = 500)
    public void testSetDeadline() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21, 23,59);
        Task task = new Task("example", FALSE, deadline);
        Calendar newDeadline = Calendar.getInstance();
        newDeadline.set(2022, Calendar.DECEMBER, 22, 12, 0);
        task.setDeadline(newDeadline);

        assertEquals("The deadline of the task should be modified to the new deadline given",
                newDeadline, task.deadline);
    }


}
