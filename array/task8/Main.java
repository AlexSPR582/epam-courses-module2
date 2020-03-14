package by.epam.courses.module2.array.task8;

public class Main {
    public static void main(String[] args) {
        ArrayTask8 task8 = new ArrayTask8();
        int[] array = {4, 7, 5, 4, 9};
        task8.printArray(task8.createArrayWithoutMinElement(array));
    }
}
