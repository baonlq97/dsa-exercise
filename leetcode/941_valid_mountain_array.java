package leetcode;

class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        var firstUp = false;
        var thenDown = false;
        if (arr.length == 1) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (thenDown == true) {
                    return false;
                }
                firstUp = true;
                continue;
            } else {
                if (firstUp) {
                    thenDown = true;
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (firstUp && thenDown) {
            return true;
        }
        return false;
    }
}
