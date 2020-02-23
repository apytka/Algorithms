package com.agatap.sortmethods;

public class MaxAChecker implements Checker<Integer> {
    @Override
    public boolean isLeftGreater(Integer o1, Integer o2) {
        return o1 < o2;
    }
}
