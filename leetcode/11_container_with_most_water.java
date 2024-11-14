package leetcode;

class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater testCase = new ContainerWithMostWater();
        testCase.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
    }

    public int maxArea(int[] height) {
        var l = 0;
        var r = height.length - 1;
        var result = 0;
        var max = 0;
        while (l < r) {
            var width = r - l;
            if (height[l] < height[r]) {
                max = height[l] * width;
                l++;
            }
            else {
                max = height[r] * width;
                r--;
            }
            if (max >= result) {
                result = max;
            }
        }
        return result;
    }
}
