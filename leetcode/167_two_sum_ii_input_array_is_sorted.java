package leetcode;

class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        TwoSumInputArrayIsSorted testCase = new TwoSumInputArrayIsSorted();
        testCase.twoSum(new int[] {2,3,4}, 6);
    }
    public int[] twoSum(int[] numbers, int target) {
        var result = new int[2];
        var left = 0;
        var right = numbers.length - 1;
        var total = 0;
        while (left < right) {
            total = numbers[left] + numbers[right];
            if (total > target) {
                right--;
                continue;
            }
            else if (total < target) {
                left++;
                continue;
            }
            else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }
        return result;
    }
}
