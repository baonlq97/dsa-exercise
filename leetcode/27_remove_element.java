package leetcode;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        var c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }

        return c;
    }
}
