package org.example.insertionsort;


public class CountViowels {
    public static int countVowels(String word) {
        int count = 0;
//        устанавливаю гласные буквы по которым будет сортировка, не уверена, что именно так нужно, но других идей не
//        пришло в голову
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}