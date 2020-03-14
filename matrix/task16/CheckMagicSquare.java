package by.epam.courses.module2.matrix.task16;

public class CheckMagicSquare {
    public boolean check(int[][] matrix) {
        int magicSum = sumRow(0, matrix);
        for (int i = 0; i < matrix.length; i++) {
            if (sumColumn(i, matrix) != magicSum || sumRow(i, matrix) != magicSum) {
                return false;
            }
        }
        if (sumMainDiagonal(matrix) != magicSum || sumSideDiagonal(matrix) != magicSum) {
            return false;
        }
        return true;
    }


    private int sumRow(int row, int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }

    private int sumColumn(int column, int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        return sum;
    }

    private int sumMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private int sumSideDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }
}
