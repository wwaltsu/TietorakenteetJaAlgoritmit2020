package com.kmr;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Give hashing size");
        ClosedHashing closedHashing = new ClosedHashing(lukija.nextInt());

        char input;
        do {
            int indeksi;

            System.out.println("0: Quit\n1: Add key\n2: Search key\n3: print detail");
            input = lukija.next().charAt(0);
            switch (input) {
                case '1':
                    System.out.println("Give index of a key");
                    indeksi = lukija.nextInt();
                    System.out.println("Give key detail.");
                    closedHashing.add(indeksi, lukija.next());
                    break;
                case '2':
                    System.out.println("Give searched key");
                    indeksi = lukija.nextInt();
                    System.out.println(closedHashing.searchKey(indeksi));
                    break;
                case '3':
                    closedHashing.printAll();
                    break;

            }
        } while (input != '0');

        lukija.close();
    }
}