package com.mruruc;

import java.util.Arrays;

public class MergeSortInPlace {

    //merge sort in place:
    public static void sort(int[] arr,int start,int end){
        //base condition:
        if(end-start==1){
            return;
        }
        // Calculate the middle index of the subarray
        int middle= (start + end) / 2;
        //divide array two half:
        //left half of array:
        sort(arr,start,middle);
        //right half of array:
        sort(arr,middle,end);
        merge(arr,start,middle,end);
    }

    private static void merge(int[] arr,int start,int middle,int end){
        int[] temp=new int[end-start];

        int leftIndex = start;
        int rightIndex = middle;
        int tempIndex = 0;

        // Merge the two sorted subarrays into the temporary array
        while (leftIndex < middle && rightIndex < end) {
            if (arr[leftIndex] < arr[rightIndex]) {
                temp[tempIndex] = arr[leftIndex];
                leftIndex++;
            } else {
                temp[tempIndex] = arr[rightIndex];
                rightIndex++;
            }
            tempIndex++;
        }
        // If there are remaining elements in the left subarray, copy them to the temporary array
        while (leftIndex < middle) {
            temp[tempIndex] = arr[leftIndex];
            leftIndex++;
            tempIndex++;
        }

        // If there are remaining elements in the right subarray, copy them to the temporary array
        while (rightIndex < end) {
            temp[tempIndex] = arr[rightIndex];
            rightIndex++;
            tempIndex++;
        }

        // Copy the merged elements from the temporary array back into the original array:
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr={5,2,9,0,-1,8};
        sort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
