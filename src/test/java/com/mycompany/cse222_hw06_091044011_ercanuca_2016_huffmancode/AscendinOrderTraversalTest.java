/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.Iterator;
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
public class AscendinOrderTraversalTest {
    
    public AscendinOrderTraversalTest() {
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
     * Test of hasNext method, of class AscendinOrderTraversal.
     */
    @org.junit.Test
    public void testHasNext() {
        System.out.println("hasNext");
        AscendinOrderTraversal instance = null;
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class AscendinOrderTraversal.
     */
    @org.junit.Test
    public void testNext() {
        System.out.println("next");
        AscendinOrderTraversal instance = null;
        Object expResult = null;
        Object result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AscendinOrderTraversal.
     */
    @org.junit.Test
    public void testRemove() {
        System.out.println("remove");
        AscendinOrderTraversal instance = null;
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class AscendinOrderTraversal.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        AscendinOrderTraversal instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AscendinOrderTraversal.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AscendinOrderTraversal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
