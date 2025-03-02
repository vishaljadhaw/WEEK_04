package com.Day_02.set_interface;


import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        //Create a HashSet and add elements using Arrays.asList()
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Original Set: " + set);

        //Convert Set to List
        List<Integer> list = new ArrayList<>(set);
        System.out.println("Unsorted List: " + list);

        //Sort the list manually using Bubble Sort
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) { //Swap if elements are in the wrong order
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        //Print the sorted list
        System.out.println("Sorted List: " + list);
    }
}





