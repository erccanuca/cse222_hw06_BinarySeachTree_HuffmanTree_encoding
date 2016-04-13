/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author ercan
 */
public class Part3_MainClassTest {
    
    public static void main(String[] args) {
        //natural priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<>(10);
        queue.add(12);
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
               return t.compareTo(t1);
            }
        };
        test_ArrayList(queue, com);
        test_LinkedList(queue, com);
        test_UnSortedVector(queue, com);
        test_BinarySearchTreeTest(queue, com);
        
    }
    
    public static void test_ArrayList(PriorityQueue<Integer> queue, Comparator<Integer> com){
        
        System.out.println("--------------ARRAYLIST_QUEUE_TEST------------------");
        PriorityQueue_ArrayList<Integer> myArrQueue = new PriorityQueue_ArrayList<>(queue,com);
        
        System.out.println("****************For 1 integer*******************");
        System.out.println("**************Enqueu 1 element******************");
        Random rand = new Random();
        long startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            //System.out.print("Add ");
            myArrQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        
        System.out.println("**************Dequeu 1 element******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            Integer removed = myArrQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1 number*******************\n");
        
        System.out.println("****************For 10 integer********************");
        System.out.println("**************Enqueu 10 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
           // System.out.print("Add ");
            myArrQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 10 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
            Integer removed = myArrQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("************End for 10 numbers**********************\n");
        
        System.out.println("**************For 100 integer***********************");
        System.out.println("***********Enqueu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            myArrQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("***********Dequeu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            Integer removed = myArrQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************End for 100 number********************\n");
        
        System.out.println("***************For 1000 integer*********************");
        System.out.println("**************Enqueu 1000 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            myArrQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 1000 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            Integer removed = myArrQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1000 number*****************\n");
        
        System.out.println("****************For 10000 integer*******************");
        System.out.println("**************Enqueu 10000 elements*****************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            myArrQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 10000 elements*****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            Integer removed = myArrQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 10000 number****************\n");
        
        System.out.println("****************For 100000 integer******************");
        System.out.println("**************Enqueu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            myArrQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            Integer removed = myArrQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 100000 number***************\n");
        
        System.out.println("****************For 1000000 integer*****************");
        System.out.println("**************Enqueu 1000000 elements***************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            myArrQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 1000000 elements***************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            Integer removed = myArrQueue.dequeue();
            //  System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 1000000 number**************\n");
        System.out.println("----------------END_ARRAYLIST_QUEUE_TEST------------");
    }
    public static void test_LinkedList(PriorityQueue<Integer> queue, Comparator<Integer> com){
        
        System.out.println("--------------LINKEDLIST_QUEUE_TEST------------------");
        PriorityQueue_LinkedList<Integer> linkedQueue = new PriorityQueue_LinkedList<>(queue,com);
        
        System.out.println("****************For 1 integer*******************");
        System.out.println("**************Enqueu 1 element******************");
        Random rand = new Random();
        long startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            //System.out.print("Add ");
            linkedQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        
        System.out.println("**************Dequeu 1 element******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            Integer removed = linkedQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1 number*******************\n");
        
        System.out.println("****************For 10 integer********************");
        System.out.println("**************Enqueu 10 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
           // System.out.print("Add ");
            linkedQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 10 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
            Integer removed = linkedQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("************End for 10 numbers**********************\n");
        
        System.out.println("**************For 100 integer***********************");
        System.out.println("***********Enqueu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            linkedQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("***********Dequeu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            Integer removed = linkedQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************End for 100 number********************\n");
        
        System.out.println("***************For 1000 integer*********************");
        System.out.println("**************Enqueu 1000 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            linkedQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 1000 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            Integer removed = linkedQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1000 number*****************\n");
        
        System.out.println("****************For 10000 integer*******************");
        System.out.println("**************Enqueu 10000 elements*****************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            linkedQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 10000 elements*****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            Integer removed = linkedQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 10000 number****************\n");
        
        System.out.println("****************For 100000 integer******************");
        System.out.println("**************Enqueu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            linkedQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            Integer removed = linkedQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 100000 number***************\n");
        
        System.out.println("****************For 1000000 integer*****************");
        System.out.println("**************Enqueu 1000000 elements***************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            linkedQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 1000000 elements***************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            Integer removed = linkedQueue.dequeue();
            //  System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 1000000 number**************\n");
        System.out.println("----------------END_LINKEDLIST_QUEUE_TEST------------");
    }
    public static void test_UnSortedVector(PriorityQueue<Integer> queue, Comparator<Integer> com){
        
        System.out.println("--------------UNSORTED_VECTOR_QUEUE_TEST------------------");
        PriorityQueue_UnsortedVector<Integer> myUnsortedVectorQueue = new PriorityQueue_UnsortedVector<>(queue,com);
        
        System.out.println("****************For 1 integer*******************");
        System.out.println("**************Enqueu 1 element******************");
        Random rand = new Random();
        long startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            //System.out.print("Add ");
            myUnsortedVectorQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        
        System.out.println("**************Dequeu 1 element******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            Integer removed = myUnsortedVectorQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1 number*******************\n");
        
        System.out.println("****************For 10 integer********************");
        System.out.println("**************Enqueu 10 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
           // System.out.print("Add ");
            myUnsortedVectorQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 10 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
            Integer removed = myUnsortedVectorQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("************End for 10 numbers**********************\n");
        
        System.out.println("**************For 100 integer***********************");
        System.out.println("***********Enqueu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            myUnsortedVectorQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("***********Dequeu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            Integer removed = myUnsortedVectorQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************End for 100 number********************\n");
        
        System.out.println("***************For 1000 integer*********************");
        System.out.println("**************Enqueu 1000 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            myUnsortedVectorQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 1000 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            Integer removed = myUnsortedVectorQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1000 number*****************\n");
        
        System.out.println("****************For 10000 integer*******************");
        System.out.println("**************Enqueu 10000 elements*****************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            myUnsortedVectorQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 10000 elements*****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            Integer removed = myUnsortedVectorQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 10000 number****************\n");
        
        System.out.println("****************For 100000 integer******************");
        System.out.println("**************Enqueu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            myUnsortedVectorQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            Integer removed = myUnsortedVectorQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 100000 number***************\n");
        
        System.out.println("****************For 1000000 integer*****************");
        System.out.println("**************Enqueu 1000000 elements***************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            myUnsortedVectorQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 1000000 elements***************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            Integer removed = myUnsortedVectorQueue.dequeue();
            //  System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 1000000 number**************\n");
        System.out.println("----------------END_UNSORTED_VECTOR_QUEUE_TEST------------");
    }
    public static void test_BinarySearchTreeTest(PriorityQueue<Integer> queue, Comparator<Integer> com){
        
        System.out.println("---------BINARY_SEARCH_TREE_QUEUE_TEST------------------");
        PriorityQueue_ArrayList<Integer> myBSTQueue = new PriorityQueue_ArrayList<>(queue,com);
        
        System.out.println("****************For 1 integer*******************");
        System.out.println("**************Enqueu 1 element******************");
        Random rand = new Random();
        long startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            //System.out.print("Add ");
            myBSTQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        
        System.out.println("**************Dequeu 1 element******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1;i++){
            Integer removed = myBSTQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1 number*******************\n");
        
        System.out.println("****************For 10 integer********************");
        System.out.println("**************Enqueu 10 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
           // System.out.print("Add ");
            myBSTQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 10 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++){
            Integer removed = myBSTQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("************End for 10 numbers**********************\n");
        
        System.out.println("**************For 100 integer***********************");
        System.out.println("***********Enqueu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            myBSTQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("***********Dequeu 100 elements**********************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<100;i++){
            Integer removed = myBSTQueue.dequeue();
            //System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************End for 100 number********************\n");
        
        System.out.println("***************For 1000 integer*********************");
        System.out.println("**************Enqueu 1000 elements******************");
        
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            myBSTQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("**************Dequeu 1000 elements******************");
        rand = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            Integer removed = myBSTQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ns\n", totalTime);
        System.out.println("****************End for 1000 number*****************\n");
        
        System.out.println("****************For 10000 integer*******************");
        System.out.println("**************Enqueu 10000 elements*****************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            myBSTQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 10000 elements*****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            Integer removed = myBSTQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 10000 number****************\n");
        
        System.out.println("****************For 100000 integer******************");
        System.out.println("**************Enqueu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            myBSTQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 100000 elements****************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            Integer removed = myBSTQueue.dequeue();
           // System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 100000 number***************\n");
        
        System.out.println("****************For 1000000 integer*****************");
        System.out.println("**************Enqueu 1000000 elements***************");
        
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            myBSTQueue.enqueue(new Integer(rand.nextInt(1000)));
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("**************Dequeu 1000000 elements***************");
        rand = new Random();
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            Integer removed = myBSTQueue.dequeue();
            //  System.out.println("Dequeue Integer:"+removed);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.printf("Took approximately %d ms\n", totalTime);
        System.out.println("****************End for 1000000 number**************\n");
        System.out.println("----------END_BINARY_SEARCH_TREE_QUEUE_TEST---------");
    }
}
