package com.src.csqalgorithm.by_java.sort_;

/**
 * @author C77eric
 * @version 1.0
 */
public class Code05_InsertSort {
    public static void insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr,j,j+1);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
