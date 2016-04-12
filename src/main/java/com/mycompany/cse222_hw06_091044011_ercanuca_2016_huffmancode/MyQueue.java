/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

/**
 *
 * @author ercan
 * @param <E> Generic type
 */
public interface MyQueue<E> {
    /**
     * Removes and returns the element at the front of this queue.
     * @return removed element
     */
    public E dequeue();
    /**
     * Adds the specified element to the back of this queue.
     * @param element will be adding element.
     */      
    public void	enqueue(E element);
    /**
     * Look have element
     * @return if empty true, otherwise false.
     */     
    public boolean isEmpty();
    /**
     * Number of element
     * @return element of size
     */
    public int size();
}
