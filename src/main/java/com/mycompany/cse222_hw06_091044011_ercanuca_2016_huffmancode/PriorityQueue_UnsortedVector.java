/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Vector;

/**
 *
 * @author ercan
 * @param <E> generic type
 */
public class PriorityQueue_UnsortedVector<E> implements MyQueue<E>{
    /**
     * My UnsortedVector queue
     */
    private Vector<E> myUnsortedVectorQueue = new Vector<>();
    /**
     * My comparator
     */
    private Comparator<E> comparator = null;
    /**
     * This Constructor take priority queue and comparator
     * @param myQueue my priority queue
     * @param comp my current comparator
     */
    public PriorityQueue_UnsortedVector(PriorityQueue<E> myQueue,Comparator<E> comp) {
        this.comparator = comp;
        /* Add element to UnsortedVector end*/

        for(int i = myQueue.size()-1; i >= 0 ; --i){
            myUnsortedVectorQueue.add(0, myQueue.element());
            myQueue.remove();
        }
    }
    /**
     * Remove first element of UnsortedVector queue
     * throw NoSuchElementException
     * @return and return removed element.
     */
    @Override
    public E dequeue() {
        if(myUnsortedVectorQueue.isEmpty()){
            throw new NoSuchElementException();
        }
       return myUnsortedVectorQueue.remove(0);
    }
    /**
    * Add element at end
    * @param element will be add. 
    */
    @Override
    public void enqueue(E element) {
         myUnsortedVectorQueue.add(myUnsortedVectorQueue.size(), element);
    }
    /**
     * This method, look my UnsortedVector queue is empty.
     * @return if empty true, otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return myUnsortedVectorQueue.isEmpty();
    }
    /**
     * Return number of my UnsortedVector queue
     * @return the size of my UnsortedVector queue.
    */
    @Override
    public int size() {
        return myUnsortedVectorQueue.size();
    }
    /**
     * Show about this
     * @return information of current class.
     */
    @Override
    public String toString() {
        return "PriorityQueue_UnsortedVector{" + "myUnsortedVectorQueue=" + myUnsortedVectorQueue + '}';
    }
}