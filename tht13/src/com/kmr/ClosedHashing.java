package com.kmr;


    public class ClosedHashing {
        private int size;
        private String[] data;

        public ClosedHashing(int size) {
            this.size = size;
            this.data = new String[size];
        }

        public void add(int indeksi, String input) {
            int hashIndex = indeksi % size;

            for (int x = 0; x < size; x++) {
                if (data[hashIndex] == null) {
                    data[hashIndex] = input;
                    break;
                }
                hashIndex = (hashIndex + 1) % size;
            }
        }

        public String searchKey(int index) {
            return data[index % size];
        }

        
        public void printAll() {
            for (String string : data) {
                System.out.println(string);
            }
        }
    }

