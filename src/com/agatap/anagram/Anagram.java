package com.agatap.anagram;

public class Anagram {
    private ScreenAnagram screenAnagram = new ScreenAnagram();
    private Action action = new Action();

    public void anagram() {
        screenAnagram.welcome();
        String word = screenAnagram.getWord("Longer world: ");
        String checkWord = screenAnagram.getWord("Short world: ");
        char[] wordC = word.toCharArray();
        char[] checkWordC = checkWord.toCharArray();
        boolean score = action.ifAnagram(wordC, checkWordC);
        System.out.printf("Word %s is palindrome world %s? %s", checkWord, word, score);
    }
}
