package com.mruruc;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort.heapSort(arr);

        System.out.println("Sorted array is");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
