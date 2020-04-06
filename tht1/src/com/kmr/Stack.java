/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmr;

/**
 *
 * @author kamaj
 */
public class Stack {

    private ListItem top;
    private int size;

    // muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData) {
        ListItem item = new ListItem();
        item.setData(aData);
        if (top != null) {
            ListItem last;
            for (last = top; last.getNext() != null; last = last.getNext());
            last.setNext(item);
        } else {
            top = item;
        }
        size ++;
    }
    // poista ja palauta alkio pinon huipulta,
    // jos pino tyhjä palauta null
    public ListItem pop(){
        if (top != null) {
            ListItem temp;
            temp = top;
            top = top.getNext();
            size--;
            return temp;
        }
        return null;
    }
    // tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        ListItem temp = top;
        while( temp != null) {
            System.out.print(temp.getData()+ ", ");
            temp = temp.getNext();
        }
    }
    public int getSize() {
        return size;
    }

}
