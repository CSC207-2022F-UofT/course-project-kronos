package testentities;

import entities.Task;
import entities.TaskFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

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
        collection.addItem(exampleTask);
        TaskFactory expected = new TaskFactory();
        expected.getTasks().put(exampleTask.getId(), exampleTask);
        assertEquals(expected, collection);
    }

    /**
     * Test the removeItem method.
     */
    @Test(timeout = 500)
    public void testRemoveItem(){
        TaskFactory expected = new TaskFactory();
        Task exampleTask = new Task("example");
        TaskFactory collection = new TaskFactory();
        collection.removeItem(exampleTask);
        assertEquals(expected, collection);
    }

    /**
     * Test the getTasks method.
     */
    @Test(timeout = 500)
    public void testGetTasks(){
        TaskFactory collection = new TaskFactory();
        Task taskA = new Task("CSC207 Project");
        Task taskB = new Task("CSC207 Presentation");
        collection.addItem(taskA);
        collection.addItem(taskB);
        HashMap<Integer, Task> hashMap = new HashMap<>();
        hashMap.put(taskA.getId(), taskA);
        hashMap.put(taskB.getId(), taskB);
        assertEquals(hashMap, collection.getTasks());
    }

    /**
     * Test the setTasks method.
     */
    @Test(timeout = 500)
    public void testSetTasks(){
        Task taskA = new Task("CSC207 Project");
        Task taskB = new Task("CSC207 Presentation");
        HashMap<Integer, Task> hashMap = new HashMap<>();
        hashMap.put(taskA.getId(), taskA);
        hashMap.put(taskB.getId(), taskB);
        TaskFactory collection = new TaskFactory();
        collection.setTasks(hashMap);
        assertEquals(hashMap, collection.getTasks());
    }

    /**
     * Test the convertToArray method.
     */
    @Test(timeout = 500)
    public void testConvertToArray(){
        TaskFactory collection = new TaskFactory();
        Task taskA = new Task("CSC207 Project");
        Task taskB = new Task("CSC207 Presentation");
        ArrayList<Task> array = new ArrayList<Task>();
        array.add(taskA);
        array.add(taskB);
        assertEquals(array, collection.convertToArray());
    }

    /**
     * Test if the existById method returns TRUE correctly.
     */
    @Test(timeout = 500)
    public void testExistByIdTrue(){
        Task taskA = new Task("CSC207 Project");
        Task taskB = new Task("CSC207 Presentation");
        TaskFactory collection = new TaskFactory();
        collection.addItem(taskA);
        collection.addItem(taskB);
        int id = taskA.getId();
        assertTrue(collection.existById(id));
    }

    /**
     * Test if the existById method returns FALSE correctly.
     */
    @Test(timeout = 500)
    public void testExistByIdFalse(){
        Task taskA = new Task("CSC207 Project");
        Task taskB = new Task("CSC207 Presentation");
        TaskFactory collection = new TaskFactory();
        collection.addItem(taskA);
        collection.addItem(taskB);
        int id = taskA.getId() + taskB.getId();
        assertFalse(collection.existById(id));
    }

}
