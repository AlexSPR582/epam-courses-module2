package by.epam.courses.module2.decomposition.task14;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        DecompositionTask14 task14 = new DecompositionTask14();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        arrLog.printArray(task14.findArmstrongNumbers(10000));
    }
}
