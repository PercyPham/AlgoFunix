package vn.edu.funix.algo.sort;

class Util {
    protected static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx2];
        arr[idx2] = arr[idx1];
        arr[idx1] = temp;
    }
}
