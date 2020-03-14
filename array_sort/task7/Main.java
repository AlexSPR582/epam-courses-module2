package by.epam.courses.module2.array_sort.task7;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask7 task7 = new ArraySortTask7();
        ArrayLogic arrLog = ArrayLogic.getInstance();

        int[] array1 = task7.sort(arrLog.createRandomArray(5));
        int[] array2 = task7.sort(arrLog.createRandomArray(7));

        System.out.println("Исходные массивы:");
        arrLog.printArray(array1);
        arrLog.printArray(array2);

        System.out.println("Индексы куда нужно вставить элементы второго массива");
        arrLog.printArray(task7.getInsertIndex(array1, array2));
    }
}
