package vn.edu.funix.algo.sort;

import java.util.Arrays;

public class Heap {
    public static int[] sort(int[] inputArr) {
        int[] arr = inputArr.clone();

        heapify(arr, arr.length);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            Util.swap(arr, 0, i);
            reorgNodeInHeap(arr, i, 0);
        }

        return arr;
    }

    private static void heapify(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int current = i;
            boolean isLeft = current % 2 == 1;
            int parent = isLeft ? (current - 1)/2 : (current-2)/2;

            while (parent >= 0 && arr[current] > arr[parent]) {
                Util.swap(arr, current, parent);
                current = parent;
                isLeft = current % 2 == 1;
                parent = isLeft ? (current - 1)/2 : (current-2)/2;
            }
        }
    }

    /** i is the index of node needed to be reorganized */
    private static void reorgNodeInHeap(int[] arr, int heapLen, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < heapLen && arr[largest] < arr[left]) largest = left;

        if (right < heapLen && arr[largest] < arr[right]) largest = right;

        if (largest != i) {
            Util.swap(arr, largest, i);
            reorgNodeInHeap(arr, heapLen, largest);
        }
    }
}
