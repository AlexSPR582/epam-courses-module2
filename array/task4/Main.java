package by.epam.courses.module2.array.task4;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayTask4 task4 = new ArrayTask4();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);
        task4.printArray(task4.swapMinMaxElement(array));
    }
}
