package org.practice.problems;

// 1342. Number of Steps to Reduce a Number to Zero
public class NumberOfSteps {
    public static void main(String[] args) {

        int num = 5;

        int count = 0;

        while ( num > 0) {
            boolean divisibleBy2 = num % 2 == 0;

            if (!divisibleBy2) {
                 num -= 1;
                count += 1;
            }

           if(num > 0) {
               num /= 2;
               count += 1;
           }

        }

        System.out.println(count);

    }
}
