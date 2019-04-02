package com.test;

import com.zhen.commons.util.DateUtil;

import java.nio.DoubleBuffer;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main2(String[] args) {
        String runStartTime = DateUtil.format(System.currentTimeMillis(),
                DateUtil.DATE_TIME);
        System.out.println(runStartTime);
    }

    public static void main3(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ddd");
        set.add("ddd");
        set.add("ccc");
        set.add("ddd");
        for (String s : set) {
            System.out.println(s);

        }

    }

    public static void main4(String[] args) {
        Double i = Double.parseDouble("673.63");
        Long l = Long.valueOf(i.intValue());
        System.out.println(l);
    }

    public static void main(String[] args) {
        int i = 7;
        System.out.println(i -= 1);
    }

}
