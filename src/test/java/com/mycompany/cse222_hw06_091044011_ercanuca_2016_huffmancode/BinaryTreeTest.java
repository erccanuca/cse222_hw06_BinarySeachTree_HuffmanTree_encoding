/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.io.BufferedReader;
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
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
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
     * Test of getLeftSubtree method, of class BinaryTree.
     */
    @org.junit.Test
    public void testGetLeftSubtree() {
        System.out.println("getLeftSubtree");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.getLeftSubtree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRightSubtree method, of class BinaryTree.
     */
    @org.junit.Test
    public void testGetRightSubtree() {
        System.out.println("getRightSubtree");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.getRightSubtree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class BinaryTree.
     */
    @org.junit.Test
    public void testGetData() {
        System.out.println("getData");
        BinaryTree instance = new BinaryTree();
        Object expResult = null;
        Object result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeaf method, of class BinaryTree.
     */
    @org.junit.Test
    public void testIsLeaf() {
        System.out.println("isLeaf");
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.isLeaf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BinaryTree.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        BinaryTree instance = new BinaryTree();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readBinaryTree method, of class BinaryTree.
     */
    @org.junit.Test
    public void testReadBinaryTree() throws Exception {
        System.out.println("readBinaryTree");
        BufferedReader bR = null;
        BinaryTree<String> expResult = null;
        BinaryTree<String> result = BinaryTree.readBinaryTree(bR);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
