package leetcode;

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // var products = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     var product = 1;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (i != j) {
        //             product *= nums[j];
        //         }
        //     }
        //     products[i] = product;
        // }
        // return products;

        // This is the optimal prefix postfix
        // int n = nums.length;
        // int[] res = new int[n];

        // res[0] = 1;
        // for (int i = 1; i < n; i++) {
        //     res[i] = res[i - 1] * nums[i - 1];
        // }
        
        // int postfix = 1;
        // first need to keep the last prefix element because the 
        // the end element alway * with 1.
        // for (int i = n - 1; i >= 0; i--) {
        //     res[i] *= postfix;
        // this calculate the multiplied postfix before multiple with prefix
        //     postfix *= nums[i];
        // }
        // return res;

        // Try the normal prefix - postfix
        
        int n = nums.length;
        int[] product = new int[n];
        int[] prefix = new int[n];
        int[] postfix = new int[n];

        prefix[0] = postfix[n - 1] = 1;
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i > 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i <= n; i++)  {
            product[i] = prefix[i] * postfix[i];
        }

        return product;
    }
}
