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
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        BinaryTree<Integer> tree = new BinaryTree<>(23,null,null);
        AscendinOrderTraversal instance = new AscendinOrderTraversal(tree);
        boolean expResult = true;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of class AscendinOrderTraversal.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        BinaryTree<Integer> tree = new BinaryTree<>(23,null,null);
        AscendinOrderTraversal instance = new AscendinOrderTraversal(tree);
        Integer expResult = new Integer(23);
        Integer result = (Integer) instance.next();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class AscendinOrderTraversal.
     * throw UnsupportedOperationException
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testRemove() {
        System.out.println("remove");
        BinaryTree<Integer> tree = new BinaryTree<>(23,null,null);
        AscendinOrderTraversal instance = new AscendinOrderTraversal(tree);
        instance.remove();
    }

    /**
     * Test of iterator method, of class AscendinOrderTraversal.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        BinaryTree<Integer> tree = new BinaryTree<>(23,null,null);
        AscendinOrderTraversal instance = new AscendinOrderTraversal(tree);
        AscendinOrderTraversal instance2 = new AscendinOrderTraversal(tree);
        Iterator<Integer> itr = instance.iterator();
        Iterator<Integer> itr2 = instance.iterator();
        assertEquals(itr, itr2);
    }

    /**
     * Test of main method, of class AscendinOrderTraversal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AscendinOrderTraversal.main(args);
    }
    
}
