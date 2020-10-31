package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        //有序的可重复的序列
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list1 = Collections.checkedList(list, Integer.class);

        for (Integer i : list1) {
            System.out.println(i);
        }

        List<Integer> intList = Arrays.asList(33, 24, 18, 6, 9, 99);
        System.out.println(Collections.binarySearch(intList, 18));
    }
}
