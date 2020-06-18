package vn.edu.funix.algo.sort;

public class Shell {
    /** For medium size sorting, up to 2000 */
    public static int[] sort(int[] inputArr) {
        int[] arr = inputArr.clone();

        int biggestGap = getBiggestKnuthSeqNumFor(arr.length);

        for (int gap = biggestGap; gap > 0; gap = getSmallerKnuthSeqNum(gap)) {
            // Do insertion sort for gaped array
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }

        return arr;
    }

    private static int getSmallerKnuthSeqNum(int gap) {
        // Knuth Sequence formula: gap = 3h + 1
        int h = (gap - 1) / 3;
        return 3*(h -1) + 1;
    }

    private static int getBiggestKnuthSeqNumFor(int length) {
        // Knuth Sequence formula: gap = 3h + 1
        int h = (length - 1) % 3;
        return 3*h + 1;
    }
}
