package testentities;

import entities.Task;
import entities.TaskFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestTaskCollection {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test the addItem method
     */
    @Test(timeout = 500)
    public void testAddItem(){
        TaskFactory collection = new TaskFactory();
        Task exampleTask = new Task("example");
    }

}
