package org.practice.problems;

// 2125. Number of Laser Beams in a Bank

public class NumberOfBeams {


    public static int numberOfBeams(String[] bank) {

        int r1 = 0, ans = 0;

        for (String s : bank) {
            if (s.contains("1")) {
                int r2 = 0;
                for (char ch : s.toCharArray()) {
                    if (ch == '1') r2++;
                }
                ans += r1 * r2;
                r1 = r2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
        System.out.println(numberOfBeams(new String[]{"000", "111", "000"}));

//        System.out.println("11".toCharArray());
    }
}
