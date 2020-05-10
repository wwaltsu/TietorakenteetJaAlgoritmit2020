/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kmr;

import java.util.TreeSet;

/**
 *
 * @author kamaj
 */
public class Menu {
    //main alkaa-----------------------------------------------------------------------------
    public static void main(String[] args) {

        printMenu();

    }
    //main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
    private static void printMenu() {
        char select;
        TreeSet<String> treeSet = new TreeSet<>();
        String data;
        do {

            System.out.println("\n\t\t\t1. Lisää avain.");
            System.out.println("\t\t\t2. Etsi avaimella.");
            System.out.println("\t\t\t3. Käy puu läpi esijärjestyksessä.");
            System.out.println("\t\t\t6. Lopeta");
            System.out.print("\n\n"); // tehdään tyhjiä rivejä
            select = Lue.merkki();
            switch (select) {
                case '1':
                    System.out.println("Anna uusi avain (merkkijono)");
                    data = new String(Lue.rivi());
                    treeSet.add(data);
                    break;
                case '2':
                    System.out.println("Anna etsittävä avain (merkkijono)");
                    data = Lue.rivi();
                    System.out.println(treeSet.contains(data) ? "Avain löytyi.": "Avainta ei löytynyt.");
                    break;
                case '3':
                    for (String string : treeSet) System.out.println(string);
                    break;


            }
        }
        while (select != '6');
    }
//printMenu loppuu ----------------------------------------------------------------
}



