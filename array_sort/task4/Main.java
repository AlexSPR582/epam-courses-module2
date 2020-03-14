package by.epam.courses.module2.array_sort.task4;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask4 task4 = new ArraySortTask4();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(10);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("Отсортированный массив:");
        arrLog.printArray(task4.bubbleSort(array));

        System.out.println("Количество перестарновок: " + task4.getPermutation());
    }
}
