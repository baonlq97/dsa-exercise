package leetcode;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var largestPos1 = m - 1;
        var largestPos2 = n - 1;
        var largestPos = m + n - 1;
        
        while (largestPos > 0) {
            if (largestPos1 >= 0 && largestPos2 >= 0) {
                if (nums1[largestPos1] >= nums2[largestPos2]) {
                    nums1[largestPos] = nums1[largestPos1];
                    largestPos1 -= 1;
                }
                else {
                    nums1[largestPos] = nums2[largestPos2];
                    largestPos2 -= 1;
                }
            }
            else if (largestPos1 >= 0) {
                nums1[largestPos] = nums1[largestPos1];
                largestPos1 -= 1;
            }
            else {
                nums1[largestPos] = nums2[largestPos2];
                largestPos2 -= 1;
            }
            largestPos -= 1;
        }
    }
}
