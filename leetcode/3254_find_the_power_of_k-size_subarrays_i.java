package leetcode;

class FindThePowerOfKSizeSubarraysI {
    public static void main(String[] args) {
        FindThePowerOfKSizeSubarraysI testCase = new FindThePowerOfKSizeSubarraysI();
        testCase.resultsArray(new int[] { 3,2,3,2,3,2 }, 2);
    }

    public int[] resultsArray(int[] nums, int k) {
        var n = nums.length;
        var resultPair = 0;

        if (k == 1) {
            return nums;
        }

        if (n < k) {
            return new int[] { -1 };
        }

        for (int i = 0; i <= nums.length - k; i++) {
            resultPair += 1;
        }

        
        var result = new int[resultPair];

        var l = 0;
        var r = l + k;
        var pos = 0;
        var maxVal = 0;

        while (r <= n) {
            for (int i = l; i < r - 1; i++) {
                if (nums[i] == nums[i + 1] - 1) {
                    maxVal = nums[i + 1]; 
                    continue;
                }
                else {
                    maxVal = -1;
                    break;
                }
            }
            result[pos] = maxVal;
            pos++;
            l++;
            r++;
        }

        return result;
    }
}
