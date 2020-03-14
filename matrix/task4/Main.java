package by.epam.courses.module2.matrix.task4;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        MatrixTask4 task4 = new MatrixTask4();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        arrLog.printMatrix(task4.createSquareMatrix(6));
    }
}
