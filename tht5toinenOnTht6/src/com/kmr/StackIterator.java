/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmr;

import java.util.ArrayList;

/**
 *
 * @author kamaj
 */
interface Iterator {
    boolean hasNext();
    Object next();
}
public class StackIterator implements Iterator {
    private Stack container; // container on tietorakenne, jota iteroidaan
    private ArrayList arrayList;
    private int lkm = 0;

    StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        arrayList = container.array;
    }
    // palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
    // hmm... palautetaan tieto siitä, osoittaako nykypositio (current) alkiota vai ei.
    public boolean hasNext() {
        if (lkm == arrayList.size())
            return false;
        else
            return true;
    }
    // palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä eteenpäin
    public ListItem next() {
        ListItem current;
        if (lkm < arrayList.size()) {
            current = (ListItem) arrayList.get(lkm);
            lkm++;
        } else {
            current = new ListItem();
            lkm = 0;
        }
        return current;
    }

}

