package com.mruruc;

public class CheckArraySorted {

    public static boolean check(int[] arr){
       int counter=0;
       int index=1;
       while(counter != arr.length && index!= arr.length){
           if(arr[counter]<arr[index]){
               counter++;
               index++;
           }
           else{
               return false;
           }
       }
       return true;
    }

    public static boolean check2(int[] arr,int index){
       if(index == arr.length-1){
           return true;
       }
       return arr[index] < arr[index+1] && check2(arr,index + 1);
    }

}
