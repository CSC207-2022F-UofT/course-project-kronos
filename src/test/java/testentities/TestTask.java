//package testentities;
//
//import java.util.Calendar;
//
//import entities.Category;
//import entities.Task;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static java.lang.Boolean.FALSE;
//import static java.lang.Boolean.TRUE;
//import static org.junit.Assert.*;
//
//public class TestTask {
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    @Test(timeout = 500)
//    public void testTaskConstructor() {
//        Calendar deadline = Calendar.getInstance();
//        deadline.set(2022, Calendar.NOVEMBER, 21);
//        Task task = new Task("example", deadline);
//
//        assertEquals("The name of the task should be \"example\"!", "example", task.getName());
//        assertEquals("The deadline of the task should be \"FFFFFF\"!", deadline, task.getDeadline());
//        assertFalse("The completion status of the task should be \"FALSE\"!", task.isCompleteStatus());
//    }
//
//    @Test(timeout = 500)
//    public void testSetNameRename() {
//        Calendar deadline = Calendar.getInstance();
//        deadline.set(2022, Calendar.NOVEMBER, 21);
//        Task task = new Task("example", deadline);
//        task.setName("testName");
//
//        assertEquals("The name of the task should be set to \"testName\"!", "testName", task.getName());
//    }
//
//    @Test(timeout = 500)
//        public void testSetNameEmpty() {
//        Calendar deadline = Calendar.getInstance();
//        deadline.set(2022, Calendar.NOVEMBER, 21);
//        Task task = new Task("example", deadline);
//        task.setName("");
//
//        assertEquals("The name of the task should be set to \" \"!", "", task.getName());
//    }
//
//    @Test(timeout = 500)
//    public void testMarkAsComplete() {
//        Calendar deadline = Calendar.getInstance();
//        deadline.set(2022, Calendar.NOVEMBER, 21);
//        Task task = new Task("example", deadline);
//        task.markAsComplete();
//
//        assertTrue("The status of the task should be marked as complete (TRUE).", task.isCompleteStatus());
//    }
//
//    @Test(timeout = 500)
//    public void testMarkAsIncomplete() {
//        Calendar deadline = Calendar.getInstance();
//        deadline.set(2022, Calendar.NOVEMBER, 21);
//        Task task = new Task("example", deadline);
//        task.markAsIncomplete();
//
//        assertFalse("The status of the task should be marked as incomplete (FALSE).", task.isCompleteStatus());
//    }
//
//    @Test(timeout = 500)
//    public void testSetDeadline() {
//        Calendar deadline = Calendar.getInstance();
//        deadline.set(2022, Calendar.NOVEMBER, 21);
//        Task task = new Task("example", deadline);
//        Calendar newDeadline = Calendar.getInstance();
//        newDeadline.set(2022, Calendar.DECEMBER, 22);
//        task.setDeadline(newDeadline);
//
//        assertEquals("The deadline of the task should be modified to the new deadline given",
//                newDeadline, task.getDeadline());
//    }
//
//
//}
