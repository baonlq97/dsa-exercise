package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence testCase = new LongestConsecutiveSequence();
        testCase.longestConsecutive(new int[] {
                100, 4, 200, 1, 3, 2
        });
    }

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        var totalConsecutive = 1;
        var longest = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                totalConsecutive += 1;
                if (totalConsecutive > longest) {
                    longest = totalConsecutive;
                }
            }
            else {
                totalConsecutive = 1;
            }

        }
        return longest;
    }
}
