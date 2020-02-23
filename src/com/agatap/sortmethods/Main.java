package com.agatap.sortmethods;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ewa", "Magda", "Adrian", "Adam", "Agata");

        System.out.println("Gentleman Checker:");
        Checker<String> gentlemanChecker = new GentlemanNameChecker();
        String minName = Utils.findMin(names, gentlemanChecker);
        System.out.println(minName);

        System.out.println("Ladies Checker:");
        Checker<String> nameAChecker = new NameAChecker();
        String aName = Utils.findMin(names, nameAChecker);
        System.out.println(aName);

        System.out.println("Max Number:");
        List<Integer> numberMax = Arrays.asList(2, 3, 10, 0, 25, 3, 4, 55);
        Checker<Integer> maxAChecker = new MaxAChecker();
        Integer aNameMax = Utils.findMax(numberMax, maxAChecker);
        System.out.println(aNameMax);

        List<Integer> number = Arrays.asList(2, 3, 10, 0, 25, 3, 4, 55);
        Checker<Integer> sortChecker = new SortChecker();
        Utils.sort(number, sortChecker);
        System.out.println(number);


        List<Integer> number2 = Arrays.asList(33, 3, 10, 0, 25, 3, 104, 55);
        Comparator<Integer> comparator1 = new StringLengthComparator();
        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Comparator<Integer> comparator3 = (o1, o2) -> o2 - o1;

        System.out.println("Comparator - SORT COMPARE:");
        Utils.sortCompare(number2, comparator1);
        System.out.println(number2);

        System.out.println("Comparator - BUUBLE SORT:");
        List<Integer> number3 = Arrays.asList(33, 1, 10, 0, 55, 2, 2, 111, 55);
        Utils.bubbleSortCompare(number3, comparator2);
        System.out.println(number3);

        System.out.println("Comparator lambda - BUUBLE SORT: ");
        List<Integer> number4 = Arrays.asList(2, 33, 1, 10, 55, 1, 111, 55);
        Utils.bubbleSortCompare(number4, comparator3);
        System.out.println(number4);
    }
}
