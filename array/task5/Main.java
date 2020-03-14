package by.epam.courses.module2.array.task5;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayTask5 task5 = new ArrayTask5();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createPlusRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);
        task5.printElementsBiggerThanIndex(array);
    }
}
