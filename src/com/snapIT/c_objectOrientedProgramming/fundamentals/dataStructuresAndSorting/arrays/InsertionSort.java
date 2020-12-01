package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.arrays;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1,3,354,64,364,64,3,4,74,2,46};
        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sort looks as follows: ");
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] arr) {
        int num = arr.length;
        for(int i = 1; i < num; i++) {
            int k = arr[i];                     // grabs the element value ahead of j
            int j = i -1;                       // grabs the element before k
            while (j >= 0 && arr[j] > k) {      // while j is greater than 0 and K is less than the previous
                arr[j + 1] = arr[j];            // this loop takes us in a backwards check
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }
}
