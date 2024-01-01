package org.practice.problems;

import java.util.Arrays;

// 455. Assign Cookies

public class FindContentChildren {

    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0, i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }
        System.out.println(count);

    }
}
