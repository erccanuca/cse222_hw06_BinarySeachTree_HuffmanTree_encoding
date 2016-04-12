/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/**
 *
 * @author ercan
 * @param <E> generic type
 */
public class PriorityQueue_LinkedList<E> implements MyQueue<E>{
     /**
     * My LinkedList queue
     */
    private LinkedList<E> myLinkQueue = new LinkedList<>();
    /**
     * My comparator
     */
    private Comparator<E> comparator = null;
    /**
     * This Constructor take priority queue and comparator
     * @param myQueue my priority queue
     * @param comp my current comparator
     */
    public PriorityQueue_LinkedList(PriorityQueue<E> myQueue,Comparator<E> comp) {
        this.comparator = comp;
        /* Add element to LinkedList end*/

        for(int i = myQueue.size()-1; i >= 0 ; --i){
            myLinkQueue.addFirst(myQueue.element());
            myQueue.remove();
        }
    }
    /**
     * Remove first element of linked queue
     * throw NoSuchElementException
     * @return and return removed element.
     */
    @Override
    public E dequeue() {
        if(myLinkQueue.isEmpty()){
            throw new NoSuchElementException();
        }
       return myLinkQueue.removeFirst();
    }
    /**
    * Add element at end
    * @param element will be add. 
    */
    @Override
    public void enqueue(E element) {
         myLinkQueue.addLast(element);
    }
    /**
     * This method, look my linkedlist queue is empty.
     * @return if empty true, otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return myLinkQueue.isEmpty();
    }
    /**
     * Return number of my link queue
     * @return the size of my link queue.
     */
    @Override
    public int size() {
        return myLinkQueue.size();
    }
    
    /**
     * Show about this
     * @return information of current class.
     */
    @Override
    public String toString() {
        return "PriorityQueue_LinkedList{" + "myLinkQueue=" + myLinkQueue + '}';
    }
        
}
