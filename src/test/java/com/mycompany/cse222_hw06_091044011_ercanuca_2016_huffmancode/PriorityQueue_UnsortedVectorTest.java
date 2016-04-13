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
public class PriorityQueue_UnsortedVectorTest {
    
    public PriorityQueue_UnsortedVectorTest() {
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
     * Test of dequeue method, of class PriorityQueue_UnsortedVector.
     */
    @org.junit.Test
    public void testDequeue() {
        System.out.println("dequeue");
        PriorityQueue_UnsortedVector instance = null;
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enqueue method, of class PriorityQueue_UnsortedVector.
     */
    @org.junit.Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object element = null;
        PriorityQueue_UnsortedVector instance = null;
        instance.enqueue(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class PriorityQueue_UnsortedVector.
     */
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PriorityQueue_UnsortedVector instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class PriorityQueue_UnsortedVector.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        PriorityQueue_UnsortedVector instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PriorityQueue_UnsortedVector.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        PriorityQueue_UnsortedVector instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
