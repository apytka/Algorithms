package com.agatap.google;

public class GoogleExercise {
    public static void main(String[] args) {

        /* Is there a sum of two numbers in the array that gives the sum of n */

        System.out.println("=================FIRST METHOD - ORDER TABLE =====================");
        int sumOrderTable = 20;
        int[] orderTable = {1, 1, 2, 3, 6, 7, 9, 13, 15};
        for (int w = 0; w < orderTable.length; w++) {
            System.out.print(orderTable[w] + " ");
        }
        int left = 0;
        int rigt = orderTable.length - 1;
        boolean ifExist = false;

        while (!ifExist && left < rigt) {
            if (orderTable[left] + orderTable[rigt] > sumOrderTable) {
                rigt--;
            } else if (orderTable[left] + orderTable[rigt] < sumOrderTable) {
                left++;
            } else {
                ifExist = true;
            }
        }
        if (ifExist) {
            System.out.printf("Number n = %d, is the sum of the number: %d i %d", sumOrderTable, orderTable[left], orderTable[rigt]);
        }

        System.out.println();
        System.out.println("=================FIRST METHOD - UNORDERED TABLE =====================");
        int n = 57;
        int[] tablica = {10, 1, 7, 12, 16, 29, 31, 42, 50, 1};
        for (int w = 0; w < tablica.length; w++) {
            System.out.print(tablica[w] + " ");
        }

        int sumUnorderedTable = 0;
        int firstElement = tablica[0];
        int nextElement = 0;
        do {
            for (int row = 0; row < tablica.length; row++) {
                for (int column = row + 1; column < tablica.length; column++) {
                    if (n != sumUnorderedTable) {
                        firstElement = tablica[row];
                        nextElement = tablica[column];
                        sumUnorderedTable = firstElement + nextElement;
                    }
                }
            }
        } while (n != sumUnorderedTable);
        System.out.printf("Number n = %d, is the sum of the number: %d i %d", sumUnorderedTable, firstElement, nextElement);
    }
}
