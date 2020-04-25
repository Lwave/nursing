package com.ssm.test;

import java.util.Arrays;

public class test8 {
    public static void main(String[] args) {
        String s = "56,89,5,3,75,98,98,26,15,44";
        String[] split = s.split(",");
        System.out.println(Arrays.deepToString(split));
        Integer[] i1 = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            i1[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(i1);//排序
        for (Integer o : i1) {
            System.out.print(o+ ",");
        }
    }
}
