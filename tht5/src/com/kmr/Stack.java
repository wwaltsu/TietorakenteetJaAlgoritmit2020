/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmr;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author kamaj
 */
public class Stack {

    ListItem top; // top näkyy oletuspakkaukseen
    LinkedList<String> linkedList = new LinkedList<>();
    private int size;


    public Stack() {
        top = null;
        size = 0;
    }

    //  palautetaan pino-iteraattori
    public StackIterator iterator() {
        return new StackIterator(this);
    }

    // muodostetaan uusi alkio ja viedään se huipulle
    public void push(String aData) {
        top = new ListItem();
        top.setData(aData);
        linkedList.add(aData);
        size++;
    }

    // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
    public ListItem pop() {
        if (top == null) {
        }
        linkedList.removeLast();
        size--;
        return top;
    }

    // palautetaan pinottujen alkioiden lukumäärä
    public int getSize() {
        return size;
    }

    // listataan sisältö
    public void printItems() {
        if (top == null) {
            System.out.println("Pino on tyhjä");
        }
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());


    }
}



