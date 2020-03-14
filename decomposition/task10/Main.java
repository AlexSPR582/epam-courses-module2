package by.epam.courses.module2.decomposition.task10;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        DecompositionTask10 task10 = new DecompositionTask10();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        arrLog.printArray(task10.createArrayNumber(2001));
        arrLog.printArray(task10.createArrayNumber(24570));
    }
}
