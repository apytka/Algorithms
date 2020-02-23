package com.agatap.sortmethods;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
