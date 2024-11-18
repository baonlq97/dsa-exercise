package leetcode;

class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock testCase = new BestTimeToBuyAndSellStock();
        testCase.maxProfit(new int[] {1, 2, 4});
    }
    public int maxProfit(int[] prices) {
        var max = 0;
        int p1 = 0, p2 = 1;

        if (prices.length == 2) {
            if (prices[p2] > prices[p1]) {
                max = prices[p2] - prices[p1];
            }
            return max;
        }

        while (p1 < p2 && p2 < prices.length) {
            if (prices[p1] >= prices[p2]) {
                p1 = p2;
                p2++;
                continue;
            }
            else {
                var profit = prices[p2] - prices[p1];
                if (max < profit) {
                    max = profit;
                }
                p2++;
                continue;
            }
        }
        return max;
    }
}
