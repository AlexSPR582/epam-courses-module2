package by.epam.courses.module2.array.task1;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayTask1 task1 = new ArrayTask1();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createPlusRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println(task1.sumMultipleNumber(3, array));
    }
}
