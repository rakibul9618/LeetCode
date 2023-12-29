package org.practice.problems;

import java.util.ArrayList;
import java.util.List;

// 412. Fizz Buzz
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 5;
        List<String> answer= new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currString = "";
            if(divisibleBy3)  currString += "Fizz";
            if(divisibleBy5)   currString += "Buzz";
            if(currString.isEmpty()) currString += String.valueOf(i);

            answer.add(currString);
        }

        System.out.println(answer);
    }
}
