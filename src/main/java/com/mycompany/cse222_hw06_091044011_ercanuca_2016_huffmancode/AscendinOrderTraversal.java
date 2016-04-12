/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cse222_hw06_091044011_ercanuca_2016_huffmancode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author ercan
 * @param <E> generic type
 */
public class AscendinOrderTraversal<E extends Comparable<E>> implements Iterator<E>,Iterable<E>{
     /**
     * Keeps the current node with all its parent nodes.
     */
    private final LinkedList<BinaryTree<E>> parents;
    /**
     * Walk left node and push all left node to LinkedList reach null
     * @param root The root of our tree
     * throw NullPointerException exception if root null
     */
    public AscendinOrderTraversal(BinaryTree<E> root) {
        
        this.parents = new LinkedList<>();
        try {
            if (root.root == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException exp) {
            exp.printStackTrace(System.err);
        }
 
        BinaryTree<E> current;
        for (current= root; current != null; current = current.getLeftSubtree()) {
            this.parents.push(current);
        }
    }
    /**
     * Look if with iterator we have next element.
     * @return true if have next element, otherwise false.
     */
    @Override
    public boolean hasNext() {
        return !parents.isEmpty();
    }
    /**
     * This method return for next element. Rule of inorder tree
     * @return next element 
     */
    @Override
    public E next() {
       BinaryTree current = parents.pop();
       for(BinaryTree<E> child = current.getRightSubtree(); child !=null; child = child.getLeftSubtree()){
           this.parents.push(child);
       }
       return (E) current.getData();
    }
    /**
    * Not implement.
    */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   /**
    * Out iterator method
    * @return reference of itself.
    */
    @Override
    public Iterator<E> iterator() {
        return this;
    }
    /**
     * Main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        /*
          Created Binary Tree like this.
                                 36  
                              /       \
                             /         \
                            /           \
                           /             \  
                         25               40
                        /   \            /  \
                       /     \          /    \
                      /       \        /      \
                     10       27      35      45
                    /  \     /  \     / \     / \
                   /    \   /    \   /   \   /   \
                  5     15 26    28 32   37 43    50
                 /\     /\ /\    /\ /\   /\ /\    /\
                null    null     null    null     null
        */
       BinaryTree<Integer> tree = new BinaryTree<>(36, 
                                                    new BinaryTree<Integer>(25,
                                                            new BinaryTree<Integer>(10,
                                                                    new BinaryTree<Integer>(5, null, null), 
                                                                    new BinaryTree<Integer>(15, null, null)), 
                                                            new BinaryTree<Integer>(27,
                                                                    new BinaryTree<Integer>(26, null, null), 
                                                                    new BinaryTree<Integer>(28, null, null))),
                                                    new BinaryTree<Integer>(40,
                                                            new BinaryTree<Integer>(35, 
                                                                    new BinaryTree<Integer>(32, null, null), 
                                                                    new BinaryTree<Integer>(37, null, null)),
                                                            new BinaryTree<Integer>(45, 
                                                                    new BinaryTree<Integer>(43, null, null), 
                                                                    new BinaryTree<Integer>(50, null, null))));
           
	/** show all element in tree*/			
        System.out.println(tree.toString());
        AscendinOrderTraversal ascending = new AscendinOrderTraversal(tree);
        Iterator itr = ascending.iterator();
        /*Test for iterator Class*/
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }  
    }
    
}
