package vn.edu.funix.algo.sort;

public class Bubble {
    public static int[] sort(int[] inputArr) {
        int[] arr = inputArr.clone();

        for (int lastNum = arr.length; lastNum > 0; lastNum--) {
            for (int i = 0; i < lastNum - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }
}
