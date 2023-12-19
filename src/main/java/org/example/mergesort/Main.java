package org.example.mergesort;

import java.util.Arrays;

import static org.example.mergesort.MergeSort.mergeSort;

public class Main {    public static void main(String[] args) {
    String[] arr = {"cat", "orange", "elephant", "bird"};
    System.out.println("Исходный массив: " + Arrays.toString(arr));

    mergeSort(arr);

    System.out.println("Отсортированный массив: " + Arrays.toString(arr));
}}

