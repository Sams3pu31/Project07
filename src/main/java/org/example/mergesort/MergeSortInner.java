package org.example.mergesort;

public class MergeSortInner {
    public static void mergeSortInner(String[] buffer1, String[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        mergeSortInner(buffer1, buffer2, startIndex, middle);
        mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;

        while (index1 < middle && index2 < endIndex) {
            if (buffer1[index1].length() < buffer1[index2].length()) {
                buffer2[destIndex] = buffer1[index1];
                destIndex++;
                index1++;
            } else {
                buffer2[destIndex] = buffer1[index2];
                destIndex++;
                index2++;
            }
        }

        while (index1 < middle) {
            buffer2[destIndex] = buffer1[index1];
            destIndex++;
            index1++;
        }

        while (index2 < endIndex) {
            buffer2[destIndex] = buffer1[index2];
            destIndex++;
            index2++;
        }

        System.arraycopy(buffer2, startIndex, buffer1, startIndex, endIndex - startIndex);
    }
}