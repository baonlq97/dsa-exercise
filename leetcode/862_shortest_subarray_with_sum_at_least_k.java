package leetcode;
class ShortestSubarrayWithSumAtLeastK {
    public static void main(String[] args) {
        ShortestSubarrayWithSumAtLeastK testCase = new ShortestSubarrayWithSumAtLeastK();
        testCase.shortestSubarray(new int[] { 27,20,79,87,-36,78,76,72,50,-26 }, 453);
    }

    public int shortestSubarray(int[] nums, int k) {
        var minLength = -1;
        int windowSize = 1;
        int left = 0;
        int right = left + windowSize;
        var n = nums.length;

        if (n == 1) {
            if (nums[0] == k) {
                return 1;
            }
            else {
                return minLength;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] >= k) {
                return 1;
            }
        }
 
        var sum = 0;

        while (left < right && right < n) {
            for (int i = left; i <= right; i++) {
                sum += nums[i];
            }
            if (sum >= k) {
                minLength = right - left + 1;
                break;
            }
            else {
                if (right == n - 1 && left < right) {
                    left = 0;
                    windowSize++;
                    right = left + windowSize;
                    sum = 0;
                }
                else {
                    left++;
                    right++;
                    sum = 0;
                }
                continue;
            }
        }

        return minLength;
    }
}