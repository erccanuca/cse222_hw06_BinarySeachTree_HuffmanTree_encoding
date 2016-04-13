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
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        MyQueue instance = new MyQueueImpl();
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
    }

    /**
     * Test of enqueue method, of class MyQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object element = null;
        MyQueue instance = new MyQueueImpl();
        instance.enqueue(element);
    }

    /**
     * Test of isEmpty method, of class MyQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        MyQueue instance = new MyQueueImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result); 
    }

    /**
     * Test of size method, of class MyQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyQueue instance = new MyQueueImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    public class MyQueueImpl<E> implements MyQueue<E> {

        @Override
        public E dequeue() {
            return null;
        }

        @Override
        public void enqueue(E element) {
            return;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

       
    }
    
}
