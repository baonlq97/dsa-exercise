package leetcode;

class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        var reversedBits = 0;
        for (int i = 0; i < 32; i++) {
            // shift left one digit to make sure not override the reversed bit
            reversedBits <<= 1;
            // insert the last digit from n to reversedBits
            // (n & 1) will get only the last degit from n
            reversedBits = reversedBits | (n & 1);
            // shift right to remove the inserted digit from n, which is already inserted to reversedBits
            n >>= 1;
        }
        return reversedBits;
    }
}