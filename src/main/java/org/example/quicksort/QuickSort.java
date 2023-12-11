package org.example.quicksort;
import java.util.Arrays;
public class QuickSort {
    public static void quickSort(String[] arr, int low, int high) {
        if (arr.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        String border = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i].compareTo(border) < 0) {
                i++;
            }
            while (arr[j].compareTo(border) > 0) {
                j--;
            }
            if (i <= j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                System.out.println(Arrays.toString(arr));
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }}

