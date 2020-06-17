package vn.edu.funix.algo.sort;

public class Quick {
    public static int[] sort(int[] inputArr) {
        int[] arr = inputArr.clone();
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = end;
        int left = start;
        int right = end - 1;

        while (left < right) {
            while (arr[left] < arr[pivot]) {
                left++;
                if (left == pivot) return pivot; // pivot already is biggest
            }
            while (right > left && arr[right] >= arr[pivot]) {
                right--;
            }
            if (left < right) Util.swap(arr, left, right);
        }

        // Here: left == right
        Util.swap(arr, left, pivot);
        pivot = left;
        return pivot;
    }
}
