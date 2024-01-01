package org.practice.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 383. Ransom Note

public class RansomNote {
    public static boolean canConstructABoolean(String ransomNote, String magazine) {

        Map<Character, Integer> chMap = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            if (chMap.containsKey(ch)) chMap.put(ch, chMap.get(ch) + 1);
            else chMap.put(ch, 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (!chMap.containsKey(ch)) return false;
            if(chMap.containsKey(ch) && chMap.get(ch) <= 0 ) return  false;
            chMap.put(ch, chMap.get(ch) - 1);
        }

        return true;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] characterFrequency = new int[26];

        for (char ch : magazine.toCharArray()) characterFrequency[ch - 'a']++;

        for (char ch : ransomNote.toCharArray()) {
            int characterIndex = ch - 'a';
            if (characterFrequency[characterIndex] <= 0 ) return  false;
            characterFrequency[characterIndex]--;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        char[] ransomNoteArray = ransomNote.toCharArray();
        System.out.println(canConstruct(ransomNote, magazine));

    }
}
