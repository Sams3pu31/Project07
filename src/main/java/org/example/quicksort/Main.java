package org.example.quicksort;

import java.util.Arrays;

import static org.example.quicksort.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "grape", "banana"};
        System.out.println(Arrays.toString(arr) + " - несортированный массив");
        System.out.println("___Сортировка массива___");
        quickSort(arr, 0, arr.length - 1);
        System.out.println("___Сортировка массива закончена___");
        System.out.println(Arrays.toString(arr) + " - отсортированный массив");
    }
}
