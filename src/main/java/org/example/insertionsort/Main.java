package org.example.insertionsort;

import java.util.Arrays;

import static org.example.insertionsort.InsertionSort.insertionSort;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        System.out.println("Исходный список: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Отсортированный список: " + Arrays.toString(arr));
    }}
