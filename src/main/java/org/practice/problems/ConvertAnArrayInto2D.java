package org.practice.problems;

import java.util.*;

// 2610. Convert an Array Into a 2D Array With Conditions

public class ConvertAnArrayInto2D {

    public static List<List<Integer>> findMatrix2(int[] nums) {

        Map<Integer, Integer> numCount = new HashMap<>();
        List<List<Integer>> nestedArray = new ArrayList<>();

        for (int num : nums) {
            if (numCount.containsKey(num)) numCount.put(num, numCount.get(num) + 1);
            else numCount.put(num, 1);
        }

        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            Integer num = entry.getKey();
            Integer value = entry.getValue();

            for (int i = 0; i < entry.getValue(); i++) {
                if (nestedArray.size() - 1 >= i) {
                    List<Integer> secondArray = nestedArray.get(i);
                    secondArray.add(num);
                } else {
                    nestedArray.add(i, new ArrayList<>(List.of(num)));
                }

            }

        }
        return nestedArray;
    }


    public static List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length + 1];
        List<List<Integer>> ans = new ArrayList<>();

        for (int num : nums) {
            if (freq[num] >= ans.size()) ans.add(new ArrayList<>());

            ans.get(freq[num]).add(num);
            freq[num]++;
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}));
        System.out.println(findMatrix(new int[]{2, 1, 1}));
        System.out.println(findMatrix(new int[]{1, 2, 3, 4}));
        System.out.println(findMatrix(new int[]{9,8,8,4,9,8,8,3,9}));


    }
}
