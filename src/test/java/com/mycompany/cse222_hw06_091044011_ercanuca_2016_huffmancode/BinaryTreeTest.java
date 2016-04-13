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
    @Test
    public void testGetLeftSubtree() {
        System.out.println("getLeftSubtree");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = instance;
        BinaryTree result = instance.getLeftSubtree();
        assertEquals(expResult.getLeftSubtree(), result);
    }

    /**
     * Test of getRightSubtree method, of class BinaryTree.
     */
    @Test
    public void testGetRightSubtree() {
        System.out.println("getRightSubtree");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = instance;
        BinaryTree result = instance.getRightSubtree();
        assertEquals(expResult.getRightSubtree(), result);
    }

    /**
     * Test of getData method, of class BinaryTree.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        BinaryTree instance = new BinaryTree(11, null, null);
        Object expResult = 11;
        Object result = instance.getData();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isLeaf method, of class BinaryTree.
     */
    @Test
    public void testIsLeaf() {
        System.out.println("isLeaf");
        BinaryTree instance = new BinaryTree(11, 
                                  new BinaryTree(12, null, null),
                                  new BinaryTree(13, null, null));
        
        boolean expResult = instance.getLeftSubtree().isLeaf();
        boolean result = instance.getRightSubtree().isLeaf();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class BinaryTree.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BinaryTree instance = new BinaryTree(23,null,null);
        String expResult = "23\n" +
                           "  null\n" +
                           "  null\n";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of readBinaryTree method, of class BinaryTree.
     */
    @Test(expected = NullPointerException.class)
    public void testReadBinaryTree() throws Exception {
        System.out.println("readBinaryTree");
        BufferedReader bR = new BufferedReader(null);
        BinaryTree<String> expResult = null;
        BinaryTree<String> result = BinaryTree.readBinaryTree(bR);
        assertEquals(expResult, result);
        
    }
    
}
