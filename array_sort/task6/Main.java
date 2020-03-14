package by.epam.courses.module2.array_sort.task6;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask6 task6 = new ArraySortTask6();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        double[] array = {5.4, 3.2, 7.2, 8.1, 1.5};

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("Отсортированный массив:");
        arrLog.printArray(task6.shellSort(array));
    }
}
