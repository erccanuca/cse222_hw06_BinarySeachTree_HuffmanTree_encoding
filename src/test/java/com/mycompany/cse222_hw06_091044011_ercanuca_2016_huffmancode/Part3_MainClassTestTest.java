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
public class Part3_MainClassTestTest {
    
    public Part3_MainClassTestTest() {
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
     * Test of main method, of class Part3_MainClassTest.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Part3_MainClassTest.main(args);
     
    }

    /**
     * Test of test_ArrayList method, of class Part3_MainClassTest.
     */
    @org.junit.Test
    public void testTest_ArrayList() {
        System.out.println("test_ArrayList");
        PriorityQueue<Integer> queue = null;
        Comparator<Integer> com = null;
        Part3_MainClassTest.test_ArrayList(queue, com);
     
    }

    /**
     * Test of test_LinkedList method, of class Part3_MainClassTest.
     */
    @org.junit.Test
    public void testTest_LinkedList() {
        System.out.println("test_LinkedList");
        PriorityQueue<Integer> queue = null;
        Comparator<Integer> com = null;
        Part3_MainClassTest.test_LinkedList(queue, com);
        
    }

    /**
     * Test of test_UnSortedVector method, of class Part3_MainClassTest.
     */
    @org.junit.Test
    public void testTest_UnSortedVector() {
        System.out.println("test_UnSortedVector");
        PriorityQueue<Integer> queue = null;
        Comparator<Integer> com = null;
        Part3_MainClassTest.test_UnSortedVector(queue, com);
       
    }

    /**
     * Test of test_BinarySearchTreeTest method, of class Part3_MainClassTest.
     */
    @org.junit.Test
    public void testTest_BinarySearchTreeTest() {
        System.out.println("test_BinarySearchTreeTest");
        PriorityQueue<Integer> queue = null;
        Comparator<Integer> com = null;
        Part3_MainClassTest.test_BinarySearchTreeTest(queue, com);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
