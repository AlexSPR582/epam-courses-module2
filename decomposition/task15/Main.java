package by.epam.courses.module2.decomposition.task15;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        DecompositionTask15 task15 = new DecompositionTask15();
        arrLog.printArray(task15.findIncreaseNumbers(5));
    }
}
