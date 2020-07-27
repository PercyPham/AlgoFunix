package vn.edu.funix.algo;

import vn.edu.funix.algo.sort.Heap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
//        int[] arr = {};
//        int[] arr = {1,7,4,5,2,3,6};
        int[] arr = {20, 12, 25, 6, 10, 15, 13};
        System.out.println(Arrays.toString(Heap.sort(arr)));
    }

}
