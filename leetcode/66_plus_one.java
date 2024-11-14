package leetcode;

class PlusOne {
    public int[] plusOne(int[] digits) {
        var results = digits;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                if (i == 0) {
                    results = new int[results.length + 1];
                    results[0] = 1;
                    break;
                }
                results[i] = 0;
                continue;
            }
            else {
                results[i] = digits[i] + 1;
                break;
            }
        }
        return results;
    }
}
