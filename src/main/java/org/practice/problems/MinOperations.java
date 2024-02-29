package org.practice.problems;

import java.util.*;

public class MinOperations {


    public static int minOperations(int[] nums) {
        Map<Integer, Integer> valueCount = new HashMap<>();

        for (int ch : nums) {
            if (!valueCount.containsKey(ch)) {
                valueCount.put(ch, 1);
            } else {
                valueCount.put(ch, valueCount.get(ch) + 1);
            }
        }

        int count = 0;

        /**
         *  any int without 1 we can divide by the combination or individual by 2 and 3
         */

        for (Map.Entry<Integer, Integer> entry : valueCount.entrySet()) {

            Integer value = entry.getValue();

            if (value == 1) return -1;

            count += value / 3;

            if (value % 3 != 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(minOperations(new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4}));
        System.out.println(minOperations(new int[]{2, 1, 2, 2, 3, 3}));
        System.out.println(minOperations(new int[]{3,14,3,14,3,14,14,3,3,14,14,14,3,14,14,3,14,14,14,3}));
        System.out.println(minOperations(new int[]{7,7,7,7,7,7,7,16,7,7,7,16,7,16,7,16,16,16,16,7}));
        System.out.println(minOperations(new int[]{14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12}));

    }
}
