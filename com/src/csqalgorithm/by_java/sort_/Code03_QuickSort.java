package com.src.csqalgorithm.by_java.sort_;

/**
 * @author C77eric
 * @version 1.0
 */
public class Code03_QuickSort {
    public static void quickSort(int[] arr){
        if(arr == null || arr.length == 0) return;

        process(arr,0,arr.length - 1);
    }

    public static void process(int[] arr,int L,int R){
        if(L < R){
            swap(arr,L + (int)Math.random() * (R - L + 1),R);
            int[] p = partition(arr,L,R);
            process(arr,L,p[0] - 1);
            process(arr,p[1] + 1,R);
        }
    }

    public static int[] partition(int[] arr, int L,int R){
        int less = L - 1;
        int more = R;
        while(L < more){
            if(arr[L] < arr[R]){
                swap(arr,++less,L++);
            } else if(arr[L] > arr[R]){
                swap(arr,more--,L);
            } else {
                L++;
            }
        }
        swap(arr,more,R);
        return new int[]{less + 1,more};
    }


    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
