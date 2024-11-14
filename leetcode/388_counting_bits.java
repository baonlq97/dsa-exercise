package leetcode;

import java.util.HashMap;

class CountingBit {
    HashMap<Integer, Integer> lookUp = new HashMap<Integer, Integer>();
    
    public int[] countBits(int n) {
        var ans = [0] * (n + 1)
        var offset = 1
        for (int i = 1; i < n + 1; i++)
            if (offset * 2 == i)
                offset *= 2
            ans[i] = ans[i - offset] + 1
        return ans
    }
}
