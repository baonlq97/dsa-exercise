package leetcode;

import java.util.HashMap;

class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        // Bruteforce
        // for (int i = 0; i < ransomNote.length(); i++) {
        // var currentChar = ransomNote.charAt(i);
        // int matchingIndex = magazine.indexOf(currentChar);

        // if (matchingIndex == -1) {
        // return false;
        // }

        // magazine = magazine.substring(0, matchingIndex) +
        // magazine.substring(matchingIndex + 1);
        // }

        // return true;

        // Hashmap
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            var currentChar = magazine.charAt(i);
            int currentCount = magazineMap.getOrDefault(currentChar, 0);
            magazineMap.put(currentChar, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            var currentChar = ransomNote.charAt(i);
            int currentCount = magazineMap.getOrDefault(currentChar, 0);

            if (currentCount == 0) {
                return false;
            }
            magazineMap.put(currentChar, currentCount - 1);
        }
        return true;
    }
}