package org.example.bubblesort;

class Main {
    public static void main(String[] args) {
        String[][] students = {
                {"Иванов", "4.5"},
                {"Петров", "3.7"},
                {"Сидоров", "4.2"},
                {"Козлов", "5.0"},
                {"Смирнов", "3.9"}
        };

        int n = students.length;
        double[][] studentScores = new double[n][2];
        for (int g = 0; g < n; g++) {
            studentScores[g][0] = Double.parseDouble(students[g][1]);
            studentScores[g][1] = g;
        }

        BubbleSort.bubbleSort(studentScores);

        System.out.println("Список студентов по убыванию среднего балла:");
        for (int g = 0; g < n; g++) {
            int originalIndex = (int) studentScores[g][1];
            System.out.println(students[originalIndex][0] + ": " + studentScores[g][0]);
        }
    }
}