package by.epam.courses.module2.array_sort.task1;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask1 task1 = new ArraySortTask1();
        ArrayLogic arrLog = ArrayLogic.getInstance();

        int[] firstArray = arrLog.createRandomArray(5);
        int[] secondArray = arrLog.createRandomArray(4);

        System.out.println("Исхдные массивы:");
        arrLog.printArray(firstArray);
        arrLog.printArray(secondArray);

        System.out.println("Результат выполнения программы:");
        arrLog.printArray(task1.insertArray(2, firstArray, secondArray));
    }
}
