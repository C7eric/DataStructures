package com.src.csqalgorithm.by_java.sort_;

/**
 * @author C77eric
 * @version 1.0
 */
public class Code01_BubbleSort {
    public static void bubbleSort(int []arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] > arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
