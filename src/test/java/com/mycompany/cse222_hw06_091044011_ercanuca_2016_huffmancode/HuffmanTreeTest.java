/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.io.PrintStream;
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
public class HuffmanTreeTest {
    
    public HuffmanTreeTest() {
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
     * Test of buildTree method, of class HuffmanTree.
     */
    @org.junit.Test
    public void testBuildTree() {
        System.out.println("buildTree");
        HuffmanTree.HuffData[] symbols = null;
        HuffmanTree instance = new HuffmanTree();
        instance.buildTree(symbols);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCode method, of class HuffmanTree.
     */
    @org.junit.Test
    public void testPrintCode() {
        System.out.println("printCode");
        PrintStream out = null;
        HuffmanTree instance = new HuffmanTree();
        instance.printCode(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decode method, of class HuffmanTree.
     */
    @org.junit.Test
    public void testDecode() {
        System.out.println("decode");
        String codedMessage = "";
        HuffmanTree instance = new HuffmanTree();
        String expResult = "";
        String result = instance.decode(codedMessage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HuffmanTree.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HuffmanTree instance = new HuffmanTree();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HuffmanTree.
     */
    @org.junit.Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        HuffmanTree.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encode method, of class HuffmanTree.
     */
    @org.junit.Test
    public void testEncode() {
        System.out.println("encode");
        String message = "";
        BinaryTree<HuffmanTree.HuffData> huffmanTree = null;
        HuffmanTree instance = new HuffmanTree();
        String expResult = "";
        String result = instance.encode(message, huffmanTree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
