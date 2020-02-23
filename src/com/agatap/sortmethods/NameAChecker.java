package com.agatap.sortmethods;

public class NameAChecker implements Checker<String> {
    @Override
    public boolean isLeftGreater(String o1, String o2) {
        return !o1.toLowerCase().endsWith("a") && o2.toLowerCase().endsWith("a");
    }
}
//        return !(o1.toLowerCase().startsWith("a") && !o2.toLowerCase().startsWith("a"));