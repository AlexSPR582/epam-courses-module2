package by.epam.courses.module2.matrix.task16;

import by.epam.courses.module2.array_logic.ArrayLogic;
import by.epam.courses.module2.matrix.task16.magic_square.MagicSquare;

public class Main {
    public static void main(String[] args) {
        CheckMagicSquare cms = new CheckMagicSquare();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MagicSquare ms = new MagicSquare();
        int[][] magic = ms.createMagicSquare(3);
        int[][] magic2 = ms.createMagicSquare(4);
        arrLog.printMatrix(magic);
        System.out.println(cms.check(magic));
        arrLog.printMatrix(magic2);
        System.out.println(cms.check(magic2));
    }
}
