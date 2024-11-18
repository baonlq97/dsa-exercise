package leetcode;

import java.util.HashSet;

class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters testCase = new LongestSubstringWithoutRepeatingCharacters();
        testCase.lengthOfLongestSubstring("dvdf");
    }
    public int lengthOfLongestSubstring(String s) {
        // var length = 0;
        // var maxLength = 0;
        // var containSet = new HashSet<Character>();

        // for (int i = 0; i < s.length(); i++) {
        //     if (containSet.add(s.charAt(i))) {
        //         length++;
        //     }
        //     else {
        //         containSet = new HashSet<>();
        //         containSet.add(s.charAt(i));
        //         length = 1;
        //     }
        //     if (maxLength < length) {
        //         maxLength = length;
        //     }
        // }

        // return maxLength;

        var maxLength = 0;
        int l = 0, r = 0;
        var containSet = new HashSet<>();
        while (l < s.length() && r < s.length()) {
            if (containSet.add(s.charAt(l))) {
                l++;
                if (maxLength < containSet.size()) {
                    maxLength = containSet.size();
                }
                continue;
            }
            else {
                if (maxLength < containSet.size()) {
                    maxLength = containSet.size();
                }
                containSet.clear();
                r++;
                l = r;
                continue;
            }
        }
        return maxLength;
    }
}
