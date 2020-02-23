package com.agatap.fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

/* Count sum of the numbers Fibonacci
sequence between the given index*/

    public static void main(String[] args) {

        System.out.println("Provide first index: ");
        int min = new Scanner(System.in).nextInt();
        System.out.println("Provide second index: ");
        int max = new Scanner(System.in).nextInt();

        int[] fibonacci = generateFibonacci(max);
        System.out.println(fibonacci(min, max, fibonacci));
    }

    private static int[] generateFibonacci(int max) {
        int[] fibonacci = new int[max + 1];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

        for (int i = 2; i < max + 1; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(Arrays.toString(fibonacci));
        return fibonacci;
    }

    private static int fibonacci(int start, int end, int[] fibonacci) {
        int sum = 0;
        if(start < 0 || start > end) {
            return -1;
        } else {
            for(int i = start; i < end + 1; i++) {
                sum += fibonacci[i];
            }
        }
        return sum;
    }
}
