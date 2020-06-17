package vn.edu.funix.algo.sort;

public class Merge {
    public static int[] sort(int[] inputArr) {
        int[] arr = inputArr.clone();
        if (arr.length <= 1) return arr;

        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start == end) return;

        int middle = Math.floorDiv(start + end, 2);
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);
        merge(arr, start, middle, end);
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        int[] sortedArr = new int[end - start + 1];
        int i = -1;
        int idx1 = start;
        int idx2 = middle + 1;

        while (++i < sortedArr.length) {
            if (idx1 == middle+1) {
                sortedArr[i] = arr[idx2];
                idx2++;
                continue;
            }

            if (idx2 == end+1) {
                sortedArr[i] = arr[idx1];
                idx1++;
                continue;
            }

            if (arr[idx1] < arr[idx2]) {
                sortedArr[i] = arr[idx1];
                idx1++;
            } else {
                sortedArr[i] = arr[idx2];
                idx2++;
            }
        }

        for (i = 0; i < sortedArr.length; i++) {
            arr[start+i] = sortedArr[i];
        }
    }
}
