package leetcode;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        var count = 0;
        var fixedPosition = 0;

        if (nums.length <= 0) 
            return 0;

        count = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[fixedPosition]) {
                fixedPosition += 1;
                nums[fixedPosition] = nums[i];
                count += 1;
            }
        }

        return count;
    }
}
