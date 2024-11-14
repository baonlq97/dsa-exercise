package leetcode;

import java.util.HashMap;

class FibonacciNumber {
    HashMap<Integer, Integer> lookupMap = new HashMap<Integer, Integer>();

    public int fib(int n) {
        // Use Dynamic Programming: Top-down approach
        if (lookupMap.containsKey(n)) {
            return lookupMap.get(n);
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            lookupMap.put(n, fib(n - 1) + fib(n - 2));
            return lookupMap.get(n);
        }
    }
}
