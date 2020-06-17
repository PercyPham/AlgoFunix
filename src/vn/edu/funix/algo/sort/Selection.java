package vn.edu.funix.algo.sort;

public class Selection {
    public static int[] sort(int[] inputArr) {
        int[] arr = inputArr.clone();

        int sortIdx = 0;
        while (sortIdx < arr.length) {
            int smallestIdx = sortIdx;

            for (int i = sortIdx; i < arr.length; i++) {
                if (arr[i] < arr[smallestIdx]) {
                    smallestIdx = i;
                }
            }

            if (sortIdx != smallestIdx) {
                Util.swap(arr, sortIdx, smallestIdx);
            }

            sortIdx++;
        }
        return arr;
    }
}
