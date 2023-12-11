package org.example.mergesort;
import java.util.Arrays;

import static org.example.mergesort.MergeSortInner.mergeSortInner;

public class MergeSort {
    public static void mergeSort(String[] arr) {
        if (arr == null || arr.length <= 1) return;

        String[] buffer1 = Arrays.copyOf(arr, arr.length);
        String[] buffer2 = new String[arr.length];

        mergeSortInner(buffer1, buffer2, 0, arr.length);
        System.arraycopy(buffer1, 0, arr, 0, arr.length);
    }}




