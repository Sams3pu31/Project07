package org.example.selectionsort;
import static org.example.selectionsort.CountOperation.countOperations;

public class SelectionSort {
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            int min = countOperations(arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
                int operations = countOperations(arr[j]);
                if (operations < min) {
                    pos = j;
                    min = operations;
                }
            }
            String temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }}}
