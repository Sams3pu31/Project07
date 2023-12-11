package org.example.selectionsort;
import java.util.Arrays;
import static org.example.selectionsort.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        String[] formulas = {
                "5+6+32=43",
                "1+1=2",
                "(3+5)*4*21=483",
                "((21-20)*(32-30))/2=1"
        };

        System.out.println("Исходный список формул: " + Arrays.toString(formulas));
        selectionSort(formulas);
        System.out.println("Отсортированный список формул: " + Arrays.toString(formulas));
    }
}
