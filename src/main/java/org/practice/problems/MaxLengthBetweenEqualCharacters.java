package org.practice.problems;
import java.util.HashMap;

// 1624. Largest Substring Between Two Equal Characters

public class MaxLengthBetweenEqualCharacters {
    public static void main(String[] args) {
        String s = "jlcbzcxjy";

        HashMap<Character, Integer> firstIndex = new HashMap<>();
        int ans = -1;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if(!firstIndex.containsKey(character)){
                firstIndex.put(character, i);
            } else {
                int subStringLength = i - 1 - firstIndex.get(character);
                ans = Math.max(ans, subStringLength);
            }
        }
        System.out.println(ans);
    }
}
