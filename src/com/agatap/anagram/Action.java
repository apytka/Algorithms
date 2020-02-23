package com.agatap.anagram;


public class Action {
    public boolean ifAnagram(char[] wordC, char[] checkWordC) {
        for (int i = 0; i < checkWordC.length; i++) {
            int index = indexOf(checkWordC[i], wordC);
            if (index > -1) {
                checkWordC[i] = 0;
            } else {
                return false;
            }
        }
        return true;
    }

    private int indexOf(char sign, char[] wordC) {
        for (int i = 0; i < wordC.length; i++) {
            if (wordC[i] == sign) {
                return i;
            }
        }
        return -1;
    }
}
