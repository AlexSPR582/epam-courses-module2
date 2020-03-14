package by.epam.courses.module2.decomposition.task5;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(6);
        DecompositionTask5 task5 = new DecompositionTask5();

        System.out.println("Исходный массив:");
        arrLog.printArray(array);
        System.out.println("Второе по величине число: " + task5.findSecondMax(array));
    }
}
