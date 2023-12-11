package org.example.selectionsort;
public class CountOperation {
    public static int countOperations(String formula) {
        int count = 0;
        for (char c : formula.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                count++;
            }
        }
        return count;
    }
}
