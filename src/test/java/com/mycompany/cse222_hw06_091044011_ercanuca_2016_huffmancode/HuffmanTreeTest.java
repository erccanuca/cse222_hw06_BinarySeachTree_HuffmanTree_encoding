/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.io.ByteArrayOutputStream;
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
    private HuffmanTree.HuffData[] symbols ={
                            new HuffmanTree.HuffData(186, '_'),
                            new HuffmanTree.HuffData(103, 'e'),
                            new HuffmanTree.HuffData(80, 't'),
                            new HuffmanTree.HuffData(64, 'a'),
                            new HuffmanTree.HuffData(63, 'o'),
                            new HuffmanTree.HuffData(57, 'i'),
                            new HuffmanTree.HuffData(57, 'n'),
                            new HuffmanTree.HuffData(51, 's'),
                            new HuffmanTree.HuffData(48, 'r'),
                            new HuffmanTree.HuffData(47, 'h'),
                            new HuffmanTree.HuffData(32, 'd'),
                            new HuffmanTree.HuffData(32, 'l'),
                            new HuffmanTree.HuffData(23, 'u'),
                            new HuffmanTree.HuffData(22, 'c'),
                            new HuffmanTree.HuffData(21, 'f'),
                            new HuffmanTree.HuffData(20, 'm'),
                            new HuffmanTree.HuffData(18, 'w'),
                            new HuffmanTree.HuffData(16, 'y'),
                            new HuffmanTree.HuffData(15, 'g'),
                            new HuffmanTree.HuffData(15, 'p'),
                            new HuffmanTree.HuffData(13, 'b'),
                            new HuffmanTree.HuffData(8, 'v'),
                            new HuffmanTree.HuffData(5, 'k'),
                            new HuffmanTree.HuffData(1, 'j'),
                            new HuffmanTree.HuffData(1, 'q'),
                            new HuffmanTree.HuffData(1, 'x'),
                            new HuffmanTree.HuffData(1, 'z')
    };
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
    @Test
    public void testBuildTree() {
        System.out.println("buildTree");
        HuffmanTree instance = new HuffmanTree();
        instance.buildTree(symbols);
    }

 

    /**
     * Test of decode method, of class HuffmanTree.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String codedMessage = "010";
        HuffmanTree instance = new HuffmanTree();
        instance.buildTree(symbols);
        String expResult = "e";
        String result = instance.decode(codedMessage);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class HuffmanTree.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HuffmanTree.HuffData[] symbols = {
                            new HuffmanTree.HuffData(186, '_'),
                            new HuffmanTree.HuffData(103, 'e'),
                            new HuffmanTree.HuffData(80, 't')
        };
        HuffmanTree instance = new HuffmanTree();
        instance.buildTree(symbols);
        HuffmanTree instance2 = new HuffmanTree();
        instance2.buildTree(symbols);
        String result = instance.toString();
        String result2 = instance2.toString();
        assertEquals(result2, result);
    }

    /**
     * Test of main method, of class HuffmanTree.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        HuffmanTree.main(args);
        
    }

    /**
     * Test of encode method, of class HuffmanTree.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        String message = "e";
        BinaryTree<HuffmanTree.HuffData> huffmanTree = new BinaryTree<>();
        HuffmanTree instance = new HuffmanTree();
        instance.buildTree(symbols);
        String expResult = "010";
        String result = instance.encode(message, huffmanTree);
        assertEquals(expResult, result);
       
    }
    
}
