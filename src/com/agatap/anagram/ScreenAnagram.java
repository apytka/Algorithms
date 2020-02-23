package com.agatap.anagram;

import java.util.Scanner;

public class ScreenAnagram {
    public void welcome() {
        System.out.println(">>> ANAGRAM <<<");
    }

    public String getWord(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }
}
