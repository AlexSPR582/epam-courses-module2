package by.epam.courses.module2.matrix.task11;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask11 task11 = new MatrixTask11();
        int[][] matrix = task11.createMatrix();

        System.out.println("Исходная матрица");
        arrLog.printMatrix(matrix);

        System.out.println("Номера строк где число 5 встречается 3 и более раз:");
        arrLog.printArray(task11.findRows(matrix));
    }
}
