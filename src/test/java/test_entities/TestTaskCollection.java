package test_entities;

import entities.Task;
import entities.TaskCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        TaskCollection collection = new TaskCollection();
        Task exampleTask = new Task("example");
        collection.addItem(exampleTask);
        TaskCollection expected = new TaskCollection();
        expected.getTasks().put(exampleTask.getId(), exampleTask);
        assertEquals(expected, collection);
    }

    /**
     * Test the removeItem method.
     */
    @Test(timeout = 500)
    public void testRemoveItem(){
        TaskCollection expected = new TaskCollection();
        Task exampleTask = new Task("example");
        TaskCollection collection = new TaskCollection();
        collection.removeItem(exampleTask);
        assertEquals(expected, collection);
    }

    /**
     * Test the getTasks method.
     */
    @Test(timeout = 500)
    public void testGetTasks(){
        TaskCollection collection = new TaskCollection();
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
        TaskCollection collection = new TaskCollection();
        collection.setTasks(hashMap);
        assertEquals(hashMap, collection.getTasks());
    }

    /**
     * Test the convertToArray method.
     */
    @Test(timeout = 500)
    public void testConvertToArray(){
        TaskCollection collection = new TaskCollection();
        Task taskA = new Task("CSC207 Project");
        Task taskB = new Task("CSC207 Presentation");
        ArrayList<Task> array = new ArrayList<>();
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
        TaskCollection collection = new TaskCollection();
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
        TaskCollection collection = new TaskCollection();
        collection.addItem(taskA);
        collection.addItem(taskB);
        int id = taskA.getId() + taskB.getId();
        assertFalse(collection.existById(id));
    }

}
