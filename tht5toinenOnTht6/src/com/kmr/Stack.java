/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmr;

import java.util.ArrayList;

/**
 * @author kamaj
 */

public class Stack {

    ListItem top; // top näkyy oletuspakkaukseen

    ArrayList<ListItem> array;

    public Stack() {
        top = null;
        array = new ArrayList<ListItem>();
    }
    //  palautetaan pino-iteraattori
    public StackIterator iterator() {
        return new StackIterator(this);
    }
    // muodostetaan uusi alkio ja viedään se huipulle
    public void push(String aData) {
        ListItem element = new ListItem(); // luodaan uusi lista-alkio
        element.setData(aData);
        array.add(0, (element));
        element.setLink(top); // kytketään uusi alkio aikaisempaan huippualkioon
        top = element; // uusi alkio pinon 1:ksi

    }
    // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
    public ListItem pop() {
        ListItem takeAway;
        if (array.size() <= 0) { return null; // pino on tyhjä
        }
        else
        {
            takeAway = top;
            top = top.getLink();
            array.remove(0);
        }
        return takeAway;
    }
    // palautetaan pinottujen alkioiden lukumäärä
    public int getSize() {
        return array.size();
    }
    // listataan sisältö
    public void printItems() {
        ListItem lPointer = top;
        while (lPointer != null) {
            System.out.print(lPointer.getData()+", ");
            lPointer = lPointer.getLink();
        }
    }
}






