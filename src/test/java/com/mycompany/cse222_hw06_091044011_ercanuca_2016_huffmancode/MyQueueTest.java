/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

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
public class MyQueueTest {
    
    public MyQueueTest() {
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
     * Test of dequeue method, of class MyQueue.
     */
    @org.junit.Test
    public void testDequeue() {
        System.out.println("dequeue");
        MyQueue instance = new MyQueueImpl();
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enqueue method, of class MyQueue.
     */
    @org.junit.Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object element = null;
        MyQueue instance = new MyQueueImpl();
        instance.enqueue(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class MyQueue.
     */
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        MyQueue instance = new MyQueueImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MyQueue.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        MyQueue instance = new MyQueueImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MyQueueImpl implements MyQueue {

        public E dequeue() {
            return null;
        }

        public void enqueue(E element) {
        }

        public boolean isEmpty() {
            return false;
        }

        public int size() {
            return 0;
        }
    }
    
}
