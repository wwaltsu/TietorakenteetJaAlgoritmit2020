/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmr;

import java.util.LinkedList;

/**
 *
 * @author kamaj
 */
public class Stack {

        ListItem top; // top näkyy oletuspakkaukseen
        LinkedList<ListItem> linkedList = new LinkedList<>();
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
                linkedList.add(top);
                size++;
        }
        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public ListItem pop() {
                ListItem takeAway;
                if (top == null) { takeAway = null; // pino on tyhjä
                } else {
                        size--;
                        takeAway = top;
                        top = top.getLink();
                }
                return takeAway;
        }
        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return size;
        }
        // listataan sisältö
        public void printItems() {
                if (size == 0) { /* pino on tyhjä */ System.out.println("Pino on tyhjä"); }
                for (ListItem item : linkedList) { System.out.print(item.getData());

                }
        }
}


