package leetcode;

class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        // var currentIndex = 0;
        var currentMaxIndex = 0;
        var max = 0;
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        currentMaxIndex = j;
                    }
                }
                arr[i] = arr[currentMaxIndex];
                max = 0;
            }
            arr[arr.length - 1] = -1;
        }
        return arr;
    }
}
