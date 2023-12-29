package org.practice.problems;


// 1672. Richest Customer Wealth
public class RichestCustomeWealth {
    public static void main(String[] args) {

        int[][] accounts = { {1, 2, 3, 4}, {5, 6, 7} };
        int maxWealth= 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
                if(wealth > maxWealth) maxWealth = wealth;
            }
        }
        System.out.println(maxWealth);
    }
}
