package org.example.insertionsort;

import java.util.Arrays;

import static org.example.insertionsort.CountViowels.countVowels;

public class InsertionSort {


    public static void insertionSort(String[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            String swap = arr[i];
            for (j = i; j > 0 && countVowels(swap) < countVowels(arr[j - 1]); j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;
            System.out.println(Arrays.toString(arr));
        }
    }}


