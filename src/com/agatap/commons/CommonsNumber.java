package com.agatap.commons;

public class CommonsNumber {
    public static void main(String[] args) {
        int[] tab = {1, 2, 2, 2, 5, 5, 8, 8, 8, 8, 9, 10, 12};

        int quantity = 0;
        int commons = 0;

        int actuallyQuantity = 0;
        int actually = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if(actually == tab[i]) {
                actuallyQuantity++;
                if(actuallyQuantity > quantity) {
                    quantity = actuallyQuantity;
                    commons = actually;
                }
            } else {
                actually = tab[i];
                actuallyQuantity = 1;
            }
        }
        System.out.printf("%d,  %d", commons, quantity);
    }
}
