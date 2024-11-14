package leetcode;

class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater testCase = new TrappingRainWater();
        testCase.trap(new int[] { 0,1,0,2,1,0,1,3,2,1,2,1 });
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
        //     return 0;
        // }
        // while (p1 < height.length - 1 && p2 < height.length - 1) {
        //     if (height[p2] >= height[p1]) {
        //         p1 = p2;
        //         p2++;
        //         p3 = p2 + 1;
        //         if (p3 == height.length - 1) {
        //             break;
        //         }
        //         continue;
        //     } else {
        //         while (p3 < height.length) {
        //             if (p3 == height.length -1) {
        //                 if (height[p3] > height[p2] && height[p3] <= height[p1]) {
        //                     p1++;
        //                     p2++;
        //                     p3 = p2 + 1;
        //                     continue;
        //                 }
        //                 if (height[p3] >= height[p1]) {
        //                     tempP3 = p3;
        //                     break;
        //                 }
        //             }
        //             if (height[p3] > height[p2]) {
        //                 if (height[p3] >= height[p1]) {
        //                     tempP3 = p3;
        //                     break;
        //                 } else {
        //                     if (height[p3] > height[tempP3]) {
        //                         tempP3 = p3;
        //                     }
        //                     p3++;
        //                     continue;
        //                 }
        //             } else {
        //                 tempP3 = p3;
        //                 p3++;
        //                 continue;
        //             }
        //         }

        //         if (height[p1] < height[tempP3]) {
        //             currentTrap = height[p1] - height[p2];
        //         } else {
        //             currentTrap = height[tempP3] - height[p2];
        //         }
        //         total += currentTrap;
        //         p2++;
        //         continue;
        //     }
        // }
        // return total;
    }
}
