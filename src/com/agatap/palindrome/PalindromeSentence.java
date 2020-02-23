package com.agatap.palindrome;

import java.util.Scanner;

public class PalindromeSentence {

    /* A palindrome is a word, number, phrase,
    or other sequence of characters which reads the same backward as forward. */

    public static void main(String[] args) {
        welcome();
        String sentence = getData();
        System.out.println("If palindrome?  " + palindrome(sentence));
    }

    private static boolean palindrome(String str) {
        String formatted = str.replace(" ", "");
        String reverse = reverse(formatted);
        return formatted.equalsIgnoreCase(reverse);
    }

    private static String reverse(String form) {
        String reverse = "";
        for (int i = 0; i < form.length(); i++) {
            reverse += form.charAt(form.length() - 1 - i);
        }
        return reverse;
    }

    private static String getData() {
        System.out.println("Enter the sentence or word you want to check: ");
        return new Scanner(System.in).nextLine();
    }

    private static void welcome() {
        System.out.println("<< PALINDROME >>");
    }
}