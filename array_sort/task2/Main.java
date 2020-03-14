package by.epam.courses.module2.array_sort.task2;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask2 task2 = new ArraySortTask2();
        ArrayLogic arrLog = ArrayLogic.getInstance();

        int[] array1 = arrLog.createRandomArray(4);
        int[] array2 = arrLog.createRandomArray(5);

        System.out.println("Исходные массивы:");
        arrLog.printArray(array1);
        arrLog.printArray(array2);

        System.out.println("Результат выполнения программы:");
        arrLog.printArray(task2.combineArrays(array1, array2));
    }
}
