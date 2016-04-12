/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
/**
 *
 * @author ercan
 * @param <E> Generic type
 */
public class PriorityQueue_ArrayList<E> implements MyQueue<E>{
    /**
     * My arrayList queue
     */
    private ArrayList<E> myArrQueue = new ArrayList<>();
    /**
     * My comparator
     */
    private Comparator<E> comparator = null;
    /**
     * This Constructor take priority queue and comparator
     * @param myQueue my priority queue
     * @param comp my current comparator
     */
    public PriorityQueue_ArrayList(PriorityQueue<E> myQueue,Comparator<E> comp) {
        this.comparator = comp;
        /* Add element to arrayList end*/
        for(int i = myQueue.size()-1; i >= 0 ; --i){
            myArrQueue.add(0,myQueue.element());
            myQueue.remove();
        }
    }
    /**
     * Remove first element of Array queue
     * @return and return removed element.
     */
    @Override
    public E dequeue() {
        if(myArrQueue.isEmpty()){
            throw new NoSuchElementException();
        }
       return myArrQueue.remove(0);
    }
    /**
    * Add element at end
    * @param element will be add. 
    */
    @Override
    public void enqueue(E element) {
         myArrQueue.add(myArrQueue.size(),element);
    }
    /**
     * This method, look my array queue is empty.
     * @return if empty true, otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return myArrQueue.isEmpty();
    }
    /**
     * Return number of my array queue
     * @return the size of my array queue.
     */
    @Override
    public int size() {
        return myArrQueue.size();
    }
    /**
     * Show about this
     * @return information of current class.
     */
    @Override
    public String toString() {
        return "PriorityQueue_ArrayList{" + "myArrQueue=" + myArrQueue + '}';
    }
 
}
