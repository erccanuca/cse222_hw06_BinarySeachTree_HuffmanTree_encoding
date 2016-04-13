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
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
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
     * Test of find method, of class BinarySearchTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Integer target = null;
        BinarySearchTree instance = new BinarySearchTree();
        Integer expResult = null;
        Object result = instance.find(target);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class BinarySearchTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Integer item = 22;
        BinarySearchTree instance = new BinarySearchTree();
        boolean expResult = true;
        boolean result = instance.add(item);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class BinarySearchTree.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer target = 10;
        BinarySearchTree instance = new BinarySearchTree();
        assertTrue(instance.add(target));
        Integer expResult = 10;
        Integer result = (Integer) instance.delete(target);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class BinarySearchTree.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BinarySearchTree.main(args);
    }
    
}
