package test_entities;

import java.util.Calendar;

import entities.Task;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        deadline.set(2022, Calendar.NOVEMBER, 21);
        Task task = new Task("example");

        assertEquals("The name of the task should be \"example\"!", "example", task.getName());
        assertFalse("The completion status of the task should be \"FALSE\"!", task.isCompleteStatus());
    }

    @Test(timeout = 500)
    public void testSetNameRename() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21);
        Task task = new Task("example");
        task.setName("testName");

        assertEquals("The name of the task should be set to \"testName\"!", "testName", task.getName());
    }

    @Test(timeout = 500)
        public void testSetNameEmpty() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21);
        Task task = new Task("example");
        task.setName("");

        assertEquals("The name of the task should be set to \" \"!", "", task.getName());
    }

    @Test(timeout = 500)
    public void testMarkAsComplete() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21);
        Task task = new Task("example");
        task.markAsComplete();

        assertTrue("The status of the task should be marked as complete (TRUE).", task.isCompleteStatus());
    }

    @Test(timeout = 500)
    public void testMarkAsIncomplete() {
        Calendar deadline = Calendar.getInstance();
        deadline.set(2022, Calendar.NOVEMBER, 21);
        Task task = new Task("example");
        task.markAsIncomplete();

        assertFalse("The status of the task should be marked as incomplete (FALSE).", task.isCompleteStatus());
    }


}
