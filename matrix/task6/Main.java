package by.epam.courses.module2.matrix.task6;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask6 task6 = new MatrixTask6();
        arrLog.printMatrix(task6.createSquareMatrix(10));
    }
}
