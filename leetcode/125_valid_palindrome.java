package leetcode;

class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome testCase = new ValidPalindrome();
        testCase.isPalindrome("0P");
    }

    public boolean isPalindrome(String s) {
        // var wordOnly = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // if (wordOnly.isEmpty()) {
        // return true;
        // }
        // var i = 0;
        // var j = wordOnly.length() - 1;
        // while (i < j) {
        // if (wordOnly.charAt(i) != wordOnly.charAt(j)) {
        // return false;
        // }
        // i++;
        // j--;
        // }
        var i = 0;
        var j = s.length() - 1;
        Character leftChar = null;
        Character rightChar = null;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            leftChar = Character.toLowerCase(s.charAt(i));
            rightChar = Character.toLowerCase(s.charAt(j));

            if (leftChar != rightChar) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
