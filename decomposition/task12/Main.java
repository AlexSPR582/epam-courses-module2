package by.epam.courses.module2.decomposition.task12;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        DecompositionTask12 task12 = new DecompositionTask12();
        arrLog.printArray(task12.createResultArray(7, 50));
    }
}
