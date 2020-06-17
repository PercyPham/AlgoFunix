package vn.edu.funix.algo.sort;

public class Insertion {
    public static int[] sort(int[] inputArr) {
        int[] arr = inputArr.clone();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        return arr;
    }
}
