package com.agatap.unique;

import java.util.Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] tab = {0, 2, 4, 2, 6, 7, 4, 3, 12, 6};
        System.out.println(Arrays.toString(tab));

        System.out.println("Unique number: ");
        for (int i = 0; i < tab.length; i++) {
            boolean uniq = true;
            for (int j = 0; j < tab.length; j++) {
                if (i != j) {
                    if(tab[i] == tab[j]) {
                        uniq = false;
                    }
                }
            }
            if(uniq) {
                System.out.print(tab[i] + "\t");
            }
        }
        System.out.println();
        System.out.println("Sort table: ");
        int tmp;
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if(tab[j] > tab[j + 1] ) {
                    tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
