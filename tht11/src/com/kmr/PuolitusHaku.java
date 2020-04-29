package com.kmr;


class PuolitusHaku {
    //Luodaan hakuoperaatio
    int binarySearch(int array[], int a, int b, int c)
    {
        if (b >= a) {
            int mid = a + (b - a) / 2;


            if (array[mid] == c)
                return mid;

            if (array[mid] > c)
                return binarySearch(array, a, mid - 1, c);


            return binarySearch(array, mid + 1, b, c);
        }

      //Jos avainta ei löydy palauta -1
        return -1;
    }

    public static void main(String args[])
    {
        PuolitusHaku ob = new PuolitusHaku();
        //Lisätään uusi Array
        int array[] = { 1, 2, 3, 20, 50,60, 80, 90 };
        int n = array.length;
        int d = 80;
        int tulos = ob.binarySearch(array, 0, n - 1, d);
        if (tulos == -1)
            System.out.println("Avain ei löytynyt");
        else
            System.out.println("Avain löytyi indeksistä " + tulos);
    }
}
