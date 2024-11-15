package leetcode;

import java.util.HashMap;

class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater testCase = new TrappingRainWater();
        testCase.trap(new int[] { 5,4,1,2 });
    }

    public int trap(int[] height) {
        // NOTE: This is too complicated
        // var p1 = 0;
        // var p2 = 1;
        // var p3 = 2;
        // var tempP3 = p3;
        // var currentTrap = 0;
        // var total = 0;
        // if (height.length == 1 || height.length == 2) {
        // return 0;
        // }
        // while (p1 < height.length - 1 && p2 < height.length - 1) {
        // if (height[p2] >= height[p1]) {
        // p1 = p2;
        // p2++;
        // p3 = p2 + 1;
        // if (p3 == height.length - 1) {
        // break;
        // }
        // continue;
        // } else {
        // while (p3 < height.length) {
        // if (p3 == height.length -1) {
        // if (height[p3] > height[p2] && height[p3] <= height[p1]) {
        // p1++;
        // p2++;
        // p3 = p2 + 1;
        // continue;
        // }
        // if (height[p3] >= height[p1]) {
        // tempP3 = p3;
        // break;
        // }
        // }
        // if (height[p3] > height[p2]) {
        // if (height[p3] >= height[p1]) {
        // tempP3 = p3;
        // break;
        // } else {
        // if (height[p3] > height[tempP3]) {
        // tempP3 = p3;
        // }
        // p3++;
        // continue;
        // }
        // } else {
        // tempP3 = p3;
        // p3++;
        // continue;
        // }
        // }

        // if (height[p1] < height[tempP3]) {
        // currentTrap = height[p1] - height[p2];
        // } else {
        // currentTrap = height[tempP3] - height[p2];
        // }
        // total += currentTrap;
        // p2++;
        // continue;
        // }
        // }
        // return total;

        // Use two pointer to track leftmost and rightmost boundaries
        // if (height == null || height.length < 3)
        //     return 0;

        // int left = 0, right = height.length - 1;
        // int left_max = 0, right_max = 0;
        // int total = 0;

        // while (left < right) {
        //     if (height[left] < height[right]) {
        //         if (height[left] >= left_max) {
        //             left_max = height[left];
        //         } else {
        //             total += left_max - height[left];
        //         }
        //         left++;
        //     } else {
        //         if (height[right] >= right_max) {
        //             right_max = height[right];
        //         } else {
        //             total += right_max - height[right];
        //         }
        //         right--;
        //     }
        // }
        // return total;

        // Use array to track leftmost and rightmost boundaries of current index
        var n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int res = 0;
        for(int i = 0; i < n - 1; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return res;
    }
}
