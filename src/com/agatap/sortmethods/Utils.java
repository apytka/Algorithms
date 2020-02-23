package com.agatap.sortmethods;

import java.util.Comparator;
import java.util.List;

public class Utils {
    public static <E> E findMin(List<E> names, Checker<E> checker) {
        E min = names.get(0);
        for (int i = 1; i < names.size(); i++) {
            if (checker.isLeftGreater(min, names.get(i))) {
                min = names.get(i);
            }
        }
        return min;
    }

    public static <E> E findMax (List<E> names, Checker<E> checker) {
        E max = names.get(0);
        for (int i = 1; i < names.size(); i++) {
            if (checker.isLeftGreater(max, names.get(i))) {
                max = names.get(i);
            }
        }
        return max;
    }

    public static int findMinInteger(List<Integer> list) {
        if (list.isEmpty()) {
            throw new RuntimeException("empty list is not supported");
        }
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int findMin(int[] date) {
        if (date.length < 1) {
            throw new RuntimeException("empty table is not supported");
        }
        int min = date[0];
        for (int i = 1; i < date.length; i++) {
            if (min > date[i]) {
                min = date[i];
            }
        }
        return min;
    }

    public static <T> void bubbleSortCompare(List<T> list, Comparator<T> comparator) {
        T tmp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if(comparator.compare(list.get(j), list.get(j + 1)) < 0) {
                    tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static <E> void sortCompare(List<E> list, Comparator<E> comparator) {
        int minIndex;
        E tmp;
        for (int j = 0; j < list.size(); j++) {
            minIndex = j;
            for (int i = j + 1; i < list.size(); i++) {
                if (comparator.compare(list.get(minIndex), list.get(i)) < 0) {
                    minIndex = i;
                }
            }
            tmp = list.get(minIndex);
            list.set(minIndex, list.get(j));
            list.set(j, tmp);
        }
    }

    public static <E> void sort(List<E> list, Checker<E> checker) {
        int minIndex;
        E tmp;
        for (int j = 0; j < list.size() - 1; j++) {
            minIndex = j;
            for (int i = j + 1; i < list.size(); i++) {
                if (checker.isLeftGreater(list.get(minIndex), list.get(i))) {
                    minIndex = i;
                }
            }
            tmp = list.get(minIndex);
            list.set(minIndex, list.get(j));
            list.set(j, tmp);
        }
    }

    public static void selectionSort(int[] arr) {
        int minIndex, tmp;

        for (int j = 0; j < arr.length - 1; j++) {
            minIndex = j; // j = 0
            for (int i = j + 1; i < arr.length; i++) { // j+1
                if (arr[i] < arr[minIndex]) { //
                    minIndex = i;
                }
            }
            tmp = arr[minIndex];
            arr[minIndex] = arr[j]; // list.set(minIndex, list.get(j))
            arr[j] = tmp; // j
        }
    }
}

