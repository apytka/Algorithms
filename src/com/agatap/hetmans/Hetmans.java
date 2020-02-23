package com.agatap.hetmans;

import java.util.Random;

public class Hetmans {

    /* Generate Hetmans table, where "X" they
    cannot overlap vertically, horizontally and diagonally */

    public static void main(String[] args) {
        int current = 0;
        boolean solved;
        int[] hetman;

        do {
            hetman = generateTableHetman();
            solved = checkHetmans(hetman);
            current++;
        } while (!solved);
        printHetmaTable(hetman);
        System.out.println("Hetman table generate for: " + current + " times.");
    }

    private static boolean checkHetmans(int[] hetman) {
        for (int i = 0; i < hetman.length ; i++) {
            for (int j = i + 1; j < hetman.length; j++) {
               if(hetman[i] == hetman[j] || Math.abs(j - i) == Math.abs(hetman[j] - hetman[i])) {
                   return false;
               }
            }
        }
        return true;
    }

    private static void printHetmaTable(int[] hetman) {
        for (int row = 0; row < hetman.length; row++) {
            for (int col = 0; col < hetman.length; col++) {
                System.out.printf("[%s]", col == hetman[row] ? "X" : " " );
            }
            System.out.println();
        }
    }

    private static int[] generateTableHetman() {
        int [] hetman = new int[8];
        for (int i = 0; i < hetman.length; i++) {
            hetman[i] = new Random().nextInt(hetman.length);
        }
        return hetman;
    }
}
