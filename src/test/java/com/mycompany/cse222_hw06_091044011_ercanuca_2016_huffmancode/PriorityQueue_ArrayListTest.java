/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.Comparator;
import java.util.PriorityQueue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class PriorityQueue_ArrayListTest {
    
    public PriorityQueue_ArrayListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dequeue method, of class PriorityQueue_ArrayList.
     */
    @Test( expected = NullPointerException.class)
    public void testDequeue() {
        System.out.println("dequeue");
        PriorityQueue_ArrayList instance = null;
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
    }

    /**
     * Test of enqueue method, of class PriorityQueue_ArrayList.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Integer element = 77;
        PriorityQueue queue = new PriorityQueue();
        Comparator comp = null;
        PriorityQueue_ArrayList instance = new PriorityQueue_ArrayList(queue, comp);
        instance.enqueue(element);
    }

    /**
     * Test of isEmpty method, of class PriorityQueue_ArrayList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PriorityQueue queue = new PriorityQueue();
        Comparator comp = null;
        PriorityQueue_ArrayList instance = new PriorityQueue_ArrayList(queue, comp);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of size method, of class PriorityQueue_ArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PriorityQueue queue = new PriorityQueue();
        Comparator comp = null;
        PriorityQueue_ArrayList instance = new PriorityQueue_ArrayList(queue, comp);
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class PriorityQueue_ArrayList.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        PriorityQueue queue = new PriorityQueue();
        Comparator comp = null;
        PriorityQueue_ArrayList instance = new PriorityQueue_ArrayList(queue, comp);
        PriorityQueue queue2 = new PriorityQueue();
        Comparator comp2 = null;
        PriorityQueue_ArrayList instance2 = new PriorityQueue_ArrayList(queue, comp);
        String expResult = instance.toString();
        String result = instance2.toString();
        assertEquals(expResult, result);
    }
    
}
