/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/**
 *
 * @author ercan
 * @param <E> generic type
 */
public class PriorityQueue_BinarySearchTree<E extends Comparable<E>> implements MyQueue<E>{
    /**
     * My BinarySearchTree queue
     */
    private BinarySearchTree<E> myBinarySearchTreeQueue = new BinarySearchTree<>();
    /**
     * My comparator
     */
    private Comparator<E> comparator = null;
    
    private int size  = 0;
    /**
     * This Constructor take priority queue and comparator
     * @param myQueue my priority queue
     * @param comp my current comparator
     */
    public PriorityQueue_BinarySearchTree(PriorityQueue<E> myQueue,Comparator<E> comp) {
        this.comparator = comp;
        /* Add element to binarysearch tree end*/
        for(int i = myQueue.size()-1; i >= 0 ; --i){
            myBinarySearchTreeQueue.add(myQueue.element());
            size++;
            myQueue.remove();
        }
    }
    /**
     * Remove first element of binary search tree queue
     * @return and return removed element.
     */
    @Override
    public E dequeue() {
        if(myBinarySearchTreeQueue.getData()==null){
            throw new NoSuchElementException();
        }
        BinaryTree<E> root = myBinarySearchTreeQueue;
        size--;
        return myBinarySearchTreeQueue.delete(root.getData());
    }
     /**
    * Add element at end
    * @param element will be add. 
    */
    @Override
    public void enqueue(E element) {
        size++;
        myBinarySearchTreeQueue.add(element);
    }
    /**
     * This method, look my tree queue is empty.
     * @return if empty true, otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return !myBinarySearchTreeQueue.isLeaf();
    }
    /**
     * Return number of my tree queue
     * @return the size of my tree queue.
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * Show about this
     * @return information of current class.
     */
    @Override
    public String toString() {
        return "PriorityQueue_BinarySearchTree{" + "myBinarySearchTreeQueue=" + myBinarySearchTreeQueue + '}';
    }
}
